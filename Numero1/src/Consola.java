import java.io.*;


/** 
  <b>Nombre: </b>Capturar cadenas y números por teclado<br>
  * @author Rafael Alberto Moreno Parra
  * @version 1.00
*/
public class Consola
{
    /** Punto de entrada del programa
     * @param sbEtiqueta Etiqueta que sera mostrada para capturar el valor por pantalla
     * @return No retorna valor alguno
     * @exception IOException Error en la captura de datos
    */
    public String sbLeerCadena(String sbEtiqueta)
    {
        String sbCadenaEntra = new String();
        BufferedReader LeerTeclado = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print(sbEtiqueta + ": ");
            sbCadenaEntra = LeerTeclado.readLine();
        }
        catch (IOException ErrorLectura)
        {
            System.err.println("Exception: " + ErrorLectura.getMessage());
            System.exit(1);
        }
        return sbCadenaEntra;
    }

    public int iLeerNumero(String sbEtiqueta)
    {
        int iNumero=0;
        BufferedReader LeerTeclado = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print(sbEtiqueta + ": ");
	    try
	    {
            	iNumero = Integer.parseInt(LeerTeclado.readLine());
	    }
	    catch (NumberFormatException ErrorConversion)
            {
            	System.err.println("No es numero: " + ErrorConversion.getMessage());
            	System.exit(1);
            }
        }
        catch (IOException ErrorLectura)
        {
            System.err.println("Exception: " + ErrorLectura.getMessage());
            System.exit(1);
        }
        return iNumero;
    }

}
