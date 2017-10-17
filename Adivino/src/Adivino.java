
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    
    private boolean si(String pregunta) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(pregunta);
        String respuesta = entrada.readLine();
        return (respuesta.toLowerCase().equalsIgnoreCase("s"));
    }
    
    public void adivina() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Arbol a = null;
        String animal = null;
        String nuevo = null;
        String info = null;
        String indicador = null;
        if (si("Esta Pensando en un animal?")) {
            a = new Arbol("Pajaro");

            while (a.getIzq() != null) {
                if (si(a.getValor() + "? ")) {
                    a = a.getIzq();
                } else {
                    a = a.getDer();
                }
            }
            animal = a.getValor();

            if (si("Es un " + animal + "? ")) {
                System.out.println("¡Soy el mejor Adivinador!");
            } else {
                System.out.println("Como se llama el animal?");
                nuevo = entrada.readLine();
                System.out.println("Que diferencia a un " + animal + " de un " + nuevo + " ? ");
                info = entrada.readLine();
                indicador = "si el animal fuera un " + nuevo + " cual seria la respuesta";
                a.setValor(nuevo);
                if (si(indicador)) {
                    a.setIzq(new Arbol(animal));
                    a.setDer(new Arbol(nuevo));
                } else {
                    a.setDer(new Arbol(animal));
                    a.setIzq(new Arbol(nuevo));
                }
                adivina();
            }
        } else {
            System.out.println("Bye");;
        }
    }
}
