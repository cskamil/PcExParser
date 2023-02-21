package parser;

import entity.Line;
import entity.Program;
import entity.Tile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import json.JSONUtils;

public class EditorJsonParser implements LanguageParser {

  private Path path;

  public EditorJsonParser(Path path) {
    this.path = path;
  }

  @Override
  @SuppressWarnings(value = "unchecked")
  public Program parse() {
    Program program = new Program();

    Map content;
    try {
      String json = Files.readString(path);
      content = JSONUtils.parseStringToObject(json, Map.class);
    } catch (IOException e) {
      System.err.println(e.getMessage());
      return null;
    }

    program.setOrder(Integer.parseInt(content.get("order").toString()));
    program.setName(content.get("name").toString());
    program.setActivityName(content.get("activityName").toString());
    program.setFileName(content.get("filename").toString());
    program.setFullyWorkedOut(
      Boolean.valueOf(content.get("fullyWorkedOut").toString())
    );
    program.setLanguage(Language.valueOf(content.get("language").toString()));
    program.setGoalDescription(content.get("goalDescription").toString());
    program.setUserInput(content.get("userInput").toString());

    ((List) content.get("distractorList")).forEach($ -> {
        Map $$ = (Map) $;
        Map map = (Map) $$.get("line");

        List comments = ((List) map.get("commentList"));

        Line line = new Line();
        line.setNumber(Integer.parseInt(map.get("number").toString()));
        line.setContent(map.get("content").toString());
        line.setIndentLevel(
          Integer.parseInt(map.get("indentLevel").toString())
        );
        line.getCommentList().addAll(comments);

        Tile tile = new Tile();
        tile.setLine(line);
        tile.getHelpList().addAll(comments);

        program.addDistractor(tile);
      });

    ((List) content.get("blankLineList")).forEach($ -> {
        Map $$ = (Map) $;
        Map map = (Map) $$.get("line");

        List comments = ((List) map.get("commentList"));

        Line line = new Line();
        line.setNumber(Integer.parseInt(map.get("number").toString()));
        line.setContent(map.get("content").toString());
        line.setIndentLevel(
          Integer.parseInt(map.get("indentLevel").toString())
        );
        line.getCommentList().addAll(comments);

        Tile tile = new Tile();
        tile.setLine(line);
        tile.getHelpList().addAll(comments);

        program.addBlankLine(tile);
      });

    ((List) content.get("lineList")).forEach($ -> {
        Map map = (Map) $;

        Line line = new Line();
        line.setNumber(Integer.parseInt(map.get("number").toString()));
        line.setContent(map.get("content").toString());
        line.setIndentLevel(
          Integer.parseInt(map.get("indentLevel").toString())
        );
        line.getCommentList().addAll((List) map.get("commentList"));

        program.addLine(line);
      });

    return program;
  }
}
