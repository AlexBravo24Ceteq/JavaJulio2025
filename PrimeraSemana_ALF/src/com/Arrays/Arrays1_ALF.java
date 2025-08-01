package com.Arrays;

import java.util.Scanner;

public class Arrays1_ALF {
    public static void main(String[] args) {
        /*1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
        Muestra por consola el índice y el valor al que corresponde.*/
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        // Pedir los valores y guardarlos en el array
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar el índice y el valor
        System.out.println("\nValores del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }
}
