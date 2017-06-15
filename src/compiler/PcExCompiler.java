package compiler;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import parser.json.entity.Program;

public class PcExCompiler {

	public static String compile(Program program) {
		try {
			runProcess("jshell");
//		      runProcess("javac test_examples/ArrayInitialization/ArrayInitialization1.java");
//		      runProcess("java Main");
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		return null;
	}

	private static void runProcess(String command) throws Exception {
		Process pro = Runtime.getRuntime().exec(command);
		printLines(command + " stdout:", pro.getInputStream());
		printLines(command + " stderr:", pro.getErrorStream());
		pro.waitFor();
		System.out.println(command + " exitValue() " + pro.exitValue());
	}

	private static void printLines(String name, InputStream ins) throws Exception {
		String line = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(ins));
		while ((line = in.readLine()) != null) {
			System.out.println(name + " " + line);
		}
	}
	
	public static void main(String[] args) {
		PcExCompiler.compile(null);
	}

}
