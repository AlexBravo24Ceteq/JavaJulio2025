package com.condicionales;

import java.util.Scanner;

public class Condicionales5_GDSA {
    public static void main(String[] args) {
         /*
       5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
            parámetros: edad, nota y sexo.
            * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
            * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
            * Otros casos -> NO ACEPTADA
         */
        System.out.println("//////////////////////////////////////////////");
        System.out.println("////PROGRAMA PARA CALCULAR ACEPTACION EN /////");
        System.out.println("///BASE A PARAMETROS DE EDAD NOTA Y SEXO//////");
        System.out.println("//////////////////////////////////////////////");

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        int nota = input.nextInt();
        System.out.print("Ingrese la edad: ");
        int edad = input.nextInt();
        System.out.print("Ingrese el sexo (M/F): ");
        String sexo = input.next();
        sexo = sexo.toUpperCase();
        if (nota >= 5 && edad >= 18) {
            if (sexo.equals("M")) {
                System.out.println("Resultado: POSIBLE");
            } else if (sexo.equals("F")) {
                System.out.println("Resultado: ACEPTADA");
            } else {
                System.out.println("Resultado: NO ACEPTADA");
            }
        } else {
            System.out.println("Resultado: NO ACEPTADA");
        }
        System.out.println("///////////////FIN DEL PROGRAMA///////////////");


    }
}


