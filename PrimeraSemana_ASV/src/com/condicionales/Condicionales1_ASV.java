package com.condicionales;

import java.util.Scanner;

public class Condicionales1_ASV {
    public static void main(String[] args) {
        /*
        1.Realiza un programa que
        reciba dos números por teclado e
        indique cuál es mayor o si son iguales.
         */

        System.out.println("============================");
        System.out.println("========Evaluar cual Numero es Mayor");
        System.out.println("o si son iguales==========");
        System.out.println("==============================");

        //Ingresar dos numero por teclado a la clase Scanner

        Scanner entrada = new Scanner(System.in);

        //Se crean dos variables donde guardar los numeros
        int numero1, numero2;

        //Mandar un mensaje para solicitar los numero
        System.out.println("Introduce el valor 1: ");
        numero1 = entrada.nextInt();
        System.out.println("Introduce el valor 2: ");
        numero2 = entrada.nextInt();

        if (numero1 > numero2){
            System.out.println("Numero1 es mayor que Numero2");

        }
        else if (numero2 > numero1) {
            System.out.println("Numero2 es mayor que Numero1");

        }
        else{
            System.out.println("Ambos numeros son iguales");
        }


    }
}
