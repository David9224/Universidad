/** 
  <b>Nombre: </b>Definición Dinámica de arreglos<br>
  * @author Rafael Alberto Moreno Parra
  * @version 1.00
*/
public class Dinamico2
{
    static public void main(String argv[])
    {
	Consola objTeclado = new Consola();
	int iTamano = objTeclado.iLeerNumero("Digite Numero");
	int iNumero[] = new int[iTamano];
	
	int iCont = iNumero.length;
	System.out.println("Tamano arreglo es: " + iCont);
    }
}
