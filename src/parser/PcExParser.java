package parser;

import parser.json.entity.Activity;
import parser.json.entity.Program;

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
	
	public static void main(String[] args) {
//		try (Stream<String> stream = Files.lines(Paths.get("resources/program1"))) {
//			
//			String collect = stream.collect(Collectors.joining("\\n"));
//			
//			Submission submission = new Submission();
//			submission.setSourceCode(collect);
//			
//			PrintJSON.printJSON(submission);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		PrintJSON.printJSON(parseDirectory("resources"));
	}
	
	public static List<Activity> parseDirectory(String pathString) {
		try (Stream<Path> pathStream = Files.walk(Paths.get(pathString))) {
			 Map<String,List<Program>> activityProgramList = pathStream.filter(path -> Files.isRegularFile(path))
					  							  .map(path -> ParserFactory.create(path).parse())
					  							  .collect(Collectors.groupingBy(Program::getActivityName));

			 List<Activity> activityList = activityProgramList.keySet().stream().map(activityName -> {
				 Activity activity = new Activity();
				 activity.setActivityName(activityName);
				 activity.setActivityGoals(activityProgramList.get(activityName));
				 
				 return activity;
			 }).collect(Collectors.toList());
			
			return activityList;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Collections.emptyList();
	}
}
