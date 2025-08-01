package com.condicionales;

import java.util.Scanner;

public class Condicionales3_ASV {
    public static void main(String[] args) {
        /*
        3.Crea un programa que pida al usuario dos números y
        muestre el resultado de su división. Si el
        segundo número es 0, debe mostrar un mensaje de error.

         */
        Scanner entrada = new Scanner(System.in);

        int valor1, valor2;


        System.out.println("Ingrese el Primer Valor");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el Segundo Valor");
        valor2 = entrada.nextInt();


        if(valor2 == 0){
            System.out.println("Error");

        }
        else{
            int resultado = valor1/valor2;
            System.out.println("El resultado de la division es: " + resultado);
        }


    }
}
