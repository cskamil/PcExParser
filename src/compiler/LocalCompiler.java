package compiler;

import entity.Compilable;
import parser.Language;

import javax.tools.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by cskamil on 19-Jun-17.
 */
public class LocalCompiler implements Compiler {

    private static String INFINITE_LOOP_ERROR = "Your program has an infinite loop";

    public static void main(String args[]) throws Exception {
        new LocalCompiler().runPython(null);
    }

    @Override
    public Response run(Compilable program) throws Exception {
        if(program.getLanguage() == Language.JAVA) {
            return runJava(program);
        } else {
            return runPython(program);
        }
    }

    private Response runPython(Compilable program) throws Exception {

        String modifiedSourceCode = program.getSourceCode();
        Pattern p = Pattern.compile("input\\(.+\"\\)");
        Matcher m = p.matcher(program.getSourceCode());
        while(m.find()) {
            String matchedInputString = m.group();
            modifiedSourceCode = modifiedSourceCode.replace(matchedInputString, matchedInputString.substring(0, matchedInputString.length()-2) + "\\n" + matchedInputString.substring(matchedInputString.length()-2));
        }

        LocalRunResponse response = new LocalRunResponse();
        modifiedSourceCode = modifiedSourceCode.replaceAll("'", "\\\\'").replaceAll("\"", "'");
        ProcessBuilder builder = new ProcessBuilder("python", "-c", modifiedSourceCode);


        String[] inputs = program.getUserInput().split(" ");
        String input = Arrays.stream(inputs).collect(Collectors.joining("\n", "", "\n"));

        Process process = builder.start();

        try (OutputStream outputStream = process.getOutputStream()) {
            outputStream.write (input.getBytes());
            outputStream.flush();
        } catch(IOException e) { //If the process completes its execution, outputStream.write throws IOException.
        }

        boolean finished = process.waitFor(2L, TimeUnit.SECONDS);

        if(finished) {
            BufferedReader errReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            BufferedReader inReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String errorOutput = errReader.lines().collect(Collectors.joining("\n"));
            if(errorOutput.equals("")) {
                String output = inReader.lines().collect(Collectors.joining("\n"));
                response.setRunOutput(output);
            } else {
                response.setRunOutput(errorOutput);
            }

            errReader.close();
            inReader.close();
        } else {
            response.setRunOutput(INFINITE_LOOP_ERROR);
        }

        return response;
    }

    private Response runJava(Compilable program) throws Exception {
        LocalJavaCompileResponse compileResponse = compileJava(program);

        if(compileResponse.isCompiled()) {
            boolean hasInfiniteLoop = checkJavaInfiniteLoop(program);

            if(!hasInfiniteLoop) {
                return executeJava(compileResponse, program.getUserInput());
            } else {
                return new LocalRunResponse(INFINITE_LOOP_ERROR);
            }
        } else {
            return compileResponse;
        }
    }

    private LocalJavaCompileResponse compileJava(Compilable program) throws Exception {
        LocalJavaCompileResponse compileResponse = new LocalJavaCompileResponse();

        String sourceCode = program.getSourceCode();

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        String javaProgramName = program.getFileName().substring(0, program.getFileName().indexOf("."));

        JavaFileObject compilationUnit = new StringJavaFileObject(javaProgramName, sourceCode);

        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();

        SimpleJavaFileManager fileManager =
                new SimpleJavaFileManager(compiler.getStandardFileManager(diagnostics, null, null));

        StringWriter compilerWriter = new StringWriter();

        JavaCompiler.CompilationTask compilationTask = compiler.getTask(
                compilerWriter, fileManager, null, null, null, Arrays.asList(compilationUnit));

        Boolean compiled = compilationTask.call();

        compileResponse.setCompiled(compiled);
        if(!compiled) {
            compileResponse.setCompileOutput(compilerWriter.toString());
        } else {
            compileResponse.setFileManager(fileManager);
            compileResponse.setJavaProgramName(javaProgramName);
        }

        return compileResponse;
    }

    private boolean checkJavaInfiniteLoop(Compilable program) throws Exception {
        String sourceCode = program.getSourceCode();
        sourceCode = sourceCode.replaceAll("System.out.print", "System.out.print(\"\");//");

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        String javaProgramName = program.getFileName().substring(0, program.getFileName().indexOf("."));
        JavaFileObject compilationUnit = new StringJavaFileObject(javaProgramName, sourceCode);
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        SimpleJavaFileManager fileManager =
                new SimpleJavaFileManager(compiler.getStandardFileManager(diagnostics, null, null));
        JavaCompiler.CompilationTask compilationTask = compiler.getTask(
                null, fileManager, null, null, null, Arrays.asList(compilationUnit));

        compilationTask.call();
        CompiledClassLoader classLoader = new CompiledClassLoader(fileManager.getGeneratedOutputFiles());

        Class<?> codeGenTest = classLoader.loadClass(javaProgramName);
        Method main = codeGenTest.getMethod("main", String[].class);

        final ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Void> mainCallable = () -> {
            main.invoke(null, new Object[]{null});
            return null;
        };

        Future<Void> submit = null;

        try {
            System.setIn(new ByteArrayInputStream((program.getUserInput()).getBytes()));
             submit = executor.submit(mainCallable);
            submit.get(2L, TimeUnit.SECONDS);
            executor.shutdownNow(); // This does not cancel the already-scheduled task.
            submit.cancel(true);
        }
        catch (TimeoutException e) {
            submit.cancel(true);
            return true;
        } catch(Exception e) {
            //e.printStackTrace();
        } finally {
            executor.shutdownNow();
            submit.cancel(true);
        }

        return false;
    }

