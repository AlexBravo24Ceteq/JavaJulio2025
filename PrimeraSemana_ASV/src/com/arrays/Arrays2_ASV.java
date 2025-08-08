package com.arrays;

import java.util.Scanner;

public class Arrays2_ASV {
    public static void main(String[] args) {
        /*
        2. Crea un array de números de 100 posiciones, que contendrá
        los números del 1 al 100. Obtén la suma de todos ellos y la media.


         */

        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        double media;
        int [] arreglo = new int[100];

        for (int i = 0; i < arreglo.length; i++) {

            arreglo[i] = i + 1;
            System.out.println("Valor: "+ arreglo[i]);

            suma = suma + arreglo[i];


        }

        media = (double) suma / arreglo.length;

        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);


    }
}
