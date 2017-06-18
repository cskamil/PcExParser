package parser;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import json.JSONUtils;
import entity.Activity;

public class PcExParserTest {

	@Test
	public void test() throws FileNotFoundException {
		Map<Language, List<Activity>> parsed = PcExParser.parseDirectory("resources");
		JSONUtils.writeObjectAsString(parsed);
	}

}
