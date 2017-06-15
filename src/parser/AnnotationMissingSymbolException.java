package parser;


import parser.json.annotation.AnnotationType;

public class AnnotationMissingSymbolException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public AnnotationMissingSymbolException(AnnotationType type) {
		super("Missing Symbol at annotation declaration: type=" + type.name());
	}

}
