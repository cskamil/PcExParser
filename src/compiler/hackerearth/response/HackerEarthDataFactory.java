package compiler.hackerearth.response;

import compiler.hackerearth.HackerEarthData;
import entity.Compilable;
import entity.Program;
import parser.Language;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by cskamil on 18-Jun-17.
 */
public class HackerEarthDataFactory {

    public static HackerEarthData create(String clientSecret, Compilable program) {
        HackerEarthData data = new HackerEarthData();
        data.setClientSecret(clientSecret);
        data.setLanguage(program.getLanguage().name());
        data.setSource(program.getSourceCode());
        if(program.getLanguage() == Language.JAVA) {
            data.setUserInput(program.getUserInput());
        } else {
            data.setUserInput(Arrays.stream(program.getUserInput().split(" ")).collect(Collectors.joining("\n", "", "\n")));
        }
        data.setTimeLimit("2");
        data.setAsync("0");

        return data;
    }
}
