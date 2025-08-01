package com.condicionales;

import java.util.Scanner;

public class Condicionales3_AADLCV {

    public static void main(String[] args) {

        // 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división.
        // Si el segundo número es 0, debe mostrar un mensaje de error.

        System.out.println("=============================================================");
        System.out.println("===== PROGRAMA PARA SOLICITAR DOS NÚMEROS Y LOS DIVIDA ======");
        System.out.println("=============================================================");

        // Para ingresar dos números por teclado necesitamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Necesitamos dos variables donde guardar los números a dividir
        double numero1, numero2;

        // Mandamos un mensaje en consola para poder solicitar los números
        System.out.println("Introduce un primer número");
        numero1 = entrada.nextInt();
        System.out.println("Introduce un segundo numero");
        numero2 = entrada.nextInt();

        // Validamos
        if (numero2 == 0){
            System.out.println("ERROR: No se puede dividir entre 0");
        }else {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        }

    }

}
