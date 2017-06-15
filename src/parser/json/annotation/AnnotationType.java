package parser.json.annotation;

public enum AnnotationType {
	
	BLANK("@blank", "(", ")"),
	CORRECT_OUTPUT("@correctOutput", "(", ")"),
	DISTRACTOR("@distractor", "{", "}"),
	GOAL_DESCRIPTION("@goalDescription", "(", ")"),
	HELP_DESCRIPTION("@helpDescription", "(", ")"),
	INPUT("@input", "(", ")");
	
	private String annotationStyle;
	private String startSymbol;
	private String endSymbol;

	private AnnotationType(String annotationStyle, String startSymbol, String endSymbol) {
		this.annotationStyle = annotationStyle;
		this.startSymbol = startSymbol;
		this.endSymbol = endSymbol;
	}
	
	public String getAnnotationStyle() {
		return annotationStyle;
	}
	
	public String getStartSymbol() {
		return startSymbol;
	}
	
	public String getEndSymbol() {
		return endSymbol;
	}
	
	public static AnnotationType checkType(String line) {
		for (AnnotationType type : values()) {
			if(line.contains(type.getAnnotationStyle())) {
				return type;
			}
		}
		
		return null;
	}
}
