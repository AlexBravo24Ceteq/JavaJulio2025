package com.ciclos;

import java.util.Scanner;

public class Ciclos7_ASV {
    public static void main(String[] args) {
        /*
        7- Una persona desea invertir $700.00 en un banco, el cual le otorga
        un 2% de interés mensual. ¿En cuántos meses tendrá más de $1500,
        si reinvierte cada mes todo su dinero?

         */

        Scanner entrada = new Scanner(System.in);
        double inversion, tasaInteres, pagoTotal = 0;
        int meses = 0;

        System.out.println("Ingrese la Inversion que desea realizar: ");
        inversion = entrada.nextDouble();
        System.out.println("Ingrese el interes mensual: ");
        tasaInteres = entrada.nextDouble();

        while (inversion <= 1500){
            inversion= inversion + (inversion * tasaInteres);
            pagoTotal = inversion;
            meses++;

        }

        System.out.printf("Numero de Meses Utilizados: %d%n", meses);
        System.out.printf("Inversion final: $%.2f", pagoTotal);

    }
}
