package com.condicionales;

import java.util.Scanner;

public class Condicionales5_FCAS {
    public static void  main(String[] args) {
        /*
        5.Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
        parámetros: edad, nota y sexo.
        * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
        * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
        * Otros casos -> NO ACEPTADA
         */
        System.out.println("=================================================");
        System.out.println("==PROGRAMA DE APROBACIÓN POR NOTA, EDAD Y SEXO ==");

        Scanner entrada = new Scanner(System.in);
        int nota, edad;
        char sexo;

        System.out.println("¿Cuál fue la nota de tu evaluación?");
        nota = entrada.nextInt();
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();
        System.out.println("Ingresa tu sexo (M/F)");
        sexo = entrada.next().toUpperCase().charAt(0);


        if (nota >= 5 && edad >= 18 && sexo == 'M'){
            System.out.println("Posible candidato");
        }else if (nota >= 5 && edad >= 18 && sexo == 'F'){
            System.out.println("Quedaste aceptada, felicidades");
        }else if (nota < 5 || edad < 18 || sexo == 'M'){
            System.out.println("Lo lamento, estas rechazad@");
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("=================================================");
    }
}
