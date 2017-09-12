
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
public class Arreglos {

    private Integer matriz[][] = null;

    public void matrizMagica() {
        String tamanio = JOptionPane.showInputDialog("Ingrese el tamaño de la matriz");
        Integer tam = Integer.parseInt(tamanio);
        int suma = 0;
        matriz = new Integer[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato para la posición " + i + " " + j));
            }
        }
        suma = diagonalPrincipal();
        if (suma == diagonal()) {
            if (suma == sumaMatriz(suma)) {
                System.out.println("La Matriz es magica");
            }
        }
    }

    private int diagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        System.out.println("suma diagonal " + suma);
        return suma;
    }

    private int diagonal() {
        int suma = 0;
        int j = 0;
        for (int i = matriz.length - 1; i >= 0; i--) {
            suma += matriz[i][j];
            j++;
        }
        System.out.println("suma diagonal " + suma);
        return suma;
    }

    private int sumaMatriz(int sumaAnt) {
        boolean magica = true;
        int suma = sumaAnt;
        for (int i = 0; i < matriz.length; i++) {
            if (suma != sumaAnt) {
                magica = false;
            }
            if (!magica) {
                break;
            }
            suma = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("suma=== " + suma);
        }
        return suma;
    }
}
