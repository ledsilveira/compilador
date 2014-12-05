/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simbolos;

import gals.Token;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author led
 */
public class TabelaDeSimbolos {
    ArrayList<Simbolo> tabelaSimbolos = new ArrayList<Simbolo>();
    private int nivelAtual = 0;
    
    
    public void adicionaSimbolo( Simbolo simbolo )
    {
        this.tabelaSimbolos.add(simbolo);
    }
    public void setaNivelAtual(int a)
    {
        this.nivelAtual = a;
    }

    public boolean verificaIdDeclarado(Token token) {
        //verificar se este símbolo já foi declarado no nível atual
        
        String elemento = token.getLexeme();
        Iterator<Simbolo> it = this.tabelaSimbolos.iterator();
        while( it.hasNext() )
        {
            Simbolo next = it.next(); 
            if( next.getNome().equalsIgnoreCase( elemento ) && next.getNivelAtual()== this.nivelAtual )
            {
                return true;
            }
        }
        return false;
    }
    public int  getQuantiTotalElements()
    {
        return this.tabelaSimbolos.size();
    }

    public Simbolo pegaSimboloDaTSpelaPosicao(int posSimboloAtual) {
        return this.tabelaSimbolos.get(posSimboloAtual); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Simbolo retornaSimboloPeloID(String elemento) {
        //verificar se este símbolo já foi declarado no nível atual
        
        Iterator<Simbolo> it = this.tabelaSimbolos.iterator();
        while( it.hasNext() )
        {
            Simbolo next = it.next(); 
            if( next.getNome().equalsIgnoreCase( elemento ) && next.getNivelAtual()== this.nivelAtual )
            {
                return next;
            }
        }
        return null;
    }
}
