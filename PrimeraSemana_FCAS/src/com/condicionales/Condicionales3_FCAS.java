package com.condicionales;

import java.util.Scanner;

public class Condicionales3_FCAS {
    public static void  main(String[] args) {
         /*
        3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
        segundo número es 0, debe mostrar un mensaje de error.
         */

        System.out.println("=========================");
        System.out.println("==PROGRAMA DE DIVISIÓN ==");

        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.println("Ingresa el dividendo");
        n1 = entrada.nextInt();
        System.out.println("Ingresa el divisor");
        n2 = entrada.nextInt();

        int resultado = n1/n2;
        if (resultado == 0) {
            System.out.println("ERROR");
        } else if (resultado > 0){
            System.out.println ("El resultado es: " + resultado);
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("=========================");

    }
}
