/** 
  <b>Nombre: </b>Definición Arreglos Bidimensionales<br>
  * @author Rafael Alberto Moreno Parra
  * @version 1.00
*/
public class Bidimensional2
{
    static public void main(String argv[])
    {
	Consola objTeclado = new Consola();
	int iFilas = objTeclado.iLeerNumero("Digite Numero de Filas");
	int iColumnas = objTeclado.iLeerNumero("Digite Numero de Columnas");

	int iTablero[][] = new int[iFilas][iColumnas];

	int iCont = iTablero.length;
	System.out.println("Tamano Filas es: " + iCont);

    }
}
