package com.condicionales;

import java.util.Scanner;

public class Condicionales14_FCAS {
    public static void  main(String[] args) {

        /*
        14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
        horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
        primeras 40 horas y $20 por cada hora extra.
        */


        System.out.println("\uD835\uDCEC=======================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==SALARIO SEMANAL==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        int horas;
        int pagoF;
        int pago1 = 16;
        int pagoE = 20;
        int horasE;

        System.out.println("¿Cuantas horas trabajó el obrero esta semana?");
        horas = entrada.nextInt();

        if (horas <= 40) {
            pagoF = pago1 * horas;
            System.out.println("Su pago esta semana será de: $" + pagoF);
        }else if (horas > 40) {
            horasE = horas - 40;
            pagoF = (pago1 * 40) + (horasE * pagoE);
            System.out.println("Su pago esta semana será de: $" + pagoF);
        }

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC=======================\uD835\uDCEC");

    }
}
