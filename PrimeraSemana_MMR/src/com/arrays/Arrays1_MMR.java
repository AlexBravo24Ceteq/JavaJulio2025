package com.arrays;

import java.util.Scanner;

public class Arrays1_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
            Muestra por consola el índice y el valor al que corresponde.
         */
        System.out.println("=============================");
        System.out.println("===========ARRAY 10==========");
        System.out.println("=============================");

        int [] numeros = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Dame un número: ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Valores ingresados:");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("indice "+i+": "+numeros[i]);
        }
        System.out.println("============FIN=============");
    }
}
