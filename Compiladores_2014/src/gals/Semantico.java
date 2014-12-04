package gals;

import simbolos.Simbolo;
import simbolos.TabelaDeSimbolos;

public class Semantico implements Constants
{
    TabelaDeSimbolos ts;
    Boolean Le_VAR;
    Boolean eh_registro;
    int nivel_atual;
    int deslocamento;
    int POSID;
    public  Semantico()
    {
         this.ts = new TabelaDeSimbolos();
        
    }
    public void executeAction(int action, Token token)	throws SemanticError
    {
        System.out.println("Ação #"+action+", Token: "+token);
        switch( action )
        {
            case 101:
                this.metodo101( token );
                break;
            case 102:
                this.metodo102( token );
                break;
            case 103:
                this.metodo103( token );
                break;
        }
    }	

    private void metodo101(Token token) throws SemanticError {
        //instancia simbolo    
        Simbolo s = new Simbolo( token.getLexeme(),"ID-PROGRAMA" );
        s.setNivelAtual(0);
        s.setDeslocamento(0);
        //grava nivel atual da tabela de símbolos
        ts.setaNivelAtual(0);
        ts.adicionaSimbolo(s);
        //instancia valores
        this.eh_registro = false;
        this.Le_VAR = false;
        
        //throw new SemanticError("Not supported yet.", token.getPosition() ); //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo102(Token token) throws SemanticError {
        if ( this.ts.verificaIdDeclarado(token) )
        {
            throw new SemanticError("ID já declarado.", token.getPosition() );
        }
        Simbolo s = new Simbolo( token.getLexeme(),"ID-CONST" );
        s.setNivelAtual(0);
        this.ts.adicionaSimbolo(s);
        int posSimboloAtual = this.ts.getQuantiTotalElements()-1;
        this.POSID = posSimboloAtual;
    }

    private void metodo103(Token token) throws SemanticError {
        throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
}
