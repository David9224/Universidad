
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    static Random azar = new Random();

    public static void main(String[] args) throws IOException {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        char c = chars.charAt(rnd.nextInt(chars.length()));

        System.out.println("" + c);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String s = "";
        Random random = new Random();
        int randomLen = 1 + random.nextInt(9);
        for (int i = 0; i < randomLen; i++) {
            char c1 = alphabet.charAt(random.nextInt(26));
            s += c1;
        }

        System.out.println(s);
        
        LeeArchivo();
//        GeneraArchivo();
//        ArrayList<Nodo> Objetos = new ArrayList<>();
//        LeeArchivo(Objetos);
//        System.out.println("Total nodos en la lista: " + Objetos.size());
//
//        NumeroCifras examina = new NumeroCifras();
//
//        //1. ¿Cuántos nodos hay que el numA es par y numB es impar?
//        int cuenta = 0;
//        for (int cont = 0; cont < Objetos.size(); cont++) {
//            int numA = Objetos.get(cont).getValorA();
//            int numB = Objetos.get(cont).getValorB();
//            if (examina.esPar(numA) && examina.esImpar(numB)) {
//                cuenta++;
//            }
//        }
//        System.out.println("1. ¿Cuántos nodos hay que el numA es par y numB es impar? " + cuenta);
//
//        //2. ¿Cuántos nodos hay que el numA y numB son primos?
//        cuenta = 0;
//        for (int cont = 0; cont < Objetos.size(); cont++) {
//            int numA = Objetos.get(cont).getValorA();
//            int numB = Objetos.get(cont).getValorB();
//            if (examina.esPrimo(numA) && examina.esPrimo(numB)) {
//                cuenta++;
//            }
//        }
//        System.out.println("2. ¿Cuántos nodos hay que el numA y numB son primos? " + cuenta);
//
//        //3. ¿Cuántos nodos hay que la suma de numA y numB genera un primo?
//        cuenta = 0;
//        for (int cont = 0; cont < Objetos.size(); cont++) {
//            int numA = Objetos.get(cont).getValorA();
//            int numB = Objetos.get(cont).getValorB();
//            if (examina.esPrimo(numA + numB)) {
//                cuenta++;
//            }
//        }
//        System.out.println("3. ¿Cuántos nodos hay que la suma de numA y numB genera un primo? " + cuenta);
//        //4. ¿Cuántos nodos hay que la diferencia absoluta de numA y numB genera un palíndromo?
//        cuenta = 0;
//        for (int cont = 0; cont < Objetos.size(); cont++) {
//            int numA = Objetos.get(cont).getValorA();
//            int numB = Objetos.get(cont).getValorB();
//            if (examina.esPalindromo(Math.abs(numA - numB))) {
//                cuenta++;
//            }
//        }
//        System.out.println("4. ¿Cuántos nodos hay que la diferencia absoluta de numA y numB genera un palíndromo ? " + cuenta);
//        //5. ¿Cuántos nodos hay que un número sólo tenga cifras pares y el otro tenga cifras impares?
//        cuenta = 0;
//        for (int cont = 0; cont < Objetos.size(); cont++) {
//            int numA = Objetos.get(cont).getValorA();
//            int numB = Objetos.get(cont).getValorB();
//            if ((examina.todasCifrasPares(numA) && examina.todasCifrasImpares(numB))
//                    || (examina.todasCifrasImpares(numA) && examina.todasCifrasPares(numB))) {
//                cuenta++;
//            }
//        }
//        System.out.println("5. ¿Cuántos nodos hay que un número sólo tenga cifras pares y el otro tenga cifras impares? " + cuenta);

    }
    //Crea un archivo binario con dos enteros en cada registro

    public static void GeneraArchivo() {
        System.out.println("Generando archivo...");
        //try (DataOutputStream ObjDato = new DataOutputStream(new FileOutputStream("D:\\Datos.dat"));) {
        try (DataOutputStream ObjDato = new DataOutputStream(new FileOutputStream("/Users/davidaristizabal/Universidad/Datos.dat"));) {
            int numA, numB;
            for (int cont = 1; cont <= 100000; cont++) {
                numA = azar.nextInt(20000);
                numB = azar.nextInt(20000);
                ObjDato.writeInt(numA);
                ObjDato.writeInt(numB);
            }
        } catch (IOException e) {
            System.out.println("Error Escribiendo E/S");
        }
    }

    public static void LeeArchivo() {
        System.out.println("Leyendo archivo...");
        //try (DataInputStream ObjDato = new DataInputStream(new FileInputStream("D:\\Datos.dat"));) {
        try (DataInputStream ObjDato = new DataInputStream(new FileInputStream("/Users/davidaristizabal/Universidad/Datos.dat"));) {
            while (true) {
                System.out.println("ObjDato >>>" + ObjDato.readLine());
            }
        } catch (IOException e) {
        }

    }
}
