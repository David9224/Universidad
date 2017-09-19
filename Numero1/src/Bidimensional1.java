/** 
  <b>Nombre: </b>Definición Arreglos Bidimensionales<br>
  * @author Rafael Alberto Moreno Parra
  * @version 1.00
*/
public class Bidimensional1
{
    static public void main(String argv[])
    {
	Consola objTeclado = new Consola();
	int TotalFilas = objTeclado.iLeerNumero("Digite Numero de Filas");
	int TotalColumnas = objTeclado.iLeerNumero("Digite Numero de Columnas");

	int Tablero[][] = new int[TotalFilas][TotalColumnas];

	//Llena el tablero de datos
	for (int Fila=0; Fila<TotalFilas; Fila++)
	    for(int Columna=0; Columna<TotalColumnas; Columna++)
	        Tablero[Fila][Columna] = 5;

	//Muestra el tablero
	for (int Fila=0; Fila<TotalFilas; Fila++)
        {
	    for(int Columna=0; Columna<TotalColumnas; Columna++)
	        System.out.print("(" + Fila + "," + Columna + ")=" + Tablero[Fila][Columna] + " ");

            System.out.println(" ");
        }
    }
}
