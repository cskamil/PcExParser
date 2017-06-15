package parser.json.annotation;


public class AnnotationMissingSymbolException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public AnnotationMissingSymbolException(AnnotationType type) {
		super("Missing Symbol at annotation declaration: type=" + type.name());
	}

}
