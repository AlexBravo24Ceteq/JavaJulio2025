package com.condicionales;

import java.util.Scanner;

public class Condicionales1_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 1.Realiza un programa que reciba dos números por teclado
            e indique cuál es mayor o si son iguales.
        */
        System.out.println("============================");
        System.out.println("=====EVALUA DOS NÚMEROS=====");
        System.out.println("======(#MAYOR/IGUALES)======");

        int numero1, numero2;
        System.out.println("Ingresa primer número");
        numero1 = entrada.nextInt();
        System.out.println("Ingresa segundo número");
        numero2 = entrada.nextInt();

        if (numero1 > numero2){
            System.out.println("El primer número ingresado es mayor");
        } else if (numero2 > numero1){
            System.out.println("El segundo número ingresado es mayor");
        } else {
            System.out.println("Los números ingresados son iguales");
        }

        System.out.println("============FIN=============");
    }
}
