package parser.json.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The {@Program} class represents the programming construction examples.
 * 
 * @author cskamil
 *
 */
public class Program extends AbstractEntity {
	
	private String activityName;
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
	
	public Program(String goalDescription, String correctOutput) {
		this.goalDescription = goalDescription;
		this.correctOutput = correctOutput;
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

	@JsonIgnore
	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
}
