package parser.json.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import parser.Language;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * The {@Program} class represents the programming construction examples.
 * 
 * @author cskamil
 *
 */
public class Program extends AbstractEntity {
	
	private Language language;
	private String activityName;
	private String fileName;
	private String goalDescription;
	private String correctOutput;
	private List<Line> lineList;
	
	private List<Tile> distractorList;
	private List<Tile> blankLineList;
	
	public Program() {
		this.distractorList = new ArrayList<Tile>();
		this.lineList = new ArrayList<Line>();
		this.blankLineList = new ArrayList<Tile>();
	}

	public Program(String goalDescription, String correctOutput) {
		this.goalDescription = goalDescription;
		this.correctOutput = correctOutput;
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
	public void setDistractorList(List<Tile> distractorList) {
		this.distractorList = distractorList;
	}
	public List<Line> getLineList() {
		return lineList;
	}
	public void setLineList(List<Line> lineList) {
		this.lineList = lineList;
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
}