    private LocalRunResponse executeJava(LocalJavaCompileResponse compileResponse, String userInput) throws Exception {
        LocalRunResponse runResponse = new LocalRunResponse();
        CompiledClassLoader classLoader = new CompiledClassLoader(compileResponse.getFileManager().getGeneratedOutputFiles());

        Class<?> codeGenTest = classLoader.loadClass(compileResponse.getJavaProgramName());
        Method main = codeGenTest.getMethod("main", String[].class);

        try {
            runJavaMethodWithTimeout(main, runResponse, userInput, 2L, TimeUnit.SECONDS);
        } catch(InvocationTargetException e) {
            StringBuilder responseBuilder = new StringBuilder();
            responseBuilder.append(e.getTargetException().toString()).append("\n");
            responseBuilder.append(e.getTargetException().getStackTrace()[0].toString()).append("\n");

            runResponse.setRunOutput(responseBuilder.toString());
        }

        return runResponse;
    }

    private static void runJavaMethodWithTimeout(Method main, LocalRunResponse response, String userInput, long timeout, TimeUnit timeUnit) throws Exception {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayOutputStream executionStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(executionStream);

        final ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Void> mainCallable = () -> {
            main.invoke(null, new Object[]{null});
            return null;
        };

        Future<Void> submit = null;

        try {
            System.setOut(stream);
            System.setIn(new ByteArrayInputStream(userInput.getBytes()));

            submit = executor.submit(mainCallable);
            submit.get(timeout, timeUnit);
            executor.awaitTermination(timeout, timeUnit);
            executor.shutdownNow(); // This does not cancel the already-scheduled task.
            executor.shutdown();
            submit.cancel(true);
            response.setRunOutput(executionStream.toString());
        }
        catch (TimeoutException e) {
            submit.cancel(true);
            response.setRunOutput("Infinite Loop, please check your answer.");
        }
        catch (ExecutionException e) {
            submit.cancel(true);
            //unwrap the root cause
            Throwable t = e.getCause();
            if (t instanceof Error) {
                throw (Error) t;
            } else if (t instanceof Exception) {
                throw (Exception) t;
            } else {
                throw new IllegalStateException(t);
            }
        } finally {
            executor.shutdownNow();
            executionStream.close();
            submit.cancel(true);
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
    }


    private static class StringJavaFileObject extends SimpleJavaFileObject {
        private final String code;

        public StringJavaFileObject(String name, String code) {
            super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension),
                    Kind.SOURCE);
            this.code = code;
        }

        @Override
        public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
            return code;
        }
    }

    private static class ClassJavaFileObject extends SimpleJavaFileObject {
        private final ByteArrayOutputStream outputStream;
        private final String className;

        protected ClassJavaFileObject(String className, Kind kind) {
            super(URI.create("mem:///" + className.replace('.', '/') + kind.extension), kind);
            this.className = className;
            outputStream = new ByteArrayOutputStream();
        }

        @Override
        public OutputStream openOutputStream() throws IOException {
            return outputStream;
        }

        public byte[] getBytes() {
            return outputStream.toByteArray();
        }

        public String getClassName() {
            return className;
        }
    }

    public static class SimpleJavaFileManager extends ForwardingJavaFileManager {
        private final List<ClassJavaFileObject> outputFiles;

        protected SimpleJavaFileManager(JavaFileManager fileManager) {
            super(fileManager);
            outputFiles = new ArrayList<ClassJavaFileObject>();
        }

        @Override
        public JavaFileObject getJavaFileForOutput(Location location, String className, JavaFileObject.Kind kind, FileObject sibling) throws IOException {
            ClassJavaFileObject file = new ClassJavaFileObject(className, kind);
            outputFiles.add(file);
            return file;
        }

        public List<ClassJavaFileObject> getGeneratedOutputFiles() {
            return outputFiles;
        }
    }

    private static class CompiledClassLoader extends ClassLoader {
        private final List<ClassJavaFileObject> files;

        private CompiledClassLoader(List<ClassJavaFileObject> files) {
            this.files = files;
        }

        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            Iterator<ClassJavaFileObject> itr = files.iterator();
            while (itr.hasNext()) {
                ClassJavaFileObject file = itr.next();
                if (file.getClassName().equals(name)) {
                    itr.remove();
                    byte[] bytes = file.getBytes();
                    return super.defineClass(name, bytes, 0, bytes.length);
                }
            }
            return super.findClass(name);
        }
    }
}
