package com.ciclos;

import java.util.Scanner;

public class Ciclos8_GDSA {
    public static void main(String[] args) {
        /*
        8. Programa Java que lea dos números y muestre los números desde el menor hasta el
            mayor
         */
        System.out.println("»»»»»»»»»»»»»» Ejercicio 8 ««««««««««««««««««««");
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

        System.out.println("Números desde " + menor + " hasta " + mayor + ":");
        for (int i = menor; i <= mayor; i++) {
            System.out.print("-"+i + "-");
        }
        System.out.print("\n");
        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
