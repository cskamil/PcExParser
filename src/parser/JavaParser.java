package parser;

import entity.Line;
import entity.Program;

import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicInteger;

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
    protected void postParse(Program program) {
        program.setLanguage(Language.JAVA);

        AtomicInteger counter = new AtomicInteger();

        program.getLineList().forEach(line -> {
            if(line.getContent().trim().endsWith("{")) {
                line.setIndentLevel(counter.getAndIncrement());
            } else if(line.getContent().trim().startsWith("}")) {
                line.setIndentLevel(counter.decrementAndGet());
            } else {
                line.setIndentLevel(counter.get());
            }
        });
    }
}
