package application;

import com.fasterxml.jackson.core.type.TypeReference;
import entity.Activity;
import json.JSONUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by cskamil on 08-Oct-17.
 */
public class JSONSplit {

    public static void splitJSONByActivityName(String jsonFileName, String languageName) {
        Path path = Paths.get(jsonFileName);

        try (Stream<String> stream = Files.lines(path)) {
            String collect = stream.sequential().collect(Collectors.joining(""));

            List<Activity> list = JSONUtils.parseStringToListObject(collect, new TypeReference<List<Activity>>() {});

            for(Activity activity: list) {
                JSONUtils.writeObjectToFile("output/jsondata/" + languageName +"_" + activity.getActivityName() + ".json", activity);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public static void main(String[] args) {
        Path path = Paths.get("output/jsondata/JAVA.json");
        AtomicInteger counter = new AtomicInteger();
        String idPre = "id_";
        Map<String, String> guidMinifiedStringMap = new HashMap<>();


        try (Stream<String> stream = Files.lines(path)) {
            String collect = stream
                    .sequential()
                    .map(line -> {
                        if(line.contains("id") || line.contains("alternativeTileIds")) {
                            Pattern p = Pattern.compile( "[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}");
                            Matcher m = p.matcher(line);
                            while(m.find()) {
                                String guid = m.group();
                                String value = guidMinifiedStringMap.getOrDefault(guid, idPre + counter.incrementAndGet());
                                guidMinifiedStringMap.putIfAbsent(guid, value);
                                line = line.replace(guid, value);
                            }
                        }
                        return line;
                    })
                    .collect(Collectors.joining(""));

            List<Activity> list = JSONUtils.parseStringToListObject(collect, new TypeReference<List<Activity>>() {});

            for(Activity activity: list) {
                JSONUtils.writeObjectToFile("output/jsondata/JAVA_" + activity.getActivityName() + ".json", activity);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


}
