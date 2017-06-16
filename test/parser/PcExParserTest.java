package parser;

import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import parser.json.entity.Activity;
import parser.json.entity.Program;

public class PcExParserTest {

	@Test
	public void test() throws FileNotFoundException {
		Map<Language, List<Activity>> parsed = PcExParser.parseDirectory("resources");
		PrintJSON.printJSON(parsed);
	}

}
