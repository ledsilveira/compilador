package gals;

import persistence.FilePersist;

public class FileManager {
	
	FilePersist persist = new FilePersist();

	public Boolean saveFile(String inputText, String filePath) {
		return persist.saveFile(inputText, filePath);
	}
	
	public String loadFile(String filePath) {
		return persist.loadFile(filePath);
	}

}
