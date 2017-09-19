
import java.util.LinkedList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davidaristizabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Persona> lstAmigos = new LinkedList<>();
        LinkedList<Persona> equipo1 = new LinkedList<>();
        LinkedList<Persona> equipo2 = new LinkedList<>();
        boolean turnoEquipo1 = true;

        int low = 5;
        int high = 10;
        Random random = new Random();
        int totalAmigos = random.nextInt(high - low) + low;
        for (int i = 0; i <= totalAmigos; i++) {
            Persona persona = new Persona(lstAmigos.size() + 1);
            lstAmigos.add(persona);
        }
        System.out.println("amigos "+lstAmigos);
        for (int i = 0; i < lstAmigos.size(); i++) {
            System.out.println("index "+i);
            Persona pe = lstAmigos.get(i);
            int lowDado = 1;
            int highDado = 6;
            int numeroDado = random.nextInt(highDado - lowDado) + lowDado;
            int numeroPosicion = 0;
            System.out.println("Numero dado " + numeroDado);

            if (turnoEquipo1) {
                numeroPosicion = i + (numeroDado - 1);
                lstAmigos.set(numeroPosicion, pe);
                System.out.println("se movio " + numeroDado + " posiciones a la derecha, posicion " + numeroPosicion);
                equipo1.add(pe);
                System.out.println("Se unio amigo #" + pe.getNumero() + " al equipo1");
                turnoEquipo1 = false;
            } else {
                if (numeroDado > i) {
                    numeroDado = (numeroDado - 1) - i;
                    numeroPosicion = lstAmigos.size() - numeroDado;
                }
                lstAmigos.set(numeroPosicion, pe);
                System.out.println("se movio " + numeroDado + " posiciones a la izquierda, posicion " + numeroPosicion);
                equipo2.add(pe);
                System.out.println("Se unio amigo #" + pe.getNumero() + " al equipo2");
                turnoEquipo1 = true;
            }
        }

        System.out.println("equipo1 " + equipo1);
        System.out.println("equipo2 " + equipo2);
    }

}
