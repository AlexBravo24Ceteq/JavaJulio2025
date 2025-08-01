package com.ciclos;

import java.util.Scanner;

public class Ciclos5_ASV {
    public static void main(String[] args) {
        /*
        5. Simular el comportamiento de un reloj digital, imprimiendo la hora,
        minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Reloj digital");

        for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    System.out.println("Hora : "+ hora+" minutos: "+minuto+ "segundo: "+segundo);

                }

            }

        }
    }
}
