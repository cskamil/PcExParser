package compiler.hackerearth.response;

import compiler.hackerearth.HackerEarthData;
import parser.json.entity.Program;

/**
 * Created by cskamil on 18-Jun-17.
 */
public class HackerEarthDataFactory {

    public static HackerEarthData create(String clientSecret, Program program) {
        HackerEarthData data = new HackerEarthData();
        data.setClientSecret(clientSecret);
        data.setLanguage(program.getLanguage().name());
        data.setSource(program.getSourceCode());

        return data;
    }
}
