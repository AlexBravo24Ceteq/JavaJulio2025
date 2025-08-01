package com.arrays;

import java.util.Scanner;

public class Arrays4_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 4. Dado un array de números de 5 posiciones con los siguientes valores:
            {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
            los valores invertidos, es decir, que el segundo array deberá tener los valores
            {5,4,3,2,1}.
         */
        System.out.println("=============================");
        System.out.println("=========ARRAY FRASE=========");
        System.out.println("=============================");

        int [] numeros = {1, 2, 3, 4, 5}; //Array del tamaño de caracteres de frase
        int [] numerosInv = new int[5];
        int indiceTemp = 0;
        for (int i = numeros.length-1; i >= 0; i--){
            numerosInv[indiceTemp] = numeros[i];
            indiceTemp++;
        }

        for (int i = 0; i < numerosInv.length; i++){
            System.out.println("indice "+i+": "+ numerosInv[i]);
        }

        System.out.println("============FIN=============");
    }
}
