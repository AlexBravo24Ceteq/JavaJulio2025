package com;

public class ArrayBidimensional {
    public static void main(String[] args) {

        /*
        Array bidmiensional, Tambien conocido como matriz
        Y pasa a ser una estructura que nos permite almacenar mas elementos de un
        mismo tipo de dato pero ahora presentadolos de forma
        tabular. Es decir, una dimension va a actuar sobre las
        filas y otra sobres las columnas, exponenciando asi los
        elementos contenidos.
        Igual podria decirse que un array de dos dimensiones es
        un array de arrays.

         */

        //Ej. Crear un array de dos dimensiones de numeros Enteros

        int [][] matriz = new int[3][3]; //[filas] [columnas] 9 elementos

        //Ej. LLenado de un array de dos dimensiones
        matriz [0] [0]= 1;
        matriz [0] [1]= 2;
        matriz [0] [2]= 3;

        matriz [1] [0]= 4;
        matriz [1] [1]= 5;
        matriz [1] [2]= 6;

        matriz [2] [0]= 7;
        matriz [2] [1]= 8;
        matriz [2] [2]= 9;

        //eJ 2. Crear una matriz con los valores asignados desde un principio

        int [] [] matriz2 = {{1, 2, 3, 10},
                             {4, 5, 6, 11},
                             {7, 8, 9, 12}};

        //Podemos recorrer cada valor utilizando un ciclo for anidado
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]);

            }
            System.out.println();

        }


    }
}
