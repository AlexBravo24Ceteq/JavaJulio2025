package com.ciclos;

import java.util.Scanner;

public class Ciclos8_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 8. Programa Java que lea dos números y muestre los números desde el menor hasta el
            mayor
         */
        System.out.println("============================");
        System.out.println("=========SECUENCIA==========");
        System.out.println("============================");

        int numero1, numero2;
        System.out.println("Ingrese un número");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese un segundo número");
        numero2 = entrada.nextInt();

        for (int i = numero1; i <= numero2; i++){
            System.out.println(i);
        }

        System.out.println("============FIN=============");
    }
}
