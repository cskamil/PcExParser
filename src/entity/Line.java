package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Line} class represents the lines in a programs.
 * 
 * @author cskamil
 *
 */
public class Line extends AbstractEntity {

	private int number;
	private String content;
	private List<String> commentList;
	private int indentLevel;
	
	public Line() {
		this.commentList = new ArrayList<>();
		this.indentLevel = 0;
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
	
	public int getIndentLevel() {
		return indentLevel;
	}

	public void setIndentLevel(int indentLevel) {
		this.indentLevel = indentLevel;
	}

	public List<String> getCommentList() {
		return commentList;
	}

	public void addComment(String comment) {
		this.commentList.add(comment);
	}
}
