package compiler;

/**
 * Created by cskamil on 14-Jul-17.
 */
public class LocalRunResponse implements Response {

    private String runOutput;

    public LocalRunResponse() {
        this.runOutput = "";
    }
    public LocalRunResponse(String runOutput) {
        this.runOutput = runOutput;
    }

    @Override
    public String getOutput() {
        return runOutput;
    }
    public void setRunOutput(String runOutput) {
        this.runOutput = runOutput;
    }

}
