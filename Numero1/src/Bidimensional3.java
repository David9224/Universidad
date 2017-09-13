/** 
  <b>Nombre: </b>Definición Arreglos Bidimensionales<br>
  * @author Rafael Alberto Moreno Parra
  * @version 1.00
*/
public class Bidimensional3
{
    static public void main(String argv[])
    {
	Consola objTeclado = new Consola();
	int iFilas = objTeclado.iLeerNumero("Digite Numero de Filas");
	int iColumnas = objTeclado.iLeerNumero("Digite Numero de Columnas");

	int iTablero[][] = new int[iFilas][iColumnas];

	int iCont = iTablero[0].length;
	System.out.println("Numero de columnas en la Fila 0 es: " + iCont);

	iCont = iTablero[1].length;
	System.out.println("Numero de columnas en la Fila 1 es: " + iCont);

	iCont = iTablero[2].length;
	System.out.println("Numero de columnas en la Fila 2 es: " + iCont);
    }
}
