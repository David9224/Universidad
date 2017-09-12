
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
public class OrdenamientoBurbuja {

    private int[] arr;

    public void ordenaArreglo() {
        iniciaLista();
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
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
