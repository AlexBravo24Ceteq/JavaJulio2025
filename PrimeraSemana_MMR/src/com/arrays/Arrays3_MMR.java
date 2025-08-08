package com.arrays;

import java.util.Scanner;

public class Arrays3_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
            caracteres.
         */
        System.out.println("=============================");
        System.out.println("=========ARRAY FRASE=========");
        System.out.println("=============================");

        String frase = "";
        System.out.println("Ingresa una frase");
        frase = entrada.nextLine();

        char [] caracteres = new char[frase.length()]; //Array del tamaño de caracteres de frase

        for (int i = 0; i < caracteres.length; i++){
            caracteres[i] = frase.charAt(i);
        }

        for (int i = 0; i < caracteres.length; i++){
            System.out.println("indice "+i+": "+ caracteres[i]);
        }

        System.out.println("============FIN=============");
    }
}
