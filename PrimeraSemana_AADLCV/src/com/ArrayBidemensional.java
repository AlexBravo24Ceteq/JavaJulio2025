package com;

public class ArrayBidemensional {

    public static void main(String[] args) {
        /*
        Array Bidemensional. También es conocido como matriz.
        Y pasa a ser una estructura que nos permite almacenar más
        elememtos de un mismo tipo de dato pero ahora presentandolos
        de forma tabular. Es decir, una dimensión va a actuar
        sobre las filas y otra sobre las columnas, exponenciando así
        los elementos contenidos.
        Igual podría decirse que una array de dos dimensiones es
        un array de arrays
         */

        // Ejemplo: Crear un array de dos dimensiones de números Enteros

        int [][] matriz = new int [3][3]; // [filas] [columnas]. 9 elementos

        // Ejemplo: Llenado de un array de dos dimensiones
        matriz [0][0] = 1;
        matriz [0][1] = 2;
        matriz [0][2] = 3;

        matriz [1][0] = 4;
        matriz [1][1] = 5;
        matriz [1][2] = 6;

        matriz [2][0] = 7;
        matriz [2][1] = 8;
        matriz [2][2] = 9;

        // Ejemplo 2: Crear una matriz con los valores asiganados desde un principio

        int [] [] matriz2 = {{1,2,3,10},
                             {4,5,6,11},
                             {7,8,9,12}};

        // Podemos recorrer cada valor utilizando un ciclo for anidado
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
