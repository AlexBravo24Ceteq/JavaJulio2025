package com.arrays;

import java.util.Scanner;

public class Arrays1_ASV {
    public static void main(String[] args) {
        /*
        1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
        Muestra por consola el índice y el valor al que corresponde.


         */

        Scanner entrada = new Scanner(System.in);
        int [] arreglo = new int[10];

        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("Ingrese el valor del Arreglo, " + "Indice"  +": "+ i);
            arreglo[i] = entrada.nextInt();


        }


    }
}
