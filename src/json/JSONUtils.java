package json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Activity;

import java.io.IOException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

	public static Activity parseActivityJSON(Path path) {
		try (Stream<String> stream = Files.lines(path)) {
			String jsonFileContent = stream.sequential().collect(Collectors.joining(""));

			Activity activity = JSONUtils.parseStringToObject(jsonFileContent, Activity.class);
			return activity;

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static List<Activity> parseActivityListJSON(Path path) {
		try (Stream<String> stream = Files.lines(path)) {
			String jsonFileContent = stream.sequential().collect(Collectors.joining(""));

			List<Activity> list = JSONUtils.parseStringToListObject(jsonFileContent, new TypeReference<List<Activity>>() {});
			return list;

		} catch (IOException e) {
			e.printStackTrace();
		}

		return Collections.emptyList();
	}
	

}
