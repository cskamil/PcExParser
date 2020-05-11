package compiler.hackerearth;

import compiler.Compiler;
import compiler.Response;
import compiler.hackerearth.response.HackerEarthDataFactory;
import compiler.hackerearth.response.HackerEarthResponse;
import entity.Compilable;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import json.JSONUtils;
import entity.Program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * Created by cskamil on 18-Jun-17.
 */
public class HackerEarthCaller implements Compiler {

    public static final String RUN_URI = "https://api.hackerearth.com/v3/code/run/";

    private String clientSecret;

    public HackerEarthCaller(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Override
    public Response run(Compilable program) {
        HackerEarthData hackerEarthData = HackerEarthDataFactory.create(clientSecret, program);
        return run(hackerEarthData);
    }

    private HackerEarthResponse run(HackerEarthData hackerearthData) {
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
        hackerearthData.setLanguage("JAVA");
        hackerearthData.setTimeLimit("10");
        hackerearthData.setMemoryLimit("262144");
        hackerearthData.setSource("#include <iostream>\n" +
                "#include <string>\n" +
                "using namespace std;\n" +
                "int tersearch(int arr[], int low, int high, int n){\n" +
                "\tif(low<high){\n" +
                "\t\tint mid1=((low+high)/3);\n" +
                "\t\tint mid2=((2*(low+high))/3);\n" +
                "\t\tif(arr[mid1]==n){\n" +
                "\t\t\treturn mid1;\n" +
                "\t\t}\n" +
                "\t\telse if(arr[mid2]==n){\n" +
                "\t\t\treturn mid2;\n" +
                "\t\t}\n" +
                "\t\telse if(arr[mid1]>n){\n" +
                "\t\t\treturn tersearch(arr,low,mid1,n);\n" +
                "\t\t}\n" +
                "\t\telse if(arr[mid1]<n&&arr[mid2]>n){\n" +
                "\t\t\treturn tersearch(arr,mid1,mid2,n);\n" +
                "\t\t}\n" +
                "\t\telse if(arr[mid2]<n){\n" +
                "\t\t\treturn tersearch(arr,mid2,high,n);\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\telse return -1;\n" +
                "}\n" +
                "int main(void){\n" +
                "\tint ip1[9]={4,18,25,55,62,74,83,90,95}; /*84*/\n" +
                "\tint result1=tersearch (ip1, 0, 8, 84);\n" +
                "\tif(result1==-1){\n" +
                "\t\tcout<<\"\\nElement not present in Array\";\n" +
                "\t}\n" +
                "\telse{\n" +
                "\t\tcout<<\"\\nElement present at: \"<<result1;\n" +
                "\t}\n" +
                "}");
        hackerearthData.setSource("public class HelloWorld{\n" +
                "\n" +
                "     public static void main(String []args){\n" +
                "        System.out.println(\"Hello World\");\n" +
                "     }\n" +
                "}");
        HackerEarthResponse result = new HackerEarthCaller("a1b16947a9d83080a7d3815e2590e42351e14783").run(hackerearthData);
        System.out.println(result.getOutput());
    }
}
