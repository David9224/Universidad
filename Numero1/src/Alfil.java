/* Coloca un alfil en un tablero de ajedrez al azar y marca las diagonales de ataque */
import java.util.*;

class Alfil
{
    public static void main (String sbParametro[])
    {
        int Cont, ContX, ContY, PosX, PosY;
	Random Aleatorio = new Random();
	int Ajedrez[][] = new int[8][8];

        //Inicializar el tablero de Ajedrez
	for (ContX=0; ContX < 8; ContX++)
	    for (ContY=0; ContY < 8; ContY++)
	        Ajedrez[ContX][ContY] = 0;

        //Posición al azar del alfil
	PosX = Math.abs(Aleatorio.nextInt()%8);
	PosY = Math.abs(Aleatorio.nextInt()%8);
	Ajedrez[PosX][PosY] = 1; //Alfil

        //Amenazas del Alfil
	for(Cont=1; PosX+Cont<=7 && PosY+Cont<=7; Cont++)
  	    Ajedrez[PosX+Cont][PosY+Cont]=2;

	for(Cont=1; PosX-Cont>=0 && PosY-Cont>=0; Cont++)
	    Ajedrez[PosX-Cont][PosY-Cont]=2;

	for(Cont=1; PosX-Cont>=0 && PosY+Cont<=7; Cont++)
	    Ajedrez[PosX-Cont][PosY+Cont]=2;

	for(Cont=1; PosX+Cont<=7 && PosY-Cont>=0; Cont++)
  	    Ajedrez[PosX+Cont][PosY-Cont]=2;

        //Imprimir el tablero tal y como es un arreglo bidimensional en memoria
        for (ContY=7; ContY >= 0; ContY--)
        {
            for (ContX=0; ContX < 8; ContX++)
                System.out.print(Ajedrez[ContX][ContY]);
            System.out.println(" ");
        }
   }
}





