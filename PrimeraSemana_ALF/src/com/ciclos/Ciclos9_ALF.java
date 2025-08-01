package com.ciclos;

import java.util.Scanner;

public class Ciclos9_ALF {
    public static void main(String[] args) {

        //9. Programa Java que lea dos números y muestre los números pares entre ellos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Números pares entre " + num1 + " y " + num2 + ":");

        // Asegurarse de que num1 sea menor o igual que num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Salto de línea al final
        scanner.close();
    }
}
