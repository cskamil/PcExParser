package parser.json.entity;

/**
 * The {@code Line} class represents the lines in a programs.
 * 
 * @author cskamil
 *
 */
public class Line extends AbstractEntity {

	private int number;
	private String content;
	private String comment;
	
	public Line() {
		this.comment = "";
	}
	
	public Line(int number, String content) {
		this();
		this.number = number;
		this.content = content;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Line " + number + "," + content + "," + comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
