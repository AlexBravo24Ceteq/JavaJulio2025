package com.condicionales;

import java.util.Scanner;

public class Condicionales1_FCAS {
    public static void  main(String[] args) {

        /*
        1. Realiza un programa que reciba dos números por teclado e
        indique cual es mayor o si son iguales
         */

        System.out.println("==============================================================");
        System.out.println("==PROGRAMA QUE EVALUA CUAL NÚMERO ES MAYOR O MENOR O IGUAL ==");


        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.println("Ingresa n1");
        n1 = entrada.nextInt();
        System.out.println("Ingresa n2");
        n2 = entrada.nextInt();

        if (n1 < n2){
            System.out.println("El número 2 es mayor");
        }else if (n1 > n2){
            System.out.println("El número 1 es mayor");
        }else if (n1 == n2){
            System.out.println("Los dos son iguales");
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("==============================================================");



    }
}
