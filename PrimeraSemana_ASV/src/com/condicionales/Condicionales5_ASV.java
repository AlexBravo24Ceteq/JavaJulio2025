package com.condicionales;

import java.util.Scanner;

public class Condicionales5_ASV {
    public static void main(String[] args) {
        /*
        5. Realiza un programa que calcule la aceptación de
        una solicitud en base a los siguientes
        parámetros: edad, nota y sexo.
        * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
        * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
        * Otros casos -> NO ACEPTADA
         */

        Scanner entrada = new Scanner(System.in);

        int nota, edad;
        String sexo;

        System.out.println("Ingrese su Nota: ");
        nota = entrada.nextInt();
        System.out.println("Ingrese su Edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su Sexo: ");
        sexo = entrada.nextLine();

        if(nota >= 5 && edad >= 18 && sexo.equals("M")){
            System.out.println("Es Aceptada");

        } else if (nota >= 5 && edad >= 18 && sexo.equals("H")) {
            System.out.println("Es Posible");

        }

        else {
            System.out.println("No Aceptado");
        }


    }
}
