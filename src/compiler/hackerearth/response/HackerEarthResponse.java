package compiler.hackerearth.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by cskamil on 18-Jun-17.
 */
public class HackerEarthResponse {

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
}
