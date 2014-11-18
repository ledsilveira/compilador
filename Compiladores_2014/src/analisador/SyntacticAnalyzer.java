package analisador;

import java.util.ArrayList;
import java.util.List;
import gals.LexicalError;
import gals.Lexico;
import gals.SemanticError;
import gals.Sintatico;
import gals.Semantico;
import gals.SyntaticError;
import logic.message.Message;

public class SyntacticAnalyzer extends Analyzer {

	
    @Override
	public List<Message> analyze(String code)
        {
            List<Message> messages = new ArrayList<Message>();
            
            Sintatico sintatico = new Sintatico();
            Semantico semantico = new Semantico();
            
            this.lexico.setInput( code );
            
            try
            {
                sintatico.parse(this.lexico , null);
                Message msg = new Message("Analisador sintático executado", "não encontrou erros sintáticos no programa ","", 1, 0 );
                
                messages.add(msg);
                
            }
            catch( LexicalError e )
            {
                
                Message msg = new Message("Erro Léxico", "Encontrado erro na posição: " + e.getPosition(), e.getMessage(), 2, e.getPosition());
                
                messages.add(msg);
                                
                System.out.println("Erro. " + e.getMessage() + " " + e.getPosition());
            }
            catch( SyntaticError ee )
            {
                Message msg = new Message("Erro Sintático", "Encontrado erro na posição: " + ee.getPosition(), ee.getMessage(), 2, ee.getPosition());
                
                messages.add(msg);
                
                System.out.println("Erro. " + ee.getMessage() + " " + ee.getPosition());
            }
            catch( SemanticError eee )
            {
               // Message msg = new Message("Erro Semântico", "Encontrado erro na posição: " + eee.getPosition(), eee.getMessage(), 2, eee.getPosition());
                
               // messages.add(msg);
                
               // System.out.println("Erro. " + eee.getMessage() + " " + eee.getPosition());
            }
            
            return messages;
	}

}
