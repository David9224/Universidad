/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davidaristizabal
 */
public class Arbol {

    private String valor;
    private Arbol izq;
    private Arbol der;

    public Arbol(String valor) {
        this.valor = valor;
    }

    public Arbol(String valor, Arbol izq, Arbol der) {
        this.valor = valor;
        this.izq = izq;
        this.der = der;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Arbol getIzq() {
        return izq;
    }

    public void setIzq(Arbol izq) {
        this.izq = izq;
    }

    public Arbol getDer() {
        return der;
    }

    public void setDer(Arbol der) {
        this.der = der;
    }

}
