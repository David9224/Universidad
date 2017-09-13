
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        Integer tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del cuadrado"));
        Integer cuadrado[][] = new Integer[tamanio][tamanio];
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                cuadrado[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato para la posicion: " + i + " ," + j));
            }
        }
        suma = sumaDiagonal(cuadrado);
        if (suma == sumaDiagonalInvertida(cuadrado)) {
            System.out.println("es cuadrado magico");
        }
    }

    public static int sumaDiagonal(Integer cuadrado[][]) {
        int suma = 0;
        for (int i = 0; i < cuadrado.length; i++) {
            System.out.println("" + cuadrado[i][i]);
            suma += cuadrado[i][i];
        }
        return suma;
    }

    public static int sumaDiagonalInvertida(Integer cuadrado[][]) {
        int suma = 0;
        int j = 0;
        for (int i = cuadrado.length - 1; i >= 0; i--) {
            System.out.println("" + cuadrado[j][i]);
            suma += cuadrado[j][i];
            j++;
        }
        System.out.println("diagonalinv " + suma);
        return suma;
    }

    public static void mayorYMenor() {
        int tamanioArreglo = 0;
        int maximo = 0, minimo = 100, ocuMaximo = 0, ocuMinimo = 0;
        tamanioArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la lista"));
        ArrayList<Integer> posMaximo = new ArrayList<>();
        ArrayList<Integer> posMinimo = new ArrayList<>();
        Integer arreglo[] = new Integer[tamanioArreglo];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato para la posicion: " + i));
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }

            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == maximo) {
                ocuMaximo += 1;
                posMaximo.add(i);
            }

            if (arreglo[i] == minimo) {
                ocuMinimo += 1;
                posMinimo.add(i);
            }
        }

        System.out.println("Numero Maximo " + maximo + " Ocurrencias: " + ocuMaximo);
        for (int i = 0; i < posMaximo.size(); i++) {
            System.out.println("Posicion Maximo " + posMaximo.get(i));
        }
        System.out.println("Numero Minimo " + minimo + " Ocurrencias: " + ocuMinimo);
        for (int i = 0; i < posMinimo.size(); i++) {
            System.out.println("Posicion Minimo " + posMinimo.get(i));
        }
    }
}
