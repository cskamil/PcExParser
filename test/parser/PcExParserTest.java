package parser;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import parser.json.JSONUtils;
import parser.json.entity.Activity;

public class PcExParserTest {

	@Test
	public void test() throws FileNotFoundException {
		Map<Language, List<Activity>> parsed = PcExParser.parseDirectory("resources");
		JSONUtils.writeObjectAsString(parsed);
	}

}
