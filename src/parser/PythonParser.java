package parser;

import parser.json.entity.Program;

import java.nio.file.Path;

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
                !line.startsWith("import") &&
                !line.startsWith("'''");
    }

    @Override
    protected void postParse(Program program) {
        program.setLanguage(Language.PYTHON);
    }
}
