package com.arrays;

import java.util.Scanner;

public class Arrays2_FCAS {
    public static void  main(String[] args) {

        //2. Crea un array de números de 100 posiciones, que contendrá los números del
        //1 al 100. Obtén la suma de todos ellos y la media.

        System.out.println("\uD835\uDCEC=================================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC===SUMA Y MEDIA DE 100 NÚMEROS===\uD835\uDCEC");

        int[] N1 = new int[100];
        int sum = 0;
        double media = 0;
        int N2=1;

        for (int i = 0; i < N1.length; i++) {
            N1[i] = N2;
            sum += N1[i];
            N2++;
        }
        media= (double) sum /N1.length;

        System.out.println("En una numeración del 1-100");
        System.out.println("La sumatoria es: " + sum);
        System.out.println("La media es: " + media);

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC=================================\uD835\uDCEC");
    }
}
