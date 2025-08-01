package com.ciclos;

import java.util.Scanner;

public class Ciclos2_ASV {
    public static void main(String[] args) {
        /*
        2.- Programa un algoritmo que realice la tabla de
        multiplicar de un numero introducido desde teclado,
        hasta la iteración deseada por el usuario. Ejemplo,
        tabla de 23 hasta el 95. 23 x 95 = ???

         */

        Scanner entrada = new Scanner(System.in);
        int operando1, operando2;

        System.out.println("Ingrese el Operando 1: ");
        operando1 = entrada.nextInt();
        System.out.println("Ingrese el Operando 2: ");
        operando2 = entrada.nextInt();

        for (operando1 = operando1; operando1 < operando2 ; operando1++) {
            System.out.println(operando2 + " x "+ operando1+ " = " + (operando1*operando2));

        }




    }
}
