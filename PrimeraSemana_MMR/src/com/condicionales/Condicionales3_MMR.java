package com.condicionales;

import java.util.Scanner;

public class Condicionales3_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
            segundo número es 0, debe mostrar un mensaje de error.
        */
        System.out.println("============================");
        System.out.println("=====DIVIDE DOS NÚMEROS=====");
        System.out.println("========(RESULTADO)=========");

        int numero1, numero2;
        System.out.println("Ingresa el primer número");
        numero1 = entrada.nextInt();
        System.out.println("Ingresa el segundo número");
        numero2 = entrada.nextInt();

        if (numero2 == 0){
            System.out.println("************** ERROR **************");
            System.out.println("*Imposible dividir por un valor 0 *");
            System.out.println("************** ***** **************");
        } else {
            System.out.println("Su resultante es:" + numero1/numero2);
        }
        System.out.println("============FIN============");
    }
}
