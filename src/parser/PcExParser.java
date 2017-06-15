package parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import parser.json.annotation.Annotation;
import parser.json.annotation.AnnotationFactory;
import parser.json.annotation.AnnotationType;
import parser.json.entity.Activity;
import parser.json.entity.Line;
import parser.json.entity.Program;
import parser.json.entity.Tile;

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
	
	public static List<Activity> parseDirectory(String path) {
		try (Stream<Path> pathStream = Files.walk(Paths.get(path))) {
			 Map<String,List<Program>> activityProgramList = pathStream.filter(p -> Files.isRegularFile(p))
					  							  .map(p -> parseFile(p))
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
		
		return null;
	}
	
	public static Program parseFile(Path path) {
		ParserFactory.create(path);
		return null;
	}
	
	private static Program parseFile(Path path, LanguageParser parser) {
		List<Line> lineList = getParsableLines(path);
		
		List<Line> programLines = new ArrayList<Line>();
		List<Line> commentLines = new ArrayList<Line>();
		
		lineList.stream()
					.sequential()
					.forEach(line -> {
						if(line.getContent().contains("@")) {
							commentLines.add(line);
						} else {
							programLines.add(line);
						}
					});
					
		Program program = new Program();
		program.setActivityName(path.getName(path.getNameCount()-2).toString());
		program.setLineList(programLines);
		
		parseCommentLines(commentLines, program);
		
		return program;
	}
	
	private static void parseCommentLines(List<Line> commentLines, final Program program) {
			commentLines.stream().forEachOrdered(commentLine -> {
				try {
					Annotation annotation = AnnotationFactory.createAnnotation(commentLine.getContent());
					
					if(commentLine.getNumber() == 0) { //Class Level Comments
						if(annotation.getType() == AnnotationType.GOAL_DESCRIPTION) {
							program.setGoalDescription(annotation.getText());
						} else if(annotation.getType() == AnnotationType.CORRECT_OUTPUT) {
							program.setCorrectOutput(annotation.getText());
						} else if(annotation.getType() == AnnotationType.DISTRACTOR) {
							Tile distractorTile = parseDistractorTile(annotation);
							program.addDistractor(distractorTile);
						}
					} else { //Comments inside class definition
						Line commentedLine = program.findLineByNumber(commentLine.getNumber() + 1);

						if(annotation.getType() == AnnotationType.HELP_DESCRIPTION) {
							commentedLine.setComment(annotation.getText());
						} else if (annotation.getType() == AnnotationType.BLANK) {
							program.addBlankLine(new Tile(commentedLine, annotation.getText()));
						}
					}
				} catch (AnnotationMissingSymbolException e) {
					System.err.println("Exception at comment parsing: ActivityName=" + program.getActivityName() + ", Goal=" + program.getGoalDescription() + ",line=" + commentLine.getContent());
					throw e;
				}
			
			});
		
	}
	
    private static Tile parseDistractorTile(Annotation annotation) {
    	String codeStartToken = "code(";
    	String codeEndToken = "),";
    	String helpStartToken = "helpDescription(";
    	String helpEndToken = ")";
    	
    	String text = annotation.getText();
    	
		int codeStartIndex = text.indexOf(codeStartToken);
		int codeEndIndex = text.indexOf(codeEndToken);
		int helpStartIndex = text.indexOf(helpStartToken);
		int helpEndIndex = text.lastIndexOf(helpEndToken);
		
		if(codeStartIndex < 0 || codeEndIndex < 0 || helpStartIndex < 0 || helpEndIndex < 0) {
			throw new AnnotationMissingSymbolException(AnnotationType.DISTRACTOR);
		}
		
		String codePart = text.substring(codeStartIndex + codeStartToken.length(), codeEndIndex).trim();
		String helpPart = text.substring(helpStartIndex + helpStartToken.length(), helpEndIndex).trim();
		
		
		Line distractorLine = new Line();
		distractorLine.setNumber(0);
		distractorLine.setContent(codePart);    
		
		Tile distractor = new Tile(distractorLine, helpPart);
		return distractor;
    }

	private static List<Line> getParsableLines(Path path) {
		List<Line> lineList = new ArrayList<Line>();
		
		try (Stream<String> stream = Files.lines(path)) {
			AtomicInteger counter = new AtomicInteger();
			
			lineList = stream
						.sequential()
						.filter(line -> isLineParsable(line))
						.map(line -> {
							if(line.contains("@") == false) {
								counter.incrementAndGet();
							}
							
							return new Line(counter.intValue(), line);
						}). collect(Collectors.toList());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lineList;
	}
	
	/**
	 * A line is parsable if it is not empty and package declaration,has annotation
	 * @param line
	 * @return
	 */
	static boolean isLineParsable(String line) {
		return isLineParsableComment(line) || isLineParsableCode(line);
	}
	
	static boolean isLineParsableComment(String line) {
		return line.startsWith("//") || line.contains("@");
	}
	
	static boolean isLineParsableCode(String line) {
		return  !line.trim().isEmpty() &&
				!line.startsWith("package") &&
				!line.startsWith("/**") &&
				!line.startsWith("*/");
	}
	
	
	

}
