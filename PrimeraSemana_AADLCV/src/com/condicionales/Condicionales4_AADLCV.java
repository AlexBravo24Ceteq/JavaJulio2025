package com.condicionales;

import java.util.Scanner;

public class Condicionales4_AADLCV {

    public static void main(String[] args) {

        // 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

        Scanner entrada = new Scanner(System.in);
        char cadena;

        System.out.println("Ingresa una cadena de texto: ");
        cadena = entrada.next() .charAt(0);

        if (Character.isUpperCase(cadena)){
            System.out.println("la cadena de texto contiene letras en mayúscula");
        }else if(Character.isLowerCase(cadena)){
            System.out.println("El cadena de texto no contiene letras en mayúscula");
        }

    }

}
