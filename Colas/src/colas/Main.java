package colas;

import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int low = 0;
        int high = 3000;
        long end = 0;
        long actual = 0;
        long init = System.currentTimeMillis();
        long random = new Random().nextInt(high - low) + low;
        System.out.println("total tiempo " + random);
        Caja caja = new Caja();
        while (random > actual) {
            Persona persona = new Persona(new Random().nextInt());
            System.out.println("llega a caja persona " + persona.getNumero());
            caja.llegaACaja(persona);
            end = System.currentTimeMillis();
            actual = end - init;
            System.out.println("actual " + actual);
        }

        caja.saleDeCaja();
    }

}
