package com.condicionales;

import java.util.Scanner;

public class Condicionales4_FCAS {
    public static void  main(String[] args) {
        /*
        4.Realiza un programa que lea una cadena por teclado y compruebe si contiene alguna mayúscula.
         */
        System.out.println("=======================================");
        System.out.println("==PROGRAMA DE REVISION DE MAYUSCULAS ==");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = entrada.nextLine();

        //Aquí revisaremos cada caracter para verificar

        for (int x = 0; x < frase.length(); x++) {
            if (Character.isUpperCase(frase.charAt(x))) {
                System.out.println("La frase contiene alguna mayúscula");
                System.out.println("====FIN DEL PROGRAMA====");
                System.out.println("=======================================");
                return;
            }
        }

        // Si llegamos aquí, no encontró ninguna mayúscula
        System.out.println("La frase no contiene ninguna mayúscula");
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("=======================================");
    }
}
