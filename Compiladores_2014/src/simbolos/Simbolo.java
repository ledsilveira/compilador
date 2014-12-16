/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simbolos;

import java.util.ArrayList;
import java.util.Iterator;

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
    protected String tipoElementosVetor;
    protected String ValorLimiteInferior;
    protected String valorLimiteSuperior;
    protected ArrayList<Simbolo> elementosVetor = new ArrayList<>();
    protected ArrayList<Simbolo> elementosRegistro;

    public String getTipoElementosVetor() {
        return tipoElementosVetor;
    }

    public void setTipoElementosVetor(String tipoElementosVetor) {
        this.tipoElementosVetor = tipoElementosVetor;
    }

    public String getValorLimiteInferior() {
        return ValorLimiteInferior;
    }

    public void setValorLimiteInferior(String ValorLimiteInferior) {
        this.ValorLimiteInferior = ValorLimiteInferior;
    }

    public String getValorLimiteSuperior() {
        return valorLimiteSuperior;
    }

    public void setValorLimiteSuperior(String valorLimiteSuperior) {
        this.valorLimiteSuperior = valorLimiteSuperior;
    }

    public ArrayList<Simbolo> getElementosVetor() {
        return elementosVetor;
    }

    public void setElementosVetor(ArrayList<Simbolo> elementosVetor) {
        this.elementosVetor = elementosVetor;
    }
    

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
        this.elementosRegistro = new ArrayList<>();
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
        this.elementosRegistro = new ArrayList<>();
    }

    public ArrayList<Simbolo> getElementosRegistro() {
        return elementosRegistro;
    }

    public void setElementosRegistro(ArrayList<Simbolo> elementosRegistro) {
        this.elementosRegistro = elementosRegistro;
    }
    
    public void debugSimbolo()
    {
        System.out.println( this.nome +"    -   "+this.categoria+"    -    "+this.tipo+"    -    "+this.valor  );
    }

    public void dedugVetor() {
        Iterator<Simbolo> elVet = this.elementosVetor.iterator();
        while( elVet.hasNext() )
        {
            Simbolo eleVet = (Simbolo) elVet.next();
            System.out.println( "Elemento vetor: "+this.nome+" | "+eleVet.getNome() +"    -   "+eleVet.getCategoria()+"    -    "+eleVet.getTipo()+"    -    "+this.valor  );
        }
    }
    
    public void dedugRegistro() {
        Iterator<Simbolo> elRet = this.elementosRegistro.iterator();
        while( elRet.hasNext() )
        {
            Simbolo simboloRegistro = (Simbolo) elRet.next();
            System.out.println( "Elemento Registro: "+this.nome+" | "+simboloRegistro.getNome() +"    -   "+simboloRegistro.getCategoria()+"    -    "+simboloRegistro.getTipo()+"    -    " );
        }
    }
}
