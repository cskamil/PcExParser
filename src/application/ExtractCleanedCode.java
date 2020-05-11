package application;

import entity.Program;
import json.JSONUtils;
import org.apache.commons.codec.language.bm.Lang;
import parser.Language;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

/**
 * Created by cskamil on 06-Dec-17.
 */
public class ExtractCleanedCode {

    public static void main(String[] args) {
        final int[] count = {0,0};
        try (Stream<Path> pathStream = Files.walk(Paths.get("output/production_json_data/"))) {
            pathStream.filter(path -> Files.isRegularFile(path) && path.getFileName().toString().endsWith(".json"))
                    .flatMap(path -> JSONUtils.parseActivityJSON(path).getActivityGoals().stream())
                    .forEach( program -> {
                        if(program.getLanguage() == Language.JAVA)
                            count[0]++;
                        else {
                            count[1]++;
                        }
                        //System.out.println(program.getFileName());
                        printCleanedSourceCode(program);
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(count[0]);
    }

    private static void printCleanedSourceCode(Program program) {
        Path path = Paths.get("output/cleanedSourceCode/" + program.getLanguage().name() + "/" + program.getActivityName() + "/" + program.getFileName());
        try {
            Files.createDirectories(path.getParent());
            Files.write(path, program.getSourceCode().getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
