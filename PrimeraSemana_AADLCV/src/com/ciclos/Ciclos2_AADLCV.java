package com.ciclos;

import java.util.Scanner;

public class Ciclos2_AADLCV {

    public static void main(String[] args) {

        /* 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
        desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
        23 x 95 = ???
         */

        System.out.println("===== EJERCICIO 2 =====");

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Introduce el primer número: ");
        numero1 = entrada.nextInt();

        System.out.println("Introduce el segundo número: ");
        numero2 = entrada.nextInt();

        System.out.println("\nTabla del " + numero1 + " desde 0 hasta " + numero2 + ":\n");

        for (int i = 0; i <= numero2; i++){
            System.out.println(numero1 + " x " + i + " = " + (numero1 * i));
        }
    }
}
