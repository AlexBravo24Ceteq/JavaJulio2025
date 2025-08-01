package com.ciclos;

import java.util.Scanner;

public class Ciclos6_ASV {
    public static void main(String[] args) {
        /*
        6.- Una persona desea invertir $1000.00 en un banco,
        el cual le otorga un 2% de interés mensual.
        ¿Cuál será la cantidad de dinero que esta persona
        tendrá al cabo de un año si todo el dinero lo reinvierte?
         */

        Scanner entrada = new Scanner(System.in);
        double inversion, tasaInteres, pagoTotal = 0;

        System.out.println("Ingrese la Inversion que desea realizar: ");
        inversion = entrada.nextDouble();
        System.out.println("Ingrese el interes mensual: ");
        tasaInteres = entrada.nextDouble();

        for (int mes = 1; mes < 12; mes++) {
            pagoTotal = inversion + (inversion * tasaInteres);
        }
        System.out.printf("La cantidad final es de: $%.2f", pagoTotal);
    }
}
