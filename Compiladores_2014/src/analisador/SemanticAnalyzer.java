
package analisador;

import java.util.ArrayList;
import java.util.List;
import gals.LexicalError;
import gals.SemanticError;
import gals.Semantico;
import gals.Sintatico;
import gals.SyntaticError;

import logic.message.Message;

public class SemanticAnalyzer extends Analyzer {

	@Override
	public List<Message> analyze(String code) {
            List<Message> messages = new ArrayList<Message>();
            
            Sintatico sintatico = new Sintatico();
            Semantico semantico = new Semantico();
            
            this.lexico.setInput( code );
            
            try
            {
                sintatico.parse(this.lexico, semantico);
                Message msg = new Message("Analisador semântico executado", "não encontrou erros semânticos no programa ","", 1, 0 );
                
                messages.add(msg);
                
            }
            catch( LexicalError e )
            {
                
                Message msg = new Message("Erro Léxico", "Encontrado erro na posição: " + e.getPosition(), e.getMessage(), 2, e.getPosition());
                
                messages.add(msg);
                                
                System.out.println("Erro Léxico. " + e.getMessage() + " " + e.getPosition());
            }
            catch( SyntaticError ee )
            {
                Message msg = new Message("Erro Sintático", "Encontrado erro na posição: " + ee.getPosition(), ee.getMessage(), 2, ee.getPosition());
                
                messages.add(msg);
                
                System.out.println("Erro sintático. " + ee.getMessage() + " " + ee.getPosition());
            }
            catch( SemanticError eee )
            {
                Message msg = new Message("Erro Semântico", "Encontrado erro na posição: " + eee.getPosition(), eee.getMessage(), 2, eee.getPosition());
                
                messages.add(msg);
                
                
                System.out.println("Erro semantico. Posição: " + eee.getPosition() );
            }
            
            return messages;
	}

}
