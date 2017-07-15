package compiler;

/**
 * Created by cskamil on 14-Jul-17.
 */
public class LocalResponse implements Response {

    private String runOutput;
    private String detailedOutput;

    @Override
    public String getRunOutput() {
        return runOutput;
    }

    @Override
    public String getDetailedOutput() {
        return detailedOutput;
    }

    public void setRunOutput(String runOutput) {
        this.runOutput = runOutput;
    }

    public void setDetailedOutput(String detailedOutput) {
        this.detailedOutput = detailedOutput;
    }
}
