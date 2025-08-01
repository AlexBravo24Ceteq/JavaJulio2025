package com.Arrays;

public class Arrays {
    public static void main(String[] args) {

        //Arrays- permiten almacenar varios elementos del mismo tipo de datos
        //tambien se conocen como vectore
        //se pueden almacenar varios datos y acceder a ellos mediante a su indice
        //siempre su indice inicia en cero 0
        //desventajas: no son dinamicos asi que su tamañano se declara desde un inicio

        //declaracion de un array tipo numerico
        int[] numeros = new int[6]; // declaracion de array con 6 elemento
        //Asignar valores a un array
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 300;
        numeros[3] = 400;
        numeros[4] = 500;
        numeros[5] = 600;
        //utilizar una posicion del arrray
        System.out.println(numeros[5]);

        //Declaracion de un array con elementos asignados
        int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] + " ");
        }
        //array char, array double, array String
        //Se puede tener mas de un tipo de dato un array

        Object [] varios = {101,"Nombre",2.50,false,'$'};
        int numero101 = (Integer) varios[0];
        double numero2250 = (Double) varios[2];
        System.out.println();
        System.out.println(numero101+numero2250);
    }
}
