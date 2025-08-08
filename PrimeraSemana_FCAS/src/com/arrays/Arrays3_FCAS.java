package com.arrays;

import java.util.Scanner;

public class Arrays3_FCAS {
    public static void  main(String[] args) {

        //3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
        //caracteres.

        System.out.println("\uD835\uDCEC============================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC===CARACTERES EN UN ARRAY===\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();
        char[]FRA;
        FRA = frase.toCharArray();

        for (int i = 0; i < FRA.length; i++) {
            System.out.println("Los caracteres separados son: " + FRA[i] + " ");

        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC============================\uD835\uDCEC");
    }
}
