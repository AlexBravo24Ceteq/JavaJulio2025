package com.ciclos;

import java.util.Scanner;

public class Ciclos3_GDSA {
    public static void main(String[] args) {
        /*
        3. Realiza un programa para determinar si un String es palíndromo.
         */

        System.out.println("»»»»»»»»»»»»»» Ejercicio 3 ««««««««««««««««««««");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la palabra:");
        String texto = input.nextLine();
        texto=texto.toLowerCase().replace(" ","");
        int inicio = 0;
        int fin = texto.length() - 1;
        boolean esPalindromo = true;
        while (inicio < fin) {
            if (texto.charAt(inicio) != texto.charAt(fin)) {
                esPalindromo = false;
            }
            inicio++;
            fin--;
        }

        if (esPalindromo) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
