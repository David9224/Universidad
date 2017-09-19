/** 
  <b>Nombre: </b>Definición Arreglos Tridimensionales<br>
  * @author Rafael Alberto Moreno Parra
  * @version 1.00
*/
public class Tridimensional
{
    static public void main(String argv[])
    {
	Consola objTeclado = new Consola();
	int iFilas = objTeclado.iLeerNumero("Digite Numero de Filas");
	int iColumnas = objTeclado.iLeerNumero("Digite Numero de Columnas");
	int iProfundidad = objTeclado.iLeerNumero("Digite Numero de Profundidad");

	int iTablero[][][] = new int[iFilas][iColumnas][iProfundidad];

	System.out.println("Numero de Filas es: " + iTablero.length);
	System.out.println("Numero de columnas en la Fila 0 es: " + iTablero[0].length);
	System.out.println("Numero de columnas en la Fila 1 es: " + iTablero[0].length);

	System.out.println("Numero de Profundidad en la Fila 0 columna 0 es: " + iTablero[0][0].length);
	System.out.println("Numero de Profundidad en la Fila 0 columna 1 es: " + iTablero[0][1].length);
	System.out.println("Numero de Profundidad en la Fila 0 columna 2 es: " + iTablero[0][2].length);

	System.out.println("Numero de Profundidad en la Fila 2 columna 0 es: " + iTablero[2][0].length);
	System.out.println("Numero de Profundidad en la Fila 2 columna 1 es: " + iTablero[2][1].length);
	System.out.println("Numero de Profundidad en la Fila 2 columna 2 es: " + iTablero[2][2].length);
    }
}
