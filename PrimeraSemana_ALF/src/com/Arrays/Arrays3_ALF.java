package com.Arrays;

import java.util.Scanner;

public class Arrays3_ALF {
    public static void main(String[] args) {
        /*3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
        caracteres.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        char[] arrayCaracteres = frase.toCharArray();

        System.out.println("Array de caracteres:");
        for (char caracter : arrayCaracteres) {
            System.out.println(caracter);
        }
    }
}
