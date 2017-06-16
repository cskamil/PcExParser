package parser;

import parser.json.entity.Program;

import java.nio.file.Path;

public class JavaParser extends AbstractLanguageParser {

    public JavaParser(Path path) {
        super(path);
    }

    @Override
    protected boolean isLineComment(String line) {
        return line.trim().startsWith("//");
    }

    @Override
    protected boolean isLineCode(String line) {
        line = line.trim();

        return  !line.isEmpty() &&
                !line.startsWith("package") &&
                !line.startsWith("/**") &&
                !line.startsWith("*") &&
                !line.startsWith("*/");
    }

    @Override
    protected void afterParse(Program program) {
        program.setLanguage(Language.JAVA);
    }
}
