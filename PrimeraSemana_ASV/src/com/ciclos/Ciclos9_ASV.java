package com.ciclos;

import java.util.Scanner;

public class Ciclos9_ASV {
    public static void main(String[] args) {
        /*

        9. Programa Java que lea dos números y muestre los números pares entre ellos

         */

        Scanner entrada = new Scanner(System.in);
        int valor1, valor2, contador = 0;
        System.out.println("Ingrese el valor 1: ");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el valor 2: ");
        valor2 = entrada.nextInt();
        for (int i = valor1; i <= valor2; i++) {
            if( i%2== 0){
                contador++;
            }
            
        }

        System.out.println("Numero Pares: "+ contador);

        
    }
}
