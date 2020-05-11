package application;

import compiler.LocalCompiler;
import compiler.PcExCompiler;
import compiler.TileCombinationGenerator;
import compiler.hackerearth.HackerEarthCaller;
import entity.Activity;
import entity.Program;
import json.JSONUtils;
import parser.Language;
import parser.PcExParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by cskamil on 18-Jun-17.j
 */
public class PcExParserRunner {

    public static void main(String[] args) {
        //TODO: Take path parameters from configuration file
        Map<Language, List<Activity>> languageActivityListMap = PcExParser.parseDirectory(args[0]);

        //TODO: Create compiler based on configuration
        HackerEarthCaller hackerEarthCaller = new HackerEarthCaller("a1b16947a9d83080a7d3815e2590e42351e14783");
        LocalCompiler compiler = new LocalCompiler();

        languageActivityListMap.forEach((language, activities) -> {
            activities.forEach(activity -> PcExCompiler.execute(compiler, hackerEarthCaller, activity, (program, response) -> {
                System.out.println(program.getFileName());
                program.setCorrectOutput(response.getOutput());
                //printCleanedSourceCode(program);
                TileCombinationGenerator.createAlternatives(program);


                program.getAlternatives().forEach(alternative -> {
                    boolean runAlternative = program.getLanguage().equals(Language.JAVA) ||
                                             program.getLanguage().equals(Language.PYTHON) &&
                                                     new HashSet(alternative.getAlternativeTiles())
                                                             .equals( new HashSet(program.getBlankLineList()));


                    if(runAlternative) {
                        PcExCompiler.execute(compiler, hackerEarthCaller, alternative, (altProgram, altResponse) -> {
                            altProgram.setOutput(altResponse.getOutput());
                            if(program.getCorrectOutput().equals(altResponse.getOutput())) {
                                System.err.println("ALTERNATIVE OUTPUT SAME AS EXPECTED " + program.getFileName() +  " " + altProgram.getId());
                            }

                        });
                    }



                });

            }));

            String jsonFileName = args[1] + "/" + language.name() + ".json";

            JSONUtils.writeObjectToFile(jsonFileName, activities);
            JSONSplit.splitJSONByActivityName(jsonFileName, language.name());
        });

        System.exit(0);
    }
}
