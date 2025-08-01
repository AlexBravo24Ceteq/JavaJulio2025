package com.ciclos;

import java.util.Scanner;

public class Ciclos2_ALF {
    public static void main(String[] args) {

        /*2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
        desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
        23 x 95 = ???*/
        Scanner entrada = new Scanner(System.in);
        int num1, num2 ;
        System.out.println("Introduce el primer valor");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo valor hasta donde queires que itere");
        num2= entrada.nextInt();

        for (num1 = num1; num1 <=num2 ; num1++) {
            System.out.println(num1+ " x " +num2+ " = "+ (num1*num2));
        }
        /*for (int i = num1; i ==num2 ; num1++) {
            System.out.println(num1+ " x " +num2+ " = "+ (num1*num2));

        }*/
    }
}
