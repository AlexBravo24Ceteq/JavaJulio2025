package com.condicionales;

import java.util.Scanner;

public class Condicionales2_GDSA {
    public static void main(String[] args) {
        /*
         2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
         */
        System.out.println("//////////////////////////////////////////////");
        System.out.println("//PROGRAMA PARA EVALUAR UN NUMERO SI /////////");
        System.out.println("///////////////ES PAR O IMPAR/////////////////");
        System.out.println("//////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = input.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            System.out.println("El número " + numero + " es IMPAR.");
        }
        System.out.println("///////////////FIN DEL PROGRAMA///////////////");


    }
}
