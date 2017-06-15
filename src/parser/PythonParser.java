package parser;

import parser.json.entity.Program;

import java.nio.file.Path;

public class PythonParser extends AbstractLanguageParser {

    public PythonParser(Path path) {
        super(path);
    }

    @Override
    protected Program parsePath(Path path) {
        return null;
    }
}
