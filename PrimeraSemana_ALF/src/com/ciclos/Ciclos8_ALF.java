package com.ciclos;

import java.util.Scanner;

public class Ciclos8_ALF {
    public static void main(String[] args) {

        /*
        8. Programa Java que lea dos números y muestre los números desde el menor hasta el
        mayor
        * */
        Scanner entrada = new Scanner(System.in);
        int num1, num2 ;
        System.out.println("Introduce el primer valor");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo valor");
        num2= entrada.nextInt();
        if(num1>num2){ //Esta condicion nos ayudara a saber cual es el numero ingresado que es menor
            for (num2 = num2; num2 <=num1 ; num2++) {
                System.out.println("NUMERO: "+ num2);
            }

        }else {
            for (num1 = num1; num1 <=num2 ; num1++) {
                System.out.println("NUMERO: "+ num1);
            }
        }
    }
}
