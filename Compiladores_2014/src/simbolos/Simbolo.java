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
public class Simbolo {
    protected String nome;
    protected String categoria;
    protected int nivelAtual;
    protected int deslocamento;
    protected String tipo;
    protected String valor;
    protected String MPP;
    protected String tipoIndiceVetor;

    public String getTipoIndiceVetor() {
        return tipoIndiceVetor;
    }

    public void setTipoIndiceVetor(String tipoIndiceVetor) {
        this.tipoIndiceVetor = tipoIndiceVetor;
    }

    public String getMPP() {
        return MPP;
    }

    public void setMPP(String MPP) {
        this.MPP = MPP;
    }

    public ArrayList<Simbolo> getListaPar() {
        return ListaPar;
    }

    public void setListaPar(ArrayList<Simbolo> ListaPar) {
        this.ListaPar = ListaPar;
    }
    ArrayList<Simbolo> ListaPar = new ArrayList<>();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Simbolo(String nome) {
        this.nome = nome;
        this.nivelAtual = 0;
        this.categoria = "";
        this.deslocamento = 0;
        this.valor = "";
        this.tipo = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNivelAtual() {
        return nivelAtual;
    }

    public void setNivelAtual(int nivelAtual) {
        this.nivelAtual = nivelAtual;
    }

    public int getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(int deslocamento) {
        this.deslocamento = deslocamento;
    }

    public Simbolo( String nome, String categoria )
    {
        this.nome = nome;
        this.categoria = categoria;
        this.nivelAtual = 0;
        this.deslocamento = 0;
        this.valor = "";
        this.tipo = "";
    }

    public void debugSimbolo()
    {
        System.out.println( this.nome +"    -   "+this.categoria+"    -    "+this.tipo+"    -    "+this.valor  );
    }
}
