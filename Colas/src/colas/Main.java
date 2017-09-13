package colas;

import java.util.LinkedList;
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
        String nombre = JOptionPane.showInputDialog("Nombre de la persona");
        int articulos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de articulos"));
        Persona persona = new Persona(nombre, articulos);
        Caja caja = new Caja();
        caja.llegaACaja(persona);
        caja.saleDeCaja();
    }
    
}
