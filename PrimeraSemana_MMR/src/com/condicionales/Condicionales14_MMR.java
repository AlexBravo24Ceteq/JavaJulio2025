package com.condicionales;

import java.util.Scanner;

public class Condicionales14_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
        horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
        primeras 40 horas y $20 por cada hora extra.
         */
        System.out.println("==============================");
        System.out.println("=======SALARIO SEMANAL========");
        System.out.println("=========(pago total)=========");

        float pagoTotal;
        int hrsT;
        System.out.println("Ingresa horas trabajadas");
        hrsT = entrada.nextInt();

        if (hrsT <= 40) {
            pagoTotal = hrsT*16;
        } else {
            pagoTotal = (40*16)+((hrsT-40)*20);
        }

        System.out.println("salario correspondiente es de: "+pagoTotal);

        System.out.println("============FIN============");
    }
}
