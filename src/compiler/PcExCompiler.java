package compiler;

import compiler.hackerearth.HackerEarthCaller;
import entity.Activity;
import entity.AlternativeProgram;
import entity.Compilable;
import entity.Program;
import parser.Language;

import java.util.function.BiConsumer;

public class PcExCompiler {

	public static void execute(LocalCompiler compiler, HackerEarthCaller hackerEarthCaller, Activity activity, BiConsumer<Program, Response> postExecuteConsumer) {
		activity.getActivityGoals().stream().forEach(program -> {
			program.createUserInputString();
			Response response = execute(compiler, hackerEarthCaller, program);
			postExecuteConsumer.accept(program, response);
		});
	}


	public static void execute(LocalCompiler compiler, HackerEarthCaller hackerEarthCaller, AlternativeProgram alternativeProgram, BiConsumer<AlternativeProgram, Response> postExecuteConsumer) {
		alternativeProgram.generateAlternativeTileIds();
		Response response = execute(compiler, hackerEarthCaller, alternativeProgram);
		postExecuteConsumer.accept(alternativeProgram, response);
	}

	private static Response execute(LocalCompiler compiler, HackerEarthCaller hackerEarthCaller, Compilable program) {
		Response response = null;
		try {
			response = compiler.run(program);
		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//			Path path = Paths.get("output/executions/" + program.getLanguage().name() + "/" + program.getActivityName() + "/" + program.getFileName() + "_output.txt");
//			Files.createDirectories(path.getParent());
//			Files.write(path, response.getOutput().getBytes(), StandardOpenOption.CREATE);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		return response;
	}

}
