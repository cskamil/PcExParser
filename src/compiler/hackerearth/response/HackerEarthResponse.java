package compiler.hackerearth.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import compiler.Response;

/**
 * Created by cskamil on 18-Jun-17.
 */
public class HackerEarthResponse implements Response{

    @JsonProperty("run_status")
    public HackerearthRunStatus runStatus;
    @JsonProperty("compile_status")
    public String compileStatus;
    @JsonProperty("web_link")
    public String webLink;
    @JsonProperty("code_id")
    public String codeId;
    @JsonIgnore
    public String responseContent;

    @Override
    @JsonIgnore
    public String getRunOutput() {
        if(runStatus == null) {
            return "";
        }

        return runStatus.output;
    }

    @Override
    @JsonIgnore
    public String getDetailedOutput() {
        return responseContent;
    }
}
