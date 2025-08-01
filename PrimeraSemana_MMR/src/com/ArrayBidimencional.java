package com;

public class ArrayBidimencional {
    public static void main(String[] args) {
        /* Array bidimencional - Conocido como matriz.
        una estructura que permite almacenar mas elementos de un mismo tipo de dato,
        presentandolos de forma tabular.
        Actua sobre filas y columnas, exponenciando asi sobre los elementos contenidos.
        Array de Arrays
         */
        //Ej. Array de dos dimenciones de numeros enteros
        int [][] matriz = new int[3][3]; //[filas][columnas]

        //llenar matriz bidimencional
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        //Matriz bidimencional con valores asignados
        int [][] matriz2 = {{1,2,3,10}, {4,5,6,11}, {7,8,9,12}};

        //para recorrer es con un ciclo for anidado
        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
