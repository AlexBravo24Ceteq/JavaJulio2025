package com.ciclos;

import java.util.Scanner;

public class Ciclos8_ASV {
    public static void main(String[] args) {
        /*
        8. Programa Java que lea dos números y
        muestre los números desde el menor hasta el mayor

         */

        Scanner entrada = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Ingrese el valor 1: ");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el valor 2: ");
        valor2 = entrada.nextInt();

        if(valor1 > valor2){
            for(valor2 = valor2; valor2 <= valor1; valor2++){
                System.out.println("Valor "+ valor2);
            }
        }
        else{
            for(valor1 = valor1; valor1 <= valor2; valor1++){
                System.out.println("Valor "+ valor1);
            }

        }
    }
}
