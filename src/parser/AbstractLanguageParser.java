package parser;

import entity.annotations.Annotation;
import entity.annotations.AnnotationFactory;
import entity.annotations.AnnotationMissingSymbolException;
import entity.annotations.AnnotationType;
import entity.Line;
import entity.Program;
import entity.Tile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        Program program = parsePath(path);
        postParse(program);
        return program;
    }

    private Program parsePath(Path path) {
        List<Line> lineList = getLines(path);

        Map<Boolean, List<Line>> codeTypeMap = lineList.stream().collect(Collectors.partitioningBy(line -> isAnnotatedLine(line)));

        List<Line> programLines = codeTypeMap.get(false);
        List<Line> annotatedLines = codeTypeMap.get(true);

        Program program = new Program();
        program.setLineList(programLines);
        program.setFileName(path.getName(path.getNameCount()-1).toString());

        String grandParentDirectoryName = path.getName(path.getNameCount()-3).toString();
        String parentDirectoryName = path.getName(path.getNameCount()-2).toString();

        if(grandParentDirectoryName.equals("challenge")) {
            program.setOrder(Integer.parseInt(parentDirectoryName.replace("_", "")));
            program.setActivityName(path.getName(path.getNameCount()-4).toString());
            program.setFullyWorkedOut(false);
        } else {
            program.setActivityName(parentDirectoryName);
            program.setFullyWorkedOut(true);
        }

        parseAnnotatedLines(annotatedLines, program);

        return program;
    }

    private List<Line> getLines(Path path) {
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

                        Line newLine = new Line(counter.intValue(), line);
                        postLineCreation(newLine);
                        return newLine;
                    }). collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineList;
    }

    /**
     * Template method for subclasses to perform operations on parsed line object.
     * @param line
     */
    protected void postLineCreation(Line line) {
        //Intentionally left blank
    }

    /**
     * Template method for subclasses to perform operations on parsed program object.
     * @param program
     */
    protected void postParse(Program program) {
        //Intentionally left blank
    }

    /**
     * A line is parsable if it is annotated, comment or code.
     * @param line
     * @return
     */
    boolean isLineParsable(String line) {
       return isAnnotatedLine(line) || isLineComment(line) || isLineCode(line);
    }

    private boolean isAnnotatedLine(String line) {
        return line.contains(ANNOTATION_TAG);
    }

    private boolean isAnnotatedLine(Line line) {
        return isAnnotatedLine(line.getContent());
    }

    protected abstract boolean isLineComment(String line);

    protected abstract boolean isLineCode(String line);

    private void parseAnnotatedLines(List<Line> annotatedLines, final Program program) {
        annotatedLines.stream().forEachOrdered(annotatedLine -> {
            try {
                Annotation annotation = AnnotationFactory.createAnnotation(annotatedLine.getContent());

                if(annotation.getType() == AnnotationType.NAME) {
                    program.setName(annotation.getText());
                } else if(annotation.getType() == AnnotationType.GOAL_DESCRIPTION) {
                    program.setGoalDescription(annotation.getText());
                } else if(annotation.getType() == AnnotationType.DISTRACTOR) {
                    Tile distractorTile = parseDistractorTile(annotation);
                    program.addDistractor(distractorTile);
                } else if(annotation.getType() == AnnotationType.INPUT) {
                    program.addUserInput(annotation.getText());
                } else {
                    Line commentedLine = program.findLineByNumber(annotatedLine.getNumber() + 1);

                    if(annotation.getType() == AnnotationType.HELP_DESCRIPTION) {
                        commentedLine.addComment(annotation.getText());
                    } else if (annotation.getType() == AnnotationType.BLANK) {
                        Tile blankLine = program.getBlankLineByLine(commentedLine);
                        if(blankLine == null) {
                            Tile tile = new Tile(commentedLine, annotation.getText());
                            program.addBlankLine(tile);
                        } else {
                            blankLine.addHelp(annotation.getText());
                        }

                    }
                }
            } catch (AnnotationMissingSymbolException e) {
                System.err.println("Exception at comment parsing: ActivityName=" + program.getActivityName() + ", Goal=" + program.getGoalDescription() + ",line=" + annotatedLine.getContent());
                throw e;
            }
        });
    }

    private Tile parseDistractorTile(Annotation annotation) {
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