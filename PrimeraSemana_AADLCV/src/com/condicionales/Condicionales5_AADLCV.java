package com.condicionales;

import java.util.Scanner;

public class Condicionales5_AADLCV {

    public static void main(String[] args) {

        /* 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
        parámetros: edad, nota y sexo.
        Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
        Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
         Otros casos -> NO ACEPTADA
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        System.out.println("Ingresa tu nota: ");
        double nota = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Ingresa tu sexo (M/F): ");
        String sexo = entrada.nextLine().toUpperCase();

        if (nota >= 5 && edad >= 18) {
            if (sexo.equals("F")) {
                System.out.println("SOLICITUD ACEPTADA");
            } else if (sexo.equals("M")) {
                System.out.println("SOLICITUD POSIBLE");
            } else {
                System.out.println("SEXO NO VÁLIDO");
            }
        } else {
            System.out.println("SOLICITUD NO ACEPTADA");
        }

    }
}
