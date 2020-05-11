package application;

import entity.Activity;
import json.JSONUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by cskamil on 08-Oct-17.
 */
public class JSONSplit {

    public static void splitJSONByActivityName(String jsonFileName, String languageName) {
        Path path = Paths.get(jsonFileName);

        List<Activity> activityList = JSONUtils.parseActivityListJSON(path);

        for(Activity activity: activityList) {
            JSONUtils.writeObjectToFile("output/jsondata/" + languageName +"_" + activity.getActivityName() + ".json", activity);
        }
    }

    public static void main(String[] args) {
       JSONSplit.splitJSONByActivityName("output/jsondata/PYTHON.json", "PYTHON");
    }


}
