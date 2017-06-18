package entity;

import parser.Language;

import java.util.ArrayList;
import java.util.List;

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
	
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public List<Program> getActivityGoals() {
		return activityGoals;
	}
	public void setActivityGoals(List<Program> activityGoals) {
		this.activityGoals = activityGoals;
	}
	
	@Override
	public String toString() {
		return "[activityName="+ activityName + ",#ofGoals=" + activityGoals.size()+"]";
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
}
