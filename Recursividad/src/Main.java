
import java.util.Stack;

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
        System.out.println("factorial " + factorial(5));
        System.out.println("factorialPila "+ factorialPila(5L));
    }

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void torresHanoi(int n, char de, char hacia, char usando) {
        if (n == 1) {
            System.out.println("Moviendo disco 1en" + de + "a" + hacia);
        } else if (n > 1) {
            torresHanoi(n - 1, de, usando, hacia);
            System.out.println("Moviendo" + n + "en’" + de + "al" + hacia);
            torresHanoi(n - 1, usando, hacia, de);
        }
    }

    public static Long factorialPila(Long numero) {
        Stack<Long> pila = new Stack<Long>();
        if (numero == 0) {
            if (!pila.isEmpty()) {
                pila.pop();
            }
            return 1L;
        } else {
            pila.push(numero);
            return numero * factorialPila(numero - 1);
        }
    }
}
