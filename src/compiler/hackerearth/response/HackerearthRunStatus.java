package compiler.hackerearth.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by cskamil on 18-Jun-17.
 */
public class HackerearthRunStatus {
    @JsonProperty("memory_used")
    public String memoryUsed;
    @JsonProperty("time_limit")
    public Integer timeLimit;
    @JsonProperty("output_html")
    public String outputHtml;
    @JsonProperty("memory_limit")
    public Integer memoryLimit;
    @JsonProperty("time_used")
    public String timeUsed;
    @JsonProperty("signal")
    public String signal;
    @JsonProperty("status_detail")
    public String statusDetail;
    @JsonProperty("status")
    public String status;
    @JsonProperty("stderr")
    public String stderr;
    @JsonProperty("output")
    public String output;
    @JsonProperty("async")
    public Integer async;
    @JsonProperty("request_NOT_OK_reason")
    public String requestNOTOKReason;
    @JsonProperty("request_OK")
    public String requestOK;
}
