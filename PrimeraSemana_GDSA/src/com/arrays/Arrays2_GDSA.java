package com.arrays;

import java.util.Scanner;

public class Arrays2_GDSA {
    public static void main(String[] args) {
        /*
        2. Crea un array de números de 100 posiciones, que contendrá los números del
        1 al 100. Obtén la suma de todos ellos y la media.
         */
        System.out.println("»»»»»»»»»»»»»» Ejercicio 2 ««««««««««««««««««««");

        int [] arrayDeNumeros=new int[100];
        double suma=0;
        for (int i = 0; i < arrayDeNumeros.length; i++) {
            arrayDeNumeros[i] = i + 1;
            suma = suma+ arrayDeNumeros[i];
        }
        double media=suma/ arrayDeNumeros.length;
        System.out.println("La suma total es: "+suma);
        System.out.println("La media es: "+media);
        //System.out.println(arrayDeNumeros[99]);

        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
