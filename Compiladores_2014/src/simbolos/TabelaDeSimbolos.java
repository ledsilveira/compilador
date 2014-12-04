/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simbolos;

import java.util.ArrayList;

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
    
}
