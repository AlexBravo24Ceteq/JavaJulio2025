package com.ciclos;

public class Ciclos1_AADLCV {

    public static void main(String[] args) {

        // 1.- Programa un algoritmo que realice la tabla de multiplicar del 12

        System.out.println("===== EJERCICIO 1 ======");

        // Ejemplo. Solucionar con ciclo while
        /*
        int x = 1;

        while (x<=10){
            System.out.println("12 x " + " = " + (12*x));
            x++;
        }
         */

        // Ejemplo 2. Solucionandolo con un cicjlo for
        for (int i = 1; i <=100 ; i++) {
            System.out.println("12 x " + i + " = " + (12*i));
        }

    }
}
