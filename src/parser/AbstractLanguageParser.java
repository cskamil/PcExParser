package parser;

import parser.json.annotation.Annotation;
import parser.json.annotation.AnnotationFactory;
import parser.json.annotation.AnnotationMissingSymbolException;
import parser.json.annotation.AnnotationType;
import parser.json.entity.Line;
import parser.json.entity.Program;
import parser.json.entity.Tile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by cskamil on 15-Jun-17.
 */
public abstract class AbstractLanguageParser implements LanguageParser {

    private final String ANNOTATION_TAG = "@";

    private Path path;

    public AbstractLanguageParser(Path path) {
        this.path = path;
    }

    @Override
    public Program parse() {
       return parsePath(path);
    }

    protected Program parsePath(Path path) {
        List<Line> lineList = getParsableLines(path);

        List<Line> programLines = new ArrayList<Line>();
        List<Line> commentLines = new ArrayList<Line>();

        lineList.stream()
                .forEachOrdered(line -> {
                    if(line.getContent().contains("@")) {
                        commentLines.add(line);
                    } else {
                        programLines.add(line);
                    }
                });

        Program program = new Program();
        program.setActivityName(path.getName(path.getNameCount()-2).toString());
        program.setLineList(programLines);

        parseCommentLines(commentLines, program);

        return program;
    }

    protected List<Line> getParsableLines(Path path) {
        List<Line> lineList = new ArrayList<Line>();

        try (Stream<String> stream = Files.lines(path)) {
            AtomicInteger counter = new AtomicInteger();

            lineList = stream
                    .sequential()
                    .filter(line -> isLineParsable(line))
                    .map(line -> {
                        if(isAnnotatedLine(line) == false) {
                            counter.incrementAndGet();
                        }

                        return new Line(counter.intValue(), line);
                    }). collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineList;
    }

    /**
     * A line is parsable if it is annotated, comment or code
     * @param line
     * @return
     */
    protected boolean isLineParsable(String line) {
       return isAnnotatedLine(line) || isLineComment(line) || isLineCode(line);
    }

    protected boolean isAnnotatedLine(String line) {
        return line.contains(ANNOTATION_TAG);
    }

    protected abstract boolean isLineComment(String line);

    protected abstract boolean isLineCode(String line);

    protected void parseCommentLines(List<Line> commentLines, final Program program) {
        commentLines.stream().forEachOrdered(commentLine -> {
            try {
                Annotation annotation = AnnotationFactory.createAnnotation(commentLine.getContent());

                if(commentLine.getNumber() == 0) { //Class Level Comments
                    if(annotation.getType() == AnnotationType.GOAL_DESCRIPTION) {
                        program.setGoalDescription(annotation.getText());
                    } else if(annotation.getType() == AnnotationType.CORRECT_OUTPUT) {
                        program.setCorrectOutput(annotation.getText());
                    } else if(annotation.getType() == AnnotationType.DISTRACTOR) {
                        Tile distractorTile = parseDistractorTile(annotation);
                        program.addDistractor(distractorTile);
                    }
                } else { //Comments inside class definition
                    Line commentedLine = program.findLineByNumber(commentLine.getNumber() + 1);

                    if(annotation.getType() == AnnotationType.HELP_DESCRIPTION) {
                        commentedLine.setComment(annotation.getText());
                    } else if (annotation.getType() == AnnotationType.BLANK) {
                        program.addBlankLine(new Tile(commentedLine, annotation.getText()));
                    }
                }
            } catch (AnnotationMissingSymbolException e) {
                System.err.println("Exception at comment parsing: ActivityName=" + program.getActivityName() + ", Goal=" + program.getGoalDescription() + ",line=" + commentLine.getContent());
                throw e;
            }

        });

    }

    protected Tile parseDistractorTile(Annotation annotation) {
        String codeStartToken = "code(";
        String codeEndToken = "),";
        String helpStartToken = "helpDescription(";
        String helpEndToken = ")";

        String text = annotation.getText();

        int codeStartIndex = text.indexOf(codeStartToken);
        int codeEndIndex = text.indexOf(codeEndToken);
        int helpStartIndex = text.indexOf(helpStartToken);
        int helpEndIndex = text.lastIndexOf(helpEndToken);

        if(codeStartIndex < 0 || codeEndIndex < 0 || helpStartIndex < 0 || helpEndIndex < 0) {
            throw new AnnotationMissingSymbolException(AnnotationType.DISTRACTOR);
        }

        String codePart = text.substring(codeStartIndex + codeStartToken.length(), codeEndIndex).trim();
        String helpPart = text.substring(helpStartIndex + helpStartToken.length(), helpEndIndex).trim();


        Line distractorLine = new Line();
        distractorLine.setNumber(0);
        distractorLine.setContent(codePart);

        Tile distractor = new Tile(distractorLine, helpPart);
        return distractor;
    }
}
