package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import parser.Language;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
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

	@JsonIgnore
	public String getDatabaseActivityInsertQueries() {
		final String UM_ENT_ACTIVITY_QUERY = "INSERT INTO `um2`.`ent_activity` (`AppID`, `URI`, `Activity`, `Description`) VALUES (";
		final String UM_REL_ACT_ACT_QUERY = "INSERT INTO `um2`.`rel_activity_activity` (`ParentActivityID`, `ChildActivityID`, `AppID`) VALUES (";
		final String UM_REL_PCEX_SET_QUERY = "INSERT INTO `um2`.`rel_pcex_set_component` " +
				"(`ParentActivityID`," +
				"`ChildActivityID`," +
				"`AppID`) " +
				"VALUES(";

		final String AGG_CONTENT_QUERY = "INSERT INTO `aggregate`.`ent_content`(`content_name`,`content_type`,`display_name`,`desc`,`url`,`domain`,`provider_id`,`comment`,`creator_id`,`privacy`,`author_name`) VALUES(";

		final StringBuilder insertQuery = new StringBuilder();

		// PCEX Set Query
		insertQuery
				.append(UM_ENT_ACTIVITY_QUERY)
				.append("45,'http://adapt2.sis.pitt.edu/pcex/index.html?lang=")
				.append(this.getLanguage().name())
				.append("&set=").append(getActivityName()).append("',")
				.append("'" + getActivityName() + "',")
				.append("'PCEX Set');").append("\n");

		final String selectPCEXSetActivityID =
				"(SELECT activityid from `um2`.`ent_activity` WHERE ACTIVITY='" + getActivityName() + "')";

		getActivityGoals().forEach(goal -> {
			final String goalName = goal.getFileName().substring(0,goal.getFileName().lastIndexOf("."));

			final String selectExampleActivityID =
					"(SELECT activityid from `um2`.`ent_activity` WHERE ACTIVITY='" + goalName + "')";

			if(goal.isFullyWorkedOut()) {
				insertQuery
						.append(UM_ENT_ACTIVITY_QUERY)
						.append("46,'',")
						.append("'" + goalName + "',")
						.append("'PCEX Example');").append("\n");

				insertQuery.append(UM_REL_PCEX_SET_QUERY)
						.append(selectPCEXSetActivityID).append(",")
						.append(selectExampleActivityID).append(",45);").append("\n");

				insertQuery
						.append(AGG_CONTENT_QUERY)
						.append("'" + getActivityName() + "',")
						.append("'pcex_set',")
						.append("'" + goal.getName() + "',")
						.append("'Program Construction Examples',")
						.append("'http://adapt2.sis.pitt.edu/pcex/index.html?lang=")
						.append(this.getLanguage().name())
						.append("&set=").append(getActivityName()).append("',")
						.append("'" + this.getLanguage().getExtension()).append("',")
						.append("'pcex','','akhuseyinoglu','public','akhuseyinoglu&Thea Wang');\n");


				goal.getLineList().stream().filter(line -> !line.getCommentList().isEmpty())
						.forEach(line -> {
							String description = "'PCEX Line - " + getActivityName() + "'";
							insertQuery
									.append(UM_ENT_ACTIVITY_QUERY)
									.append("46,'',")
									.append("'" + line.getNumber() + "',")
									.append(description).append(");\n");

							String selectExampleLineActivityID =
									"(SELECT activityid from `um2`.`ent_activity` WHERE Description=" +
											description + " and activity='" + line.getNumber() + "')";

							insertQuery.append(UM_REL_ACT_ACT_QUERY)
									.append(selectExampleActivityID).append(",")
									.append(selectExampleLineActivityID).append(",46);").append("\n");
						});


			} else {
				insertQuery
						.append(UM_ENT_ACTIVITY_QUERY)
						.append("47,'',")
						.append("'" + goalName + "',")
						.append("'PCEX Challenge');").append("\n");

				String selectChallengeActivityID =
						"(SELECT activityid from `um2`.`ent_activity` WHERE activity='"
								+ goalName + "')";

				insertQuery.append(UM_REL_PCEX_SET_QUERY)
						.append(selectPCEXSetActivityID).append(",")
						.append(selectChallengeActivityID).append(",45);").append("\n");

				insertQuery.append(UM_REL_ACT_ACT_QUERY)
						.append("211935,")
						.append(selectChallengeActivityID).append(",47);").append("\n");

				insertQuery
						.append(AGG_CONTENT_QUERY)
						.append("'" + goalName + "',")
						.append("'pcex_challenge',")
						.append("'" + goal.getName() + " Challenge',")
						.append("'Program Construction Challenges',")
						.append("'http://adapt2.sis.pitt.edu/pcex/index.html?lang=")
						.append(this.getLanguage().name())
						.append("&set=").append(getActivityName())
						.append("&ch=" + goalName).append("',")
						.append("'" + this.getLanguage().getExtension()).append("',")
						.append("'pcex_ch','','akhuseyinoglu','public','akhuseyinoglu&Thea Wang');\n");
			}
		});

		return insertQuery.toString();
	}
	
	@Override
	public String toString() {
		return "[activityName="+ activityName + ",#ofGoals=" + activityGoals.size()+"]";
	}

}
