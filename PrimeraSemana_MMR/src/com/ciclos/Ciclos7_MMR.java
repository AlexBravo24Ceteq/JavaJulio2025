package com.ciclos;

import java.util.Scanner;

public class Ciclos7_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
            mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
            dinero?
         */
        System.out.println("============================");
        System.out.println("=========INVERSION==========");
        System.out.println("============================");

        double inversion = 700;
        int mes = 1;
        do {
            inversion =  inversion * 1.02;
            mes++;
        } while (inversion <= 1500);

        System.out.println( mes-1 + " meses para obtener la cantidad deseada");
        System.out.println("============FIN=============");
    }
}
