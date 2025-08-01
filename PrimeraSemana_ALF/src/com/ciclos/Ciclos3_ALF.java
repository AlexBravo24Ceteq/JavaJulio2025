package com.ciclos;

import java.util.Scanner;

public class Ciclos3_ALF {
    public static void main(String[] args) {

        /*3. Realiza un programa para determinar si un String es palíndromo.*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que verifica si una palabra el palindroma o no ");
        String palabra, invertida;
        System.out.println("Introduce una palabra");
        palabra = entrada.nextLine();
        char axuliar ;
        invertida = "";

        for (int i = palabra.length() -1 ; i >=0 ; i--) {
            axuliar = palabra.charAt(i);
            invertida = invertida + axuliar; // a = a+1;

        }
        System.out.println("La palabra invertida es: "+ invertida);
        if (palabra.equals(invertida)) {// equals es igual a ==
            System.out.println("La palabra ingresada "+ palabra+ " es palindroma "+invertida);

        }else {
            System.out.println("La palabra ingresada "+ palabra+ " no es palindroma "+invertida);
        }

    }
}
