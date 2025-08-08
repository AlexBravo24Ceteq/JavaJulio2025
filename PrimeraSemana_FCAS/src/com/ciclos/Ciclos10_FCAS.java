package com.ciclos;

import java.util.Scanner;

public class Ciclos10_FCAS {
    public static void  main(String[] args) {

        /*
        10. Programa que lea 20 números e indique si son positivos o negativos y pares o
        impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
        */

        System.out.println("\uD835\uDCEC=================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC===20 NÚMEROS===\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        int SumPos = 0;
        int SumImp = 0;

        for (int i=0; i < 20; i++){
            System.out.println("Introduce un número: ");
            int num = entrada.nextInt(); //<- Lee los números que ingreso

            if (num>=0){
                System.out.println(num + " es positivo");
                SumPos += num;   //<-- acá debería empezar la sumatoria
            } else{
                System.out.println(num + " es negativo");
            }
            if (num% 2 == 0){ // <--- no olvidar que % realiza la división y toma EL RESTANTE, resultando 0 o 1.
                                //por tanto puedes definir si es par o no
                System.out.println(num + " es par");
                SumImp += num;   //<-- acá debería empezar la sumatoria
            } else{
                System.out.println(num + " es impar");
                SumImp += num;
            }
            System.out.println("La sumatoria de los números positivos: " + SumPos);
            System.out.println("La sumatoria de los números impares: " + SumImp);

        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC=================\uD835\uDCEC");

    }
}
