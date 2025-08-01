package com.condicionales;

import java.util.Scanner;

public class Condicionales4_ALF {
    public static void main(String[] args) {

       /*
        4. Realiza un programa que lea una
        cadena por teclado y compruebe si
        contiene letras mayúsculas.

         */
        Scanner entrada = new Scanner(System.in);

        String cadena1,cadena2;
        System.out.println("Ingrese un texto: ");
        cadena1 = entrada.nextLine();

        System.out.println(cadena1);
        cadena2 = cadena1.toLowerCase();

        if(cadena1.equals(cadena2)){
            System.out.println("No Contiene Letras Mayusculas ):");
        }
        else{
            System.out.println("Contiene Letras Mayusculas (:");
        }
        System.out.println("FIN DEL PROGRAMA....");
    }
}
