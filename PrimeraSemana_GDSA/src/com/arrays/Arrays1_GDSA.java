package com.arrays;

import java.util.Scanner;

public class Arrays1_GDSA {
    public static void main(String[] args) {
        /*
        1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
            Muestra por consola el índice y el valor al que corresponde.
         */
        System.out.println("»»»»»»»»»»»»»» Ejercicio 1 ««««««««««««««««««««");
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el valor de la posicion " + i + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("Indice y valores del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice " + i + "= [" + numeros[i]+"]");
        }

        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");

    }
}
