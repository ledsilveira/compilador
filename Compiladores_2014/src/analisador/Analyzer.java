package analisador;

import java.util.List;
import gals.Lexico;

import logic.message.Message;

public abstract class Analyzer {
	
	public abstract List<Message> analyze(String code);
        
        Lexico lexico = new Lexico();
        
        
}
