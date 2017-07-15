package entity;

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
	
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
}
