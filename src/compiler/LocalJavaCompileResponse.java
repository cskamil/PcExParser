package compiler;

/**
 * Created by cskamil on 18-Jul-17.
 */
public class LocalJavaCompileResponse implements Response{

    private String compileOutput;
    private boolean compiled;
    private String javaProgramName;
    private LocalCompiler.SimpleJavaFileManager fileManager;

    public String getCompileOutput() {
        return compileOutput;
    }

    public void setCompileOutput(String compileOutput) {
        this.compileOutput = compileOutput;
    }

    public boolean isCompiled() {
        return compiled;
    }

    public void setCompiled(boolean compiled) {
        this.compiled = compiled;
    }

    public String getJavaProgramName() {
        return javaProgramName;
    }

    public void setJavaProgramName(String javaProgramName) {
        this.javaProgramName = javaProgramName;
    }

    public LocalCompiler.SimpleJavaFileManager getFileManager() {
        return fileManager;
    }

    public void setFileManager(LocalCompiler.SimpleJavaFileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public String getOutput() {
        return getCompileOutput();
    }
}
