package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import parser.Language;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by cskamil on 19-Jun-17.
 */
public class AlternativeProgram extends AbstractEntity implements Compilable{

    private String relatedProgramId;
    private Language language;
    private String activityName;
    private String fileName;
    private List<Line> lineList;
    private List<Tile> alternativeTiles;
    private String output;
    private String userInput;

    public AlternativeProgram() {
        this.lineList = new ArrayList<>();
        this.alternativeTiles =  new ArrayList<>();
    }

    public String getAlternativeTileIds() {
       return alternativeTiles.stream().map(tile -> tile.getLine().getId())
                                        .collect(Collectors.joining(","));
    }

    @JsonIgnore
    public String getSourceCode() {
        return getLineList().stream().map(line -> line.getContent()).collect(Collectors.joining("\n"));
    }

    @JsonIgnore
    public List<Line> getLineList() {
        return lineList;
    }

    public void setLineList(List<Line> lineList) {
        this.lineList = lineList;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @JsonIgnore
    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @JsonIgnore
    public String getActivityName() {
        return activityName;
    }

    @Override
    public String getUserInput() {
        return userInput;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    @JsonIgnore
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonIgnore
    public String getRelatedProgramId() {
        return relatedProgramId;
    }

    public void setRelatedProgramId(String relatedProgramId) {
        this.relatedProgramId = relatedProgramId;
    }

    @JsonIgnore
    public List<Tile> getAlternativeTiles() {
        return alternativeTiles;
    }

    public void setAlternativeTiles(List<Tile> alternativeTiles) {
        this.alternativeTiles = alternativeTiles;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
