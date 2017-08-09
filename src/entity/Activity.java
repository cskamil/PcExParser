package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import parser.Language;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The {@code Activity} class represents program construction activities.
 * 
 * @author cskamil
 *
 */
public class Activity extends AbstractEntity {

	private Language language;
	private String activityName;
	private List<Program> activityGoals;
	
	public Activity() {
		this.activityGoals = new ArrayList<Program>();
	}
	
	public Activity(String activityName) {
		this.activityName = activityName;
	}

	public void addActivityGoal(Program program) {
		this.activityGoals.add(program);
	}

	@JsonIgnore
	public List<Tile> getAllBlankLines() {
		return activityGoals.stream().flatMap(program -> program.getBlankLineList().stream()).collect(Collectors.toList());
	}

	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public List<Program> getActivityGoals() {
		List<Program> sortedList = new ArrayList<>();

		activityGoals.forEach(goal -> {
			if(goal.isFullyWorkedOut()) {
				sortedList.add(0, goal);
			} else {
				sortedList.add(goal);
			}
		});

		return sortedList;
	}
	public void setActivityGoals(List<Program> activityGoals) {
		this.activityGoals = activityGoals;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	@Override
	public String toString() {
		return "[activityName="+ activityName + ",#ofGoals=" + activityGoals.size()+"]";
	}

}
