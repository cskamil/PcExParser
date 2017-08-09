package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The {@code Tile} class represents tiles in programs. 
 * <br>Actually, it is a {@link Line} with a String help.
 * 
 * @author cskamil
 *
 */
public class Tile extends AbstractEntity {
	
	private Line line;
	private List<String> helpList;
	
	public Tile() {
		this.helpList = new ArrayList<>();
	}
	
	public Tile(Line line, String help) {
		this();
		this.line = line;
		addHelp(help);
	}

	@Override
	public boolean equals(Object obj) {
		Tile other = (Tile)obj;

		return other.getLine().getContent().equals(getLine().getContent());
	}

	@Override
	public int hashCode() {
		return getLine().getContent().hashCode();
	}

	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}

	public List<String> getHelpList() {
		return helpList;
	}

	public void addHelp(String help) {
		helpList.add(help);
		line.addComment(help);
	}
}
