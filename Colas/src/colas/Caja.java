/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
public class Caja {

    LinkedList<Persona> colaCajero = new LinkedList<>();

    public void llegaACaja(Persona persona) {
        colaCajero.push(persona);
        System.out.println("Personas en cola " + colaCajero.size());
    }

    public void saleDeCaja() {
        try {
            while (!colaCajero.isEmpty()) {
                long init = System.currentTimeMillis();
                System.out.println("va a atender cliente");
                Thread.sleep(3000);
                colaCajero.pop();
                long end = System.currentTimeMillis();
                System.out.println("Tiempo en atender " + ((end - init) / 1000) + " segundos");
                System.out.println("Sale cliente");
                System.out.println("Personas en cola " + colaCajero.size());
            }
        } catch (InterruptedException ex) {
            System.out.println("Error " + ex.toString());
        }
    }
}
