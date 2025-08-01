package com.ciclos;

import java.util.Scanner;

public class Ciclos9_GDSA {
    public static void main(String[] args) {
        /*
        9. Programa Java que lea dos números y muestre los números pares entre ellos
         */

        System.out.println("»»»»»»»»»»»»»» Ejercicio 9 ««««««««««««««««««««");
        Scanner input=new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        int menor, mayor;

        if (num1 < num2) {
            menor = num1;
            mayor = num2;
        } else {
            menor = num2;
            mayor = num1;
        }

        System.out.println("Números pares entre " + menor + " hasta " + mayor + ":");
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.print("-"+i + "-");
            }

        }
        System.out.print("\n");
        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");


    }
}
