package json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Activity;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class JSONUtils {
	
	public static void writeObjectToFile(String fileName, Object object) {
		String jsonString = writeObjectAsString(object);
		try {
			Path path = Paths.get(fileName);
			Files.createDirectories(path.getParent());
			Files.write(path, jsonString.getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String writeObjectAsString(Object object) {
		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;

		try {
			json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return json;
	}

	public static <T> T parseStringToObject(String json, Class<T> clazz) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(json, clazz);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static <T> T parseStringToListObject(String json, TypeReference<List<Activity>> clazz) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(json, clazz);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
	

}
