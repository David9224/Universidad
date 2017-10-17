
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davidaristizabal
 */
public class AdivinaAnimal {

    private static NodoArbol raiz;
    private Scanner in;

    /**
     * Constructor por omision. Crea el nodo raiz con un elefante
     */
    public AdivinaAnimal() {
        raiz = new NodoArbol("Elefante");
        in = new Scanner(System.in);
    }

    /**
     * Metodo para jugar a adivinar animales
     */
    public void jugar() {
        NodoArbol nodo = raiz;

        while (nodo != null) {
            if (nodo.izquierda != null) {   //Hay una pregunta
                System.out.println(nodo.valor);
                nodo = (respuesta()) ? nodo.izquierda : nodo.derecha;
            } else {  // Se tiene un animal
                System.out.println("Ya s�, es un(a) " + nodo.valor);
                if (respuesta()) {
                    System.out.println("Gane :) !!");
                } else {
                    animalNuevo(nodo);
                    nodo = null;
                }
                return;
            }
        }
    }

    /*
   * M�todo privado para leer una respuesta del usuario s�lo puede ser si o no
   * @return boolean -- true si la respuesta es si y false en otro caso.
     */
    private boolean respuesta() {

        while (true) {
            String resp = in.nextLine().toLowerCase().trim();

            if (resp.equals("si")) {
                return true;
            }
            if (resp.equals("no")) {
                return false;
            }
            System.out.println("La respuesta debe ser si o no");
        }
    }

    /**
     * M�todo para dar de alta un nuevo animal
     *
     * @param nodo -- nodo del cual se va a colgar el animal
     */
    private void animalNuevo(NodoArbol nodo) {
        String animalNodo = (String) nodo.valor;
        System.out.println("Cu�l es tu animal?");
        String nuevoA = in.nextLine();
        System.out.println("Qu� pregunta con respuesta si/no puedo hacer"
                + " para poder decir que es un(a) " + nuevoA);
        String pregunta = in.nextLine();
        NodoArbol nodo1 = new NodoArbol(animalNodo);
        NodoArbol nodo2 = new NodoArbol(nuevoA);
        System.out.println("Para un(a) " + nuevoA + " la respuesta es si/no?");
        nodo.valor = "" + pregunta + "?";
        if (respuesta()) {
            nodo.izquierda = nodo2;
            nodo.derecha = nodo1;
        } else {
            nodo.izquierda = nodo1;
            nodo.derecha = nodo2;
        }
    }

    public static void main(String[] pps) {
        System.out.println("Juguemos a adivinar animales");
        boolean otroJuego = true;
        AdivinaAnimal juego = new AdivinaAnimal();

        do {
            juego.jugar();
            System.out.println("Jugamos otra vez?");
            otroJuego = juego.respuesta();
        } while (otroJuego);
    }
}
