
package analisador;

import java.util.ArrayList;
import java.util.List;
import gals.Lexico;
import gals.Token;
import gals.LexicalError;

import logic.message.Message;

public class LexiconAnalyzer extends Analyzer
{
	@Override
	public List<Message> analyze(String code)
        {
            List<Message> messages = new ArrayList<Message>();
            this.lexico.setInput( code );
            
            try
            {
                Token t = null;
                while ( (t = this.lexico.nextToken()) != null )
                {
                    System.out.println(t.getLexeme());
                }
                Message msg = new Message("Analisador Léxico executado ", " não encontrou erros léxicos no programa ","", 1, 0 );
                
                messages.add(msg);
            }
            catch( LexicalError e )
            {
                Message msg = new Message("Erro Léxico", "Encontrado erro na posição: " + e.getPosition(), e.getMessage(), 2, e.getPosition());
                
                messages.add(msg);
                System.err.println(e.getMessage() + " " + e.getPosition());
                
            }
            return messages;
	}

}
