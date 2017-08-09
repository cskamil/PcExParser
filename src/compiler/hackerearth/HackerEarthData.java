package compiler.hackerearth;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cskamil on 18-Jun-17.
 */
public class HackerEarthData {

    private String clientSecret;
    private String async;
    private String source;
    private String language;
    private String timeLimit;
    private String memoryLimit;
    private String userInput;

    public HackerEarthData() {
        this.setAsync("0");
        this.setTimeLimit("5");
        this.setMemoryLimit("262144");
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public List<NameValuePair> getURLParameters() {
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        parameters.add(new BasicNameValuePair("source", getSource()));
        parameters.add(new BasicNameValuePair("lang", getLanguage()));
        parameters.add(new BasicNameValuePair("client_secret", getClientSecret()));
        parameters.add(new BasicNameValuePair("async", getAsync()));
        parameters.add(new BasicNameValuePair("memory_limit", getMemoryLimit()));
        parameters.add(new BasicNameValuePair("time_limit", getTimeLimit()));
        parameters.add(new BasicNameValuePair("input", getUserInput()));

        return parameters;
    }


}
