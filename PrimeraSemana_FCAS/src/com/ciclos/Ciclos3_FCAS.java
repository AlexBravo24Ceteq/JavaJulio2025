package com.ciclos;

import java.util.Scanner;

public class Ciclos3_FCAS {
    public static void  main(String[] args) {

        /*
        3. Realiza un programa para determinar si un String es palíndromo.
         */
        System.out.println("\uD835\uDCEC===========================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==DETECTOR DE PALÍNDROMOS==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        String palabra;
        palabra = entrada.nextLine().toLowerCase().replace(" ","");

        System.out.println("Ingresa una palabra:");
        palabra = entrada.nextLine().toLowerCase();

        boolean esPalindromo = true;

        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("El string " + palabra + " es un palíndromo");
        } else {
            System.out.println("El string " + palabra + " no es un palíndromo");
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC===========================\uD835\uDCEC");
    }
}
