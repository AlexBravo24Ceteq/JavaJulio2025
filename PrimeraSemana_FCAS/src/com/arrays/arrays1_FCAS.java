package com.arrays;

import java.util.Scanner;

public class arrays1_FCAS {
    public static void  main(String[] args) {

        //1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
        //Muestra por consola el índice y el valor al que corresponde.

        System.out.println("\uD835\uDCEC=========================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC===ARRAY DE 10 NÚMEROS===\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        int[] N1 = new int[10];
        int N2;

        int i = 0;
        while (i < N1.length) {
            System.out.println("Introduce un número: ");
            N2 = entrada.nextInt();
            N1[i] = N2;
            System.out.print("indice: " + i + "   Valor: " + N1[i] + "\n");
            i++;
        }

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC=========================\uD835\uDCEC");
    }
}
