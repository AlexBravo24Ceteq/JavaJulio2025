package com.condicionales;

import java.util.Scanner;

public class Condicionales4_GDSA {
    public static void main(String[] args) {
        /*
        4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
         */
        System.out.println("//////////////////////////////////////////////");
        System.out.println("////PROGRAMA PARA DETECTAR SI UNA CADENA /////");
        System.out.println("/////////TIENE LETRAS MAYUSCULAS//////////////");
        System.out.println("//////////////////////////////////////////////");

        Scanner input = new Scanner(System.in);
        String txt;
        System.out.print("Introduce El Texto");
        txt= input.nextLine();
       /* if (txt.matches(".*[A-Z].*")) {
            System.out.println("El texto contiene al menos una letra mayúscula.");
        } else {
            System.out.println("El texto NO contiene letras mayúsculas.");
        }*/
        String conversion=txt.toLowerCase();
        if (!txt.equals(conversion)){
            System.out.println("El texto SI contiene al menos una letra mayúscula.");
        }else {
            System.out.println("El texto NO contiene letras mayúsculas.");
        }

        System.out.println("///////////////FIN DEL PROGRAMA///////////////");


    }
}
