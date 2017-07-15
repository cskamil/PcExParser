package application;

import compiler.Compiler;
import compiler.LocalCompiler;
import compiler.PcExCompiler;
import compiler.TileCombinationGenerator;
import compiler.hackerearth.HackerEarthCaller;
import entity.Activity;
import json.JSONUtils;
import parser.Language;
import parser.PcExParser;

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
        //Compiler compiler = new HackerEarthCaller("a1b16947a9d83080a7d3815e2590e42351e14783");
        Compiler compiler = new LocalCompiler();

        languageActivityListMap.forEach((language, activities) -> {
            //TODO: Check if there is a compilation or runtime error, then set output
            activities.forEach(activity -> PcExCompiler.execute(compiler, activity, (program, response) -> {
                program.setCorrectOutput(response.getRunOutput());
//                TileCombinationGenerator.createAlternatives(program);
//
//                program.getAlternatives().forEach(alternative -> {
//                    PcExCompiler.execute(compiler, alternative, (altProgram, altResponse) -> altProgram.setOutput(altResponse.getRunOutput()));
//                });
            }));

            JSONUtils.writeObjectToFile(args[1] + "/" + language.name() + ".json", activities);

        });


        //TODO: Write program sourceCode to file to a folder called cleanedSourceCode

        System.exit(0);
    }
}
