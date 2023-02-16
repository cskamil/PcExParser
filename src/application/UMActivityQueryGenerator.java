package application;


import json.JSONUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Stream;

public class UMActivityQueryGenerator {

    private static List<String> fileNames = Arrays.asList(
            "PYTHON_py_trees_insert_binarytree.json");

    public static void main(String[] args) {
        try (Stream<Path> pathStream = Files.walk(Paths.get("output/jsondata/"))) {
            pathStream.filter(path -> Files.isRegularFile(path) && path.getFileName().toString().endsWith(".json"))
                    .filter(path -> fileNames.contains(path.getFileName().toString()))
                    .map(path -> JSONUtils.parseActivityJSON(path))
                    .forEach( activity -> {
                        Path path = Paths.get("output/databaseInsertQueries/" + activity.getLanguage().name() + "/" + activity.getActivityName());
                        try {
                            Files.createDirectories(path.getParent());
                            Files.write(path, activity.getDatabaseActivityInsertQueries().getBytes(), StandardOpenOption.CREATE);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
