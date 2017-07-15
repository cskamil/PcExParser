package compiler;

import compiler.hackerearth.response.HackerEarthResponse;
import entity.Compilable;
import parser.Language;

import javax.tools.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by cskamil on 19-Jun-17.
 */
public class LocalCompiler implements Compiler {

    public static void main(String args[]) throws Exception {
        new LocalCompiler().run(null);
    }

    @Override
    public Response run(Compilable program) throws Exception {
        if(program.getLanguage() == Language.PYTHON) {
            return new HackerEarthResponse();
        }

        LocalResponse compileResponse = new LocalResponse();

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
        if(!compiled) {
            for (Diagnostic<? extends JavaFileObject> d : diagnostics.getDiagnostics()) {
                System.out.println(d.getKind() + ": " + d.toString());
            }
            compileResponse.setRunOutput(compilerWriter.toString());
            //System.out.println(compilerWriter);
        } else {
            CompiledClassLoader classLoader = new CompiledClassLoader(fileManager.getGeneratedOutputFiles());

            Class<?> codeGenTest = classLoader.loadClass(javaProgramName);
            Method main = codeGenTest.getMethod("main", String[].class);

            //TODO: comment-in after user input included
            //System.setIn(new ByteArrayInputStream(program.getInput().getBytes()));

            ByteArrayOutputStream executionStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(executionStream);

            PrintStream originalOut = System.out;
            System.setOut(stream);
            try {
                runWithTimeout(main, 3L, TimeUnit.SECONDS);
                //System.out.println(executionStream.toString());
                compileResponse.setRunOutput(executionStream.toString());
            } catch(InvocationTargetException e) {
                StringBuilder responseBuilder = new StringBuilder();
                responseBuilder.append(e.getTargetException().toString()).append("\n");
                responseBuilder.append(e.getTargetException().getStackTrace()[0].toString()).append("\n");

                //System.out.println(responseBuilder.toString());
                compileResponse.setRunOutput(responseBuilder.toString());
            }
            System.setOut(originalOut);
            executionStream.close();
        }

        return compileResponse;
    }

    public static void runWithTimeout(Method main, long timeout, TimeUnit timeUnit) throws Exception {
        final ExecutorService executor = Executors.newSingleThreadExecutor();
        final Future<Void> future = executor.submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                main.invoke(null, new Object[]{null});
                return null;
            }
        });
        executor.shutdown(); // This does not cancel the already-scheduled task.
        try {
            future.get(timeout, timeUnit);
        }
        catch (TimeoutException e) {
            System.out.println("Infinite Loop, please check your answer.");
        }
        catch (ExecutionException e) {
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
            future.cancel(true);
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

    private static class SimpleJavaFileManager extends ForwardingJavaFileManager {
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
