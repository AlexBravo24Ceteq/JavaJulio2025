package com.condicionales;

import java.util.Scanner;

public class Condicionales2_FCAS {
    public static void  main(String[] args) {

        //Acá ocupamos el operador modulo -> %
        /*
        2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
         */

        System.out.println("====================================================");
        System.out.println("==PROGRAMA QUE REVISA SI UN NÚMERO ES PAR O IMPAR ==");

        Scanner entrada = new Scanner(System.in);
        int n1;
        System.out.println("Ingresa n1");
        n1 = entrada.nextInt();

        if (n1 % 2 == 0) {
            System.out.println(n1 + " es un número par.");
        } else {
            System.out.println(n1 + " es un número impar.");
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("====================================================");


    }
}
