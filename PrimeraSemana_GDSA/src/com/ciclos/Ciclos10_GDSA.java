package com.ciclos;

import java.util.Scanner;

public class Ciclos10_GDSA {
    public static void main(String[] args) {
        /*
        10. Programa que lea 20 números e indique si son positivos o negativos y pares o
            impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
         */
        System.out.println("»»»»»»»»»»»»»» Ejercicio 10 ««««««««««««««««««««");
        Scanner input = new Scanner(System.in);
        int sumaPositivos = 0;
        int sumaImpares = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = input.nextInt();

            if (numero >= 0) {
                System.out.println(numero + " es positivo.");
                sumaPositivos += numero;
            } else {
                System.out.println(numero + " es negativo.");
            }

            if (numero % 2 == 0) {
                System.out.println(numero + " es par.");
            } else {
                System.out.println(numero + " es impar.");
                sumaImpares += numero;
            }

            System.out.println("");
        }

        System.out.println("Sumatoria de números positivos: " + sumaPositivos);
        System.out.println("Sumatoria de números impares: " + sumaImpares);

        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
