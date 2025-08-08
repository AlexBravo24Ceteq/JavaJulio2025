package com.condicionales;

import java.util.Scanner;

public class Condicionales4_ASV {
    public static void main(String[] args) {
        /*
        4. Realiza un programa que lea una
        cadena por teclado y compruebe si
        contiene letras mayúsculas.

         */

        Scanner entrada = new Scanner(System.in);

        String cadena1;
        System.out.println("Ingrese Texto: ");
        cadena1 = entrada.nextLine();

        System.out.println(cadena1);

        String cadenaMinuscula = cadena1.toLowerCase();



        if(cadena1.equals(cadenaMinuscula)){
            System.out.println("No contiene Letras Mayusculas");
        }
        else{
            System.out.println("Contiene Mayusculas");
        }




    }
}
