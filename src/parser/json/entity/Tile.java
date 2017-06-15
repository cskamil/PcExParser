package parser.json.entity;

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
	private String help;
	
	public Tile() {
	}
	
	public Tile(Line line, String help) {
		this.line = line;
		this.help = help;
	}
	
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
}
