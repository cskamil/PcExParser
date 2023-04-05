package parser;

public enum Language {
	JAVA("java"),
	PYTHON("py"),
  R("r");
	
	private String extension;

	private Language(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return extension;
	}
}
