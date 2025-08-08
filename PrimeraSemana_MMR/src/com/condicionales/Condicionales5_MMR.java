package com.condicionales;

import java.util.Scanner;

public class Condicionales5_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
            parámetros: edad, nota y sexo.
            * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
            * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
            * Otros casos -> NO ACEPTADA
         */
        System.out.println("================================");
        System.out.println("=====ACEPTACIÓN DE SOLICITUD====");
        System.out.println("=(ACEPTADA/POSIBLE/NO ACEPTADA)=");

        int nota, edad;
        String sexo;
        System.out.println("Ingrese nota");
        nota = entrada.nextInt();
        System.out.println("Ingrese edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese sexo (M - F)");
        sexo = entrada.next();

        if ((nota >= 5) && (edad >= 18) && (sexo.equals("M")))
            System.out.println("POSIBLE");
        else if ((nota >= 5) && (edad >= 18) && (sexo.equals("F")))
            System.out.println("ACEPTADA");
        else System.out.println("NO ACEPTADA");

        System.out.println("============FIN============");
    }
}
