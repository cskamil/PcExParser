package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertCSEdPadToPCEXSource {

    public static void main(String[] args) {


        try (Stream<Path> pathStream = Files.walk(Paths.get("csedpad"))) {
            List<String> alreadyParsedPaths =
                    Files.walk(Paths.get("resources/java"))
                            .filter(path -> Files.isRegularFile(path))
                            .filter(path -> !path.getFileName().toString().equals(".DS_Store"))
                            .map(path -> path.getFileName().toString())
                            .collect(Collectors.toList());

            List<Path> pathList = pathStream
                    .filter(path -> Files.isRegularFile(path))
                    .filter(path -> !path.getFileName().toString().equals(".DS_Store"))
                    .filter(path -> !path.getFileName().toString().equals("__init__.py"))
                    .filter(path -> !alreadyParsedPaths.contains(path.getFileName().toString()))
                    .collect(Collectors.toList());

            for (Path path:pathList) {
                StringBuilder builder = new StringBuilder();
                boolean classMetaDataStarted = true;
                boolean logicalStepStarted = false;
                boolean statementCommentStarted = false;
                boolean skipEmptyLine = false;
                boolean descriptionStarted = false;
                String topics = "no_topic";
                int contentCounter = 1;

                try (Stream<String> stream = Files.lines(path)) {

                    List<String> collect = stream.sequential().collect(Collectors.toList());

                    for (int i=0; i<collect.size(); i++) {
                        String line = collect.get(i);

                        if(skipEmptyLine && line.trim().length() == 0) {
                            skipEmptyLine = false;
                        } else if(classMetaDataStarted && line.contains("/**")) {
                            builder.append("/**").append("\n");
                        } else if(line.contains("*/")) {
                            if(classMetaDataStarted) {
                                builder.append("**/").append("\n");
                                classMetaDataStarted = false;
                            } else if(logicalStepStarted) {
                                logicalStepStarted = false;
                            } else if(statementCommentStarted) {
                                statementCommentStarted = false;
                                builder.append(")**/").append("\n");
                            }

                            skipEmptyLine = true;
                        } else if(classMetaDataStarted && line.contains("*")) {
                            if(line.contains(":")) {
                                if(descriptionStarted) {
                                    builder.append(")").append("\n");
                                    descriptionStarted=false;
                                }

                                if(line.contains("title")) {
                                    String title = getContentsAfterColon(line);
                                    builder.append("@name(").append(title.trim());
                                    descriptionStarted = true;
                                } else if(line.contains("goalDescription")) {
                                    String goalDescription = getContentsAfterColon(line);
                                    builder.append("@goalDescription(").append(goalDescription.trim());
                                    descriptionStarted = true;
                                } else if(line.contains("topics") && !line.contains("subtopics")) {
                                    topics = getContentsAfterColon(line)
                                            .trim()
                                            .replaceAll(",","_")
                                            .replaceAll(" ","")
                                            .toLowerCase();
                                }

                            } else if(descriptionStarted){
                                String content = getContentsAfterStar(line);
                                builder.append(" ").append(content);
                            }


                        } else if(!logicalStepStarted && line.contains("logical_step")) {
                            logicalStepStarted = true;
                            String logicalStepContent = getContentsAfterColon(line);
                            builder.append("//").append(logicalStepContent).append("\n");

                        } else if(!statementCommentStarted && line.contains("stm_comment")) {
                            statementCommentStarted = true;

                            String statementComment = getContentsAfterColon(line);
                            builder.append("/**@helpDescription(").append(statementComment);
                        } else if(statementCommentStarted && line.contains("*")) {
                            String content = getContentsAfterStar(line);
                            builder.append(" ").append(content);
                        } else if(!logicalStepStarted && !classMetaDataStarted && !statementCommentStarted) {
                            if(!line.trim().contains("/**") && !line.trim().contains("/*")) {
                                builder.append(line).append("\n");
                            }
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    String originalFolderName = path.getParent().toString().replace("/",".");
                    String originalFIleName = path.getFileName().toString();
                    String fileName = "resources/java/" +  originalFolderName + "." + topics + "/" + originalFIleName;
                    Path outputFile = Paths.get(fileName);
                    if(Files.exists(outputFile.getParent())) {
                        fileName = "resources/java/" +  originalFolderName + "." + topics +"_"+contentCounter +
                                "/" + originalFIleName;
                        outputFile = Paths.get(fileName);

                        contentCounter++;
                    }
                    Files.createDirectories(outputFile.getParent());
                    Files.write(outputFile, builder.toString().getBytes(), StandardOpenOption.CREATE);
                    System.out.println(builder.toString());

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getContentsAfterColon(String line) {
        return line.substring(line.indexOf(":")+1).trim();
    }

    private static String getContentsAfterStar(String line) {
        return line.substring(line.indexOf("*")+1).trim();
    }
}
