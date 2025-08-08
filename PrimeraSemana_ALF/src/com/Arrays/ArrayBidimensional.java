package com.Arrays;

public class ArrayBidimensional {
    public static void main(String[] args) {

        //array bidimensional mas conocido como mtariz
        //es una estructura qu enos permite almacenar mas elementos del mismo tipo
        //pero presentandolos de una forma tabular
        //es decir ahora tiene filas y columnas
        //exponensiando asi loes lementos contenidos
        //es un arrays de array

        //Declaracion de un array bidimensional

                                //filas  y columnas que equivale a 9 elementos
        int [][] matriz = new int[3][3];//

        //llenar el array de dos dimensiones
        matriz [0][0] = 1;
        matriz [0][1] = 2;
        matriz [0][2] = 3;

        matriz [1][0] = 4;
        matriz [1][1] = 5;
        matriz [1][2] = 6;

        matriz [2][0] = 7;
        matriz [2][1] = 8;
        matriz [2][2] = 9;

        //Otra forma de llenarlos y mas facil
        int [][] matriz2 = {{1,2,3,10},{4,5,6,11},{7,8,9,11}};
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

