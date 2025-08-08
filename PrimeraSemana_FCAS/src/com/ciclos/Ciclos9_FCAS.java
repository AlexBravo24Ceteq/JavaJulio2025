package com.ciclos;

import java.util.Scanner;

public class Ciclos9_FCAS {
    public static void  main(String[] args) {

         /*
         9. Programa Java que lea dos números y muestre los números pares entre ellos
         */
        System.out.println("\uD835\uDCEC===========================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==PARES ENTRE DOS NÚMEROS==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        int num1, num2 ;
        System.out.println("Introduce el primer número");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número");
        num2= entrada.nextInt();

        if(num1>num2){
            for (int i = num2; i <= num1 ; i++) {
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        }else{
            for (int i = num1; i <= num2 ; i++) {
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC===========================\uD835\uDCEC");

    }
}
