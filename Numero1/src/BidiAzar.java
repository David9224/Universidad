/** 
  <b>Nombre: </b>Llena un arreglo bidimensional de números al azar<br>
  * @author Rafael Alberto Moreno Parra
  * @version 1.00
*/
import java.util.*;


public class BidiAzar
{
    public static void main (String args[])
    {
	Random Aleatorio = new Random(); //Define un objeto para manejar numeros aleatorios

        int Arreglo[][] = new int [10][10];
	int Columna, Fila;

	for (Fila = 0; Fila < 10; Fila++)
	    for (Columna = 0; Columna < 10; Columna++)
		Arreglo[Fila][Columna] = Math.abs(Aleatorio.nextInt() % 10);

        for (Fila = 0; Fila < 10; Fila++)
        {
	    for (Columna = 0; Columna < 10; Columna++)
		System.out.print("(" + Fila + "," + Columna + ")=" + Arreglo[Fila][Columna] + " ");
	    System.out.println(" ");
        }
	
    }
}	