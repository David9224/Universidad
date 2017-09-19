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
//        puntoUno();
//        puntoDos();
//        puntoTres();
//        puntoCuatro();
//        puntoCinco();
        puntoSiete();
    }

    public static void puntoUno() {
        int init = 320000;
        int fin = 470000;
        int c = fin - init;
        int result = 0;
        int aux = 0;
        for (int i = 1; i <= c; i++) {
            if ((init % 2) != 0) {//si el ultimo numero es impar
                aux = init / 10;
                if ((aux % 2) == 0) {//si el penultimo es impar
                    result += 1;
                }
            }
            init += 1;
        }

        System.out.println("result1 " + result);
    }

    /**
     * 11110
     */
    public static void puntoDos() {
        int init = 10000;
        int fin = 100000;
        int c = fin - init;
        int result = 0;
        int aux = 0;
        boolean impar = true;
        for (int i = 1; i <= c; i++) {
            if ((init % 2) == 0) {
                aux = init / 10;
                while (aux != 0) {
                    if (impar) {
                        if ((aux % 2) != 0) {
                            impar = true;
                        } else {
                            impar = false;
                        }
                    }
                    aux = aux / 10;
                }
                if (impar) {
                    result += 1;
                }
            }
            impar = true;
            init += 1;
        }
        System.out.println("result2 " + result);
    }

    public static void puntoTres() {
        int init = 30000;
        int fin = 150000;
        int c = fin - init;
        int result = 0;
        int aux = 0;
        boolean par = true;
        for (int i = 1; i <= c; i++) {
            if ((init % 2) != 0) {
                aux = init / 10;
                while (aux != 0) {
                    if (par) {
                        if ((aux % 2) == 0) {
                            par = true;
                        } else {
                            par = false;
                        }
                    }
                    aux = aux / 10;
                }
                if (par) {
                    result += 1;
                }
            }
            par = true;
            init += 1;
        }
        System.out.println("result3 " + result);
    }

    public static void puntoCuatro() {
        double init = 100000;
        double fin = 300000;
        double c = fin - init;
        int result = 0;
        double ultimaCifra = 0;
        double penultima = 0;
        for (int i = 1; i <= c; i++) {
            ultimaCifra = init / 10;
            penultima = init / 100;

            String strUlt = String.valueOf(ultimaCifra);
            String strPen = String.valueOf(penultima);

            int ultInt = Integer.parseInt(strUlt.substring(strUlt.indexOf('.') + 1));
            int penInt = Integer.parseInt(strPen.substring(strPen.indexOf('.') + 1));
            if (penInt >= 10) {
                penInt = penInt / 10;
            }
            if (penInt > ultInt) {
                result += 1;
            }
            init += 1;
        }
        System.out.println("result4 " + result);
    }

    public static void puntoCinco() {
        double init = 100000;
        double fin = 300000;
        double c = fin - init;
        int result = 0;
        double ultimaCifra = 0;
        double penultima = 0;
        for (int i = 0; i <= c; i++) {
            ultimaCifra = init / 10;
            penultima = init / 100;

            String strUlt = String.valueOf(ultimaCifra);
            String strPen = String.valueOf(penultima);

            int ultInt = Integer.parseInt(strUlt.substring(strUlt.indexOf('.') + 1));
            int penInt = Integer.parseInt(strPen.substring(strPen.indexOf('.') + 1));
            if (penInt >= 10) {
                penInt = penInt / 10;
            }
            if (penInt == (2 * ultInt)) {
                result += 1;
            }
            init += 1;
        }
        System.out.println("result5 " + result);
    }

    /*
    *@Numero 6 = 81902
     */
    /**
     * 16292
     */
    public static void puntoSiete() {
        Integer init = 200000;
        Integer fin = 400000;
        Integer result = 0;
        Integer numerosSiete = 0;
        Integer numeroAux = 0;
        while (init <= fin) {
            numeroAux = 0;
            numerosSiete = 0;
            for(int i = 0; i< init.toString().length(); i++){
                numeroAux = Integer.parseInt(init.toString().charAt(i)+"");
                if(numeroAux == 7){
                    numerosSiete += 1;
                }
            }
            if(numerosSiete >= 2){
                result += 1;
            }
            init += 1;
        }
        System.out.println("result7 " + result);
    }

}
