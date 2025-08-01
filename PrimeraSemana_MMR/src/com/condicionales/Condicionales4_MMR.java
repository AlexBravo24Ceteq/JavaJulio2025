package com.condicionales;

import java.util.Scanner;

public class Condicionales4_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 4. Realiza un programa que lea una cadena por teclado y compruebe si contiene una letra mayúscula.
        */
        System.out.println("============================");
        System.out.println("========EVALUA CADENA=======");
        System.out.println("===(Contiene mayusculas)====");

        String cadena;
        System.out.println("Ingresa una cadena");
        cadena = entrada.nextLine();

        //si la cadena original es igual a la cadena convertida a minusculas
        if (cadena.equals(cadena.toLowerCase())){
            System.out.println("el texto ingresado no contiene mayusculas");
        } else {
            System.out.println("el texto ingresado contiene mayusculas");
        }

        System.out.println("============FIN============");
    }
}
