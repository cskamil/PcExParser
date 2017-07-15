package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import parser.Language;

import java.util.ArrayList;
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
	
	private Language language;
	private String activityName;
	private String fileName;
	private String goalDescription;
	private String correctOutput;
	//TODO: include user input
	private List<Line> lineList;
	
	private List<Tile> distractorList;
	private List<Tile> blankLineList;

	private List<AlternativeProgram> alternatives;
	
	public Program() {
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

	@JsonIgnore
	public String getSourceCode() {
		return getLineList().stream().map(line -> line.getContent()).collect(Collectors.joining("\n"));
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
}
