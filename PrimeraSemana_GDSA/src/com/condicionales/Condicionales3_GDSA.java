package com.condicionales;

import java.util.Scanner;

public class Condicionales3_GDSA {
    public static void main(String[] args) {
        /*
         3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
            segundo número es 0, debe mostrar un mensaje de error.
         */
        System.out.println("//////////////////////////////////////////////");
        System.out.println("////////PROGRAMA PARA DIVIDIR NUMEROS/////////");
        System.out.println("/////////NO SE PUEDE DIVIDIR ENTRE 0//////////");
        System.out.println("//////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        double valor1,valor2;
        System.out.print("Introduce el primer número: ");
        valor1 = input.nextDouble();
        System.out.print("Introduce el segundo número: ");
        valor2 = input.nextDouble();
        if (valor2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else {
            double resultado = valor1 / valor2;
            System.out.println("Resultado de la división: " + resultado);
        }
        System.out.println("///////////////FIN DEL PROGRAMA///////////////");


    }
}
