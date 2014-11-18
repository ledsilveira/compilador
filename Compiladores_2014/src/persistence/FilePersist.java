package persistence;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FilePersist {

	public Boolean saveFile(String inputText, String filePath) {
		File f = new File(filePath);
		if(!f.exists()) {
			try { 
				f.createNewFile();
			} catch (IOException e) {
				return false;
			}
		}
		try {
			FileUtils.writeStringToFile(f, inputText);
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	public String loadFile(String filePath) {
		String s = "";
		File f = new File(filePath);
		if(!f.exists()) s = "N�o foi poss�vel encontrar o arquivo especificado.";
		else {
			try {
				s = FileUtils.readFileToString(f);
			} catch (IOException e) {
				s = "N�o foi poss�vel ler o arquivo especificado.";
				e.printStackTrace();
			}
		}
		return s;
	}

}
