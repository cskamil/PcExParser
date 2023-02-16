package parser;

import compiler.PcExCompiler;
import compiler.hackerearth.response.HackerEarthResponse;
import json.JSONUtils;
import entity.Activity;
import entity.Program;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Parses program construction examples and creates an instance of {@link Program}. 
 * 
 * <p>Followings are the mapping between custom Javadoc comment annotations to entity classes. This mapping is used to parse program construction examples. 
 * 
 * 
 * @author cskamil
 */
public class PcExParser {

	//TODO: Return different type to enclose map
	public static Map<Language,List<Activity>> parseDirectory(String pathString) {
		try (Stream<Path> pathStream = Files.walk(Paths.get(pathString))) {
			Map<Language, Map<String, List<Program>>> languageProgramMap = pathStream
					.filter(path -> Files.isRegularFile(path) &&
							!path.getFileName().toString().equals(".DS_Store") &&
							!path.getFileName().toString().equals("__init__.py") &&
							!path.getFileName().toString().equals(".gitkeep"))
					.map(path -> ParserFactory.create(path).parse())
					.collect(Collectors.groupingBy(Program::getLanguage, Collectors.groupingBy(Program::getActivityName)));

			return languageProgramMap.entrySet().stream()
					.collect(Collectors.toMap(Map.Entry::getKey,
							e -> mapProgramsToActivities(e.getKey(), e.getValue())));

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Collections.emptyMap();
	}

	/**
	 * Creates an Activity for each map entry. Map key represents activity name and value represents goals.
	 * @param activityProgramMap
	 * @return List<Activity>
	 */
	private static List<Activity> mapProgramsToActivities(Language language, Map<String, List<Program>> activityProgramMap) {
		return activityProgramMap.entrySet().stream().map(stringListEntry -> {
			Activity activity = new Activity();
			activity.setLanguage(language);
			activity.setActivityName(stringListEntry.getKey());
			activity.setActivityGoals(stringListEntry.getValue());
			return activity;
		}).collect(Collectors.toList());
	}
}
