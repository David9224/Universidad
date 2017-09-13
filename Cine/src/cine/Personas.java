/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author estudiante
 */
public class Personas {

    private int edad;

    /**
     * Constructor por defecto
     *
     * @param edad
     */
    public Personas(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve la edad
     *
     * @return Edad acutal
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad
     *
     * @param edad Valor edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "edad=" + edad ;
    }
}
