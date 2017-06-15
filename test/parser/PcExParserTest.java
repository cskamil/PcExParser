package parser;

import java.io.FileNotFoundException;
import java.nio.file.Paths;

import org.junit.Test;

import parser.json.entity.Program;

public class PcExParserTest {

	@Test
	public void test() throws FileNotFoundException {
		Program program = PcExParser.parseFile(Paths.get("test_examples/ArrayInitialization/ArrayInitialization1.java"));
		PrintJSON.printJSON(program);
	}

}
