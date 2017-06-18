package compiler.hackerearth;

import compiler.hackerearth.response.HackerEarthDataFactory;
import compiler.hackerearth.response.HackerEarthResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import parser.json.JSONUtils;
import parser.json.entity.Program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * Created by cskamil on 18-Jun-17.
 */
public class HackerEarthCaller {

    public static final String RUN_URI = "https://api.hackerearth.com/v3/code/run/";

    private String clientSecret;

    public HackerEarthCaller(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public HackerEarthResponse run(Program program) {
        HackerEarthData hackerEarthData = HackerEarthDataFactory.create(clientSecret, program);

        return run(hackerEarthData);
    }

    public HackerEarthResponse run(HackerEarthData hackerearthData) {
        hackerearthData.setClientSecret(this.clientSecret);

        HttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(RUN_URI);

        HackerEarthResponse hackerearthResponse = new HackerEarthResponse();

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(hackerearthData.getURLParameters()));

            HttpResponse response = httpClient.execute(httpPost);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String responseString = bufferedReader.lines().collect(Collectors.joining("\n"));
            hackerearthResponse = JSONUtils.parseStringToObject(responseString, HackerEarthResponse.class);
            hackerearthResponse.responseContent = responseString;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return hackerearthResponse;

    }

    public static void main(String args[]) {
        HackerEarthData hackerearthData = new HackerEarthData();
        hackerearthData.setAsync("0");
        hackerearthData.setLanguage("PYTHON");
        hackerearthData.setTimeLimit("5");
        hackerearthData.setMemoryLimit("262144");
        hackerearthData.setSource("print 'Hello World'");

        System.out.println(new HackerEarthCaller("a1b16947a9d83080a7d3815e2590e42351e14783").run(hackerearthData));
    }
}
