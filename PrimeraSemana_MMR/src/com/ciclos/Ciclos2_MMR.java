package com.ciclos;

import java.util.Scanner;

public class Ciclos2_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
        desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
        23 x 95 = ???
         */
        System.out.println("============================");
        System.out.println("=======TABLA OPCIONAL=======");
        System.out.println("============================");

        int tabla, iteracion;
        System.out.println("Ingresa la tabla requerida");
        tabla = entrada.nextInt();
        System.out.println("Ingresa número de iteraciones");
        iteracion = entrada.nextInt();

        int i;
        for (i = 1; i <= iteracion; i++){
            System.out.println(tabla+" x " + i + " = " + (tabla * i));
        }

        System.out.println("============FIN=============");
    }
}
