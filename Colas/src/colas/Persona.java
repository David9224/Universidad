/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author estudiante
 */
public class Persona {

    private String nombre;
    private int cantidadArticulos;

    public Persona() {
    }

    public Persona(String nombre, int cantidadArticulos) {
        this.nombre = nombre;
        this.cantidadArticulos = cantidadArticulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }
}
