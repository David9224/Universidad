
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davidaristizabal
 */
public class OrdenamientoSeleccion {

    private int[] arr;

    public void ordenaArreglo() {
        iniciaLista();
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index  
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        imprimeLista();
    }

    private void iniciaLista() {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la lista"));
        arr = new int[tam];

        for (int i = 0; i < tam; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la posicion " + i));
        }
    }

    private void imprimeLista() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
