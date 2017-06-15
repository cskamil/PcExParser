package parser;

import java.nio.file.Path;

public class ParserFactory {
	
	public static LanguageParser create(Path path) {
		String fileName = path.getFileName().toString();
		
		if(fileName.endsWith(Language.JAVA.getExtension())) {
			return new JavaParser();
		} else if(fileName.endsWith(Language.PYTHON.getExtension())) {
			return new PythonParser();
		} 
		
		throw new RuntimeException("Unsupported file type: " + path.toString());
	}
}
