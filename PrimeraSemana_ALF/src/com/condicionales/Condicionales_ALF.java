package com.condicionales;

import java.util.Scanner;

public class Condicionales_ALF {
    public static void main(String[] args) {
        /*
        1.Realiza un programa que reciba dos números por teclado e indique
            cuál es mayor o si son iguales.
        * */
        Scanner entrada = new Scanner(System.in);
        System.out.println("PROGRAMA QUE EVALUA DOS NUMEROS SI SON IGUALES O DIFERENTES");
        int num1, num2;
        System.out.println("Ingresa el primer valor");
        num1 = entrada.nextInt();
        System.out.println("Ingresa el segundo valor");
        num2 = entrada.nextInt();
        if(num1 < num2){
            System.out.println("El valor "+num1+ " es menor que "+ num2);
        } else if (num1>num2) {
            System.out.println("El valor "+ num1+ " es mayor que "+ num2);
        } else {
            System.out.println("El valor "+ num1+ " es igual que "+ num2);

        }
        System.out.println("***************************************************************");
        System.out.println("FIN DEL PROGRAMA..........");
    }
}
