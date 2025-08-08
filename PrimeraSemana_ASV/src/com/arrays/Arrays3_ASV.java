package com.arrays;

import java.util.Scanner;
import java.util.Stack;

public class Arrays3_ASV {
    public static void main(String[] args) {
        /*
        3. Pide al usuario por teclado una frase y pasa sus
        caracteres a un array de caracteres.
         */

        Scanner entrada = new Scanner(System.in);

        String frase;


        System.out.println("Ingrese una Palabra o frase: ");
        frase = entrada.nextLine();

        char[] arreglo = frase.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Indice: "+ i + ": "+ arreglo[i]);

        }

    }
}
