package parser.json.annotation;

public class AnnotationFactory {
	
	public static Annotation createAnnotation(String content) {
		AnnotationType contentType = AnnotationType.checkType(content);
		
		int startIndex = content.indexOf(contentType.getStartSymbol());
		int endIndex = content.lastIndexOf(contentType.getEndSymbol());
		
		if(startIndex < 0 || endIndex < 0) {
			throw new AnnotationMissingSymbolException(contentType);
		}
		
		String text = content.substring(startIndex+1, endIndex);
		return new Annotation(contentType, text);
	}

}
