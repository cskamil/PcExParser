package parser;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.*;

public class PrintJSON {
	

	public static void printJSONToFile(String fileName, Object object) {
		String jsonString = printJSON(object);
		try {
			Files.write(Paths.get(fileName), jsonString.getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String printJSON(Object object) {
		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;

		try {
			json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return json;
	}
	

}
