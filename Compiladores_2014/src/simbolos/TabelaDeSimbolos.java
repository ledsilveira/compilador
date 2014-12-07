/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simbolos;

import gals.Token;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author led
 */
public class TabelaDeSimbolos {
    ArrayList<Simbolo> tabelaSimbolos = new ArrayList<Simbolo>();
    private int nivelAtual = 0;
    
    public void debugTabela()
    {
        System.out.println( "\u001B[31m----------- TABELA DE SÍMBOLOS -----------" );
        System.out.println( "\u001B[31m - NOME -    - CATEGORIA -     - Tipo da Constante -      - Valor" );
        Iterator<Simbolo> it = this.tabelaSimbolos.iterator();
        while( it.hasNext() )
        {
            Simbolo nex = (Simbolo) it.next();
            nex.debugSimbolo();
        }
        System.out.println( "\u001B[31m----------- FIM DA TABELA DE SÍMBOLOS -----------" );
        
    }
    public void adicionaSimbolo( Simbolo simbolo )
    {
        simbolo.setNivelAtual(nivelAtual);
        this.tabelaSimbolos.add(simbolo);
        this.debugTabela();
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
    public void atualizaElementoNaTS( int pos, Simbolo s)
    {
        this.tabelaSimbolos.set(pos, s);
        this.debugTabela();
    }
    
    public int retornaPosicaoSimboloPeloID(String elemento) {
        //verificar se este símbolo já foi declarado no nível atual
        
        Iterator<Simbolo> it = this.tabelaSimbolos.iterator();
        int aux = 0;
        while( it.hasNext() )
        {
            Simbolo next = it.next(); 
            if( next.getNome().equalsIgnoreCase( elemento ) && next.getNivelAtual()== this.nivelAtual )
            {
                return aux;
            }
            aux++;
        }
        return -1;
    }
    public int getNivelAtual()
    {
        return this.nivelAtual;
    }

    public void retiraVariaveisLocais() {
        System.out.println("&$&$&$&$ TABELA ANTES DE LIMPAR NIVEL");
        this.debugTabela();
        int[] paraExcluir = new int[500];
        Iterator<Simbolo> ite = this.tabelaSimbolos.iterator();
        int indice = 0;
        int aux = 0;
        while( ite.hasNext() )
        {
            Simbolo s = ite.next(); 
            if( s.getNivelAtual()== this.nivelAtual )
            {
                paraExcluir[aux] = indice;
                aux++;
            }
            indice++;
        }
        
        for(int i =aux-1; i >= 0; i--)
        {
            if( paraExcluir[i] >= 0 )
            {
                System.out.println(paraExcluir[i]);
                this.tabelaSimbolos.remove(paraExcluir[i]); 
            }
        }
        
        System.out.println("&$&$&$&$ TABELA DEPOIS DE LIMPAR NIVEL");
        this.debugTabela();
        
    }
}
