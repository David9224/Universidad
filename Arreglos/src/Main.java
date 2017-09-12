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
        Arreglos arreglos = new Arreglos();
        //arreglos.matrizMagica();
        
        OrdenamientoBurbuja ordenamientoBurbuja = new OrdenamientoBurbuja();
        //ordenamientoBurbuja.ordenaArreglo();
        
        OrdenamientoSeleccion ordenamientoSeleccion = new OrdenamientoSeleccion();
        ordenamientoSeleccion.ordenaArreglo();
    }
    
}
