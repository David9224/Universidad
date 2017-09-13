/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author estudiante
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        List<Personas> lstPersonas = new ArrayList<>();

        Random random = new Random();
        int Low = 5;
        int High = 60;
        Random cola = new Random();
        for (int i = 0; i <= cola.nextInt(50); i++) {
            lstPersonas.add(new Personas(random.nextInt(High - Low) + Low));
        }
        System.out.println("lista " + lstPersonas);
        System.out.println("totalPersonas " + lstPersonas.size());
        int total = 0;
        for (int i = 0; i < lstPersonas.size(); i++) {
            Personas persona = lstPersonas.get(i);
            if (persona.getEdad() <= 5 && persona.getEdad() >= 10) {
                total += 2000;
            }
            if (persona.getEdad() <= 11 && persona.getEdad() >= 17) {
                total += 2500;
            }
            if (persona.getEdad() >= 18) {
                total += 3500;
            }
            lstPersonas.remove(i);
            i--;
        }

        System.out.println("Total Reacudado: $" + total);
        
        System.out.println("Lista " + lstPersonas);
    }

}
