package compiler;

import compiler.hackerearth.HackerEarthCaller;
import compiler.hackerearth.response.HackerEarthResponse;
import parser.json.entity.Program;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PcExCompiler {

	public static HackerEarthResponse execute(Program program) {
		Path path = Paths.get("output/executions/" + program.getLanguage().name() + "_" + program.getActivityName() + "_" + program.getFileName() + "_output.txt");
		HackerEarthCaller caller = new HackerEarthCaller("a1b16947a9d83080a7d3815e2590e42351e14783");
		HackerEarthResponse response = caller.run(program);
		System.out.println(response.responseContent);

		try {
			Files.createDirectories(path.getParent());
			Files.write(path, response.responseContent.getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return response;
	}

}
