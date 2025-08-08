package com.arrays;

import java.util.Scanner;

public class Arrays4_GDSA {
    public static void main(String[] args) {
       /* 4. Dado un array de números de 5 posiciones con los siguientes valores:
        {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
        los valores invertidos, es decir, que el segundo array deberá tener los valores
        {5,4,3,2,1}.*/
        System.out.println("»»»»»»»»»»»»»» Ejercicio 4 ««««««««««««««««««««");

        int[] original = {1, 2, 3, 4, 5};

        int[] invertido = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }
        System.out.println("El Array Original es : ");
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        System.out.println("El Array invertido es : ");
        for (int num : invertido) {
            System.out.print(num + " ");
        }
        System.out.println("");

        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");

    }
}
