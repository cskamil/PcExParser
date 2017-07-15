package compiler;

import entity.Activity;
import entity.AlternativeProgram;
import entity.Compilable;
import entity.Program;

import java.util.function.BiConsumer;

public class PcExCompiler {

	public static void execute(Compiler compiler, Activity activity, BiConsumer<Program, Response> postExecuteConsumer) {
		activity.getActivityGoals().stream().forEach(program -> {
			Response response = execute(compiler, program);
			postExecuteConsumer.accept(program, response);
		});
	}


	public static void execute(Compiler compiler, AlternativeProgram alternativeProgram, BiConsumer<AlternativeProgram, Response> postExecuteConsumer) {
		Response response = execute(compiler, alternativeProgram);
		postExecuteConsumer.accept(alternativeProgram, response);
	}

	private static Response execute(Compiler compiler, Compilable program) {
		Response response = null;
		try {
			response = compiler.run(program);
		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//			Path path = Paths.get("output/executions/" + program.getLanguage().name() + "/" + program.getActivityName() + "/" + program.getFileName() + "_output.txt");
//			Files.createDirectories(path.getParent());
//			Files.write(path, response.getRunOutput().getBytes(), StandardOpenOption.CREATE);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		return response;
	}

}
