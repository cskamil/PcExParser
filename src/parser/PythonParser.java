package parser;

import entity.Program;

import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PythonParser extends AbstractLanguageParser {

    public PythonParser(Path path) {
        super(path);
    }

    @Override
    protected boolean isLineComment(String line) {
        return line.trim().startsWith("#");
    }

    @Override
    protected boolean isLineCode(String line) {
        line = line.trim();

        return  !line.isEmpty() &&
                !line.startsWith("'''");
    }

    @Override
    protected void postParse(Program program) {
        program.setLanguage(Language.PYTHON);
        String pattern = "\\s+";
        Pattern compile = Pattern.compile(pattern);

        program.getLineList().forEach(line -> {
            Matcher matcher = compile.matcher(line.getContent());
            if(matcher.find()) {
                line.setIndentLevel(matcher.group().length() / 4);
            }
        });
    }
}
