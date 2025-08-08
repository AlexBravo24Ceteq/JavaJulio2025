package com.ciclos;

import java.util.Scanner;

public class Ciclos8_FCAS {
    public static void  main(String[] args) {

        /*
        8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
         */
        System.out.println("\uD835\uDCEC=================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==MAYOR A MENOR==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        int num1, num2 ;
        System.out.println("Introduce el primer número");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número");
        num2= entrada.nextInt();

        if(num1>num2){
            for (num2 = num2; num2 <= num1 ; num2++) {
                System.out.println("# "+ num2 + "->" + num1);
            }
        }else{
            for (num1 = num1; num1 <=num2 ; num1++) {
                    System.out.println("# "+ num1 + "->" + num2);
            }
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC=================\uD835\uDCEC");

    }
}
