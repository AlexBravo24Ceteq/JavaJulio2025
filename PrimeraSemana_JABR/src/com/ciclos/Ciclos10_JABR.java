package com.ciclos;

import java.util.Scanner;

public class Ciclos10_JABR {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, totalPositivos = 0, totalImpar = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println(i+": Ingrese un número");
            numero1 = entrada.nextInt();

            if (numero1 < 0) //si menor a 0
                System.out.println("Número negativo");
            else {
                System.out.println("Número positivo");
                totalPositivos = totalPositivos + numero1;
            }
            if ((numero1%2) == 0) //Si el reciduo de dividir a 2 es 0
                System.out.println("Número par");
            else {
                System.out.println("Número impar");
                totalImpar = totalImpar + numero1;
            }
        }
        System.out.println("Sumatoria de números positivos: "+ totalPositivos);
        System.out.println("Sumatoria de números impares: "+ totalImpar);
    }

}
