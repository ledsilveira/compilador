/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package analisador;

import java.util.ArrayList;

/**
 *
 * @author led
 */
public class SymbolTable {
    ArrayList<Object> tabelaSimbolos = new ArrayList<Object>();
    private int nivelAtual = 0;
    
    public void adicionaSimbolo( Object simbolo )
    {
        this.tabelaSimbolos.add(simbolo);
    }
    public void setaNivelAtual(int a)
    {
        this.nivelAtual = a;
    }
}
