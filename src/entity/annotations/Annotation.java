package entity.annotations;

public class Annotation {
	
	private AnnotationType type;
	private String text;
	
	public Annotation(AnnotationType type, String text) {
		this.type = type;
		this.text = text;
	}
	
	public AnnotationType getType() {
		return type;
	}
	public void setType(AnnotationType type) {
		this.type = type;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
