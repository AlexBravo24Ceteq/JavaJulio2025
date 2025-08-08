package com.arrays;

import java.util.Scanner;

public class Arrays4_ASV {

    public static void main(String[] args) {
        /*

        4. Dado un array de números de 5 posiciones con los
        siguientes valores:
        {1,2,3,4,5}.
        Guardar los valores de este array en otro array
        distinto pero con los valores invertidos, es decir,
        que el segundo array deberá tener los valores {5,4,3,2,1}.

         */

        Scanner entrada = new Scanner(System.in);
        int [] arreglo = {1, 2, 3, 4 ,5};
        int [] arreglo2 = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo2[i] = arreglo[arreglo.length-1-i];
            
        }

        System.out.println("Arreglo Original");
        for (int valor: arreglo) {
            System.out.print(valor + " ");
            
        }
        System.out.println();

        System.out.println("Arreglo Invertido");
        for (int valor: arreglo2) {
            System.out.print(valor + " ");

        }




    }
}
