
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class Adivino {

    private Scanner in;
    private Arbol raiz;

    public Adivino() {
        raiz = new Arbol("Pajaro");
        in = new Scanner(System.in);
    }

    public boolean si(String pregunta) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(pregunta);
        String respuesta = entrada.readLine();
        return (respuesta.toLowerCase().equalsIgnoreCase("s"));
    }

    public void adivina() throws IOException {
        Arbol nodo = raiz;
        while (nodo != null) {
            if (nodo.getIzq() != null) {
                nodo = (si(nodo.getValor())) ? nodo.getIzq() : nodo.getDer();
            } else {
                if (si("Esta pensando en un animal?")) {
                    if (si("Es un " + nodo.getValor())) {
                        System.out.println("Soy El Mejor Adivinador!!!");
                    } else {
                        aprende(nodo);
                        nodo = null;
                        adivina();
                    }
                    return;
                } else {
                    System.out.println("Bye!!!!");
                    return;
                }
            }
        }
    }

    public void aprende(Arbol nodo) throws IOException {
        String animalNodo = (String) nodo.getValor();
        System.out.println("Como se llama el animal?");
        String nuevoA = in.nextLine();
        System.out.println("Que pregunta distinguiria a un " + nuevoA + " de un " + animalNodo);
        String pregunta = in.nextLine();
        Arbol nodo1 = new Arbol(animalNodo);
        Arbol nodo2 = new Arbol(nuevoA);
        nodo.setValor("" + pregunta + "?");
        if (si("Si el animal fuera un " + nuevoA + ", cual seria la respuesta?")) {
            nodo.setIzq(nodo2);
            nodo.setDer(nodo1);
        } else {
            nodo.setIzq(nodo1);
            nodo.setDer(nodo2);
        }
    }
}
