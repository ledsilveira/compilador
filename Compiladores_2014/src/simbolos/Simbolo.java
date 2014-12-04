/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simbolos;

/**
 *
 * @author led
 */
public class Simbolo {
    protected String nome;
    protected String categoria;
    protected int nivelDeclarado;
    private int deslocamento;

    public Simbolo( String nome, String categoria )
    {
        this.nome = nome;
        this.categoria = categoria;
        this.nivelDeclarado = 0;
    }
    public void debugSimbolo()
    {
        System.out.println( this.nome +"    -   "+this.categoria );
    }
}
