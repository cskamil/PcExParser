package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import parser.Language;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


/**
 * The {@Program} class represents the programming construction examples.
 * 
 * @author cskamil
 *
 */
public class Program extends AbstractEntity implements Compilable {

	private String name;
	private int order;
	private boolean isFullyWorkedOut;
	private Language language;
	private String activityName;
	private String fileName;
	private String goalDescription;
	private String correctOutput;
	private List<String> userInputList;
	private String userInput;
	private List<Line> lineList;
	
	private List<Tile> distractorList;
	private List<Tile> blankLineList;

	private List<AlternativeProgram> alternatives;
	
	public Program() {
		this.userInputList = new ArrayList<>();
		this.distractorList = new ArrayList<>();
		this.lineList = new ArrayList<>();
		this.blankLineList = new ArrayList<>();
		this.alternatives = new ArrayList<>();
	}

	public Program(String goalDescription, String correctOutput) {
		this.goalDescription = goalDescription;
		this.correctOutput = correctOutput;
	}

	public AlternativeProgram addAlternative(List<Tile> alternativeTileLines) {
		AlternativeProgram alternative = new AlternativeProgram();
		alternative.setRelatedProgramId(getId());
		alternative.setLanguage(getLanguage());
		alternative.setFileName(getFileName());
		alternative.setActivityName(getActivityName());
		alternative.setAlternativeTiles(alternativeTileLines);
		alternative.setLineList(replaceBlankLines(alternativeTileLines));
		alternative.setUserInput(getUserInput());

		this.alternatives.add(alternative);

		return alternative;
	}

	private List<Line> replaceBlankLines(List<Tile> alternativeTileLines) {
		List<Line> newLineList = new ArrayList<>(getLineList());
		AtomicInteger counter = new AtomicInteger();

		getBlankLineList().forEach(tile -> {
			int lineNumber = tile.getLine().getNumber();
			newLineList.set(lineNumber-1, alternativeTileLines.get(counter.intValue()).getLine());
			counter.incrementAndGet();
		});

		return newLineList;
	}
	
	public void addDistractor(Tile tile) {
		this.distractorList.add(tile);
	}
	
	public void addLine(Line line) {
		this.lineList.add(line);
	}
	
	public void addBlankLine(Tile tile) {
		this.blankLineList.add(tile);
	}

	public Line findLineByNumber(int lineNumber) {
		return this.lineList.stream().parallel()
							.filter(line -> line.getNumber() == lineNumber)
							.findFirst().get();
	}

	public Tile getBlankLineByLine(Line line) {
		return getBlankLineList().stream().filter(blankLine -> blankLine.getLine().getId().equals(line.getId())).findFirst().orElse(null);
	}

	@JsonIgnore
	public String getSourceCode() {
		return getLineList().stream().map(line -> line.getContent()).collect(Collectors.joining("\n"));
	}

	public boolean isFullyWorkedOut() {
		return isFullyWorkedOut;
	}

	public void setFullyWorkedOut(boolean fullyWorkedOut) {
		isFullyWorkedOut = fullyWorkedOut;
	}

	public String getGoalDescription() {
		return goalDescription;
	}
	public void setGoalDescription(String goalDescription) {
		this.goalDescription = goalDescription;
	}

	public String getCorrectOutput() {
		return correctOutput;
	}
	public void setCorrectOutput(String correctOutput) {
		this.correctOutput = correctOutput;
	}

	public List<Tile> getDistractorList() {
		return distractorList;
	}

	public List<Line> getLineList() {
		return lineList;
	}
	public void setLineList(List<Line> lineList) {
		this.lineList = lineList;
	}

	public List<Tile> getBlankLineList() {
		return blankLineList;
	}

	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public List<AlternativeProgram> getAlternatives() {
		return alternatives;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public List<String> getUserInputList() {
		return userInputList;
	}

	public void setUserInputList(List<String> userInputList) {
		this.userInputList = userInputList;
	}

	public void addUserInput(String userInput) {
		getUserInputList().add(userInput);
	}

	public void createUserInputString() {
		String input = userInputList.stream().collect(Collectors.joining(",")).replace(",", " ");
		this.userInput = input;
	}

	public void setUserInput(String input) {
		this.userInput = input;
	}

	@Override
	public String getUserInput() {
		return userInput;
	}
}
