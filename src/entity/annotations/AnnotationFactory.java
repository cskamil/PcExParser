package entity.annotations;

public class AnnotationFactory {
	
	public static Annotation createAnnotation(String content) {
		AnnotationType contentType = AnnotationType.checkType(content);
		int startIndex;
		int endIndex;
		try{
			startIndex = content.indexOf(contentType.getStartSymbol());
			endIndex = content.lastIndexOf(contentType.getEndSymbol());
		} catch(NullPointerException e) {
			e.printStackTrace();
			throw e;
		}


		if(startIndex < 0 || endIndex < 0) {
			throw new AnnotationMissingSymbolException(contentType);
		}

		String text = content.substring(startIndex+1, endIndex);
		return new Annotation(contentType, text);
	}

}
