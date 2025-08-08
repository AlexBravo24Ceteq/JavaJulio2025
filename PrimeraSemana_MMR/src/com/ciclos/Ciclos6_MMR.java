package com.ciclos;

import java.util.Scanner;

public class Ciclos6_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
            mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
            todo el dinero lo reinvierte?
         */
        System.out.println("============================");
        System.out.println("=========INVERSION==========");
        System.out.println("============================");

        double inversion = 1000;
        for (int i = 1; i <= 12; i++) {
            inversion =  inversion * 1.02;
        }
        System.out.println("Cantidad total a 1 año:" + (float)(inversion));
        System.out.println("============FIN=============");
    }
}
