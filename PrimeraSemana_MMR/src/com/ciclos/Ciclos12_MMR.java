package com.ciclos;

import java.util.Scanner;

public class Ciclos12_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
            cuando el promedio de las edades sea superior a 25.
         */
        System.out.println("=============================");
        System.out.println("=======PROMEDIO EDADES=======");
        System.out.println("=============================");

        int edad, suma = 0, conteo = 0;
        float promedio = 0;
        do {
            System.out.println("Ingresa una edad");
            edad = entrada.nextInt();
            suma = suma + edad;
            conteo ++;
            promedio = ((float) suma /conteo);
        } while (promedio <= 25);

        System.out.println("============FIN=============");
    }
}
