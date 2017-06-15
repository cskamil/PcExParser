package parser;

import java.nio.file.Path;

public class JavaParser extends AbstractLanguageParser {

    public JavaParser(Path path) {
        super(path);
    }

    @Override
    protected boolean isLineComment(String line) {
        return line.startsWith("//");
    }

    @Override
    protected boolean isLineCode(String line) {
        return  !line.trim().isEmpty() &&
                !line.startsWith("package") &&
                !line.startsWith("/**") &&
                !line.startsWith("*/");
    }

}
