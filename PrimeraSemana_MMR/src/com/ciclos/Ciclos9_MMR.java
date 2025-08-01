package com.ciclos;

import java.util.Scanner;

public class Ciclos9_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 9. Programa Java que lea dos números y muestre los números pares entre ellos
         */
        System.out.println("============================");
        System.out.println("=======SECUENCIA PARES======");
        System.out.println("============================");

        int numero1, numero2;
        System.out.println("Ingrese un número");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese un segundo número");
        numero2 = entrada.nextInt();

        for (int i = numero1; i <= numero2; i++){
            if ((i%2) == 0) //Si el reciduo de dividir a 2 es 0
                System.out.println(i); //es par
        }

        System.out.println("============FIN=============");
    }
}
