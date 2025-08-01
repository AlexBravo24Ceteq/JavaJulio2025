package com.ciclos;

import java.util.Scanner;

public class Ciclos5_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
            de un día desde las 00:00:00 horas hasta las 23:59:59 horas
         */
        System.out.println("============================");
        System.out.println("===========RELOJ============");
        System.out.println("============================");

        int horas = 0, minutos = 0, segundos = 0;
        do {
            do {
                do {
                    //Se imprime en formato 00
                    System.out.println(String.format("%02d", horas)+":"+String.format("%02d", minutos)+":"+String.format("%02d", segundos));
                    segundos++; //aumenta segundos
                } while (segundos <= 59);
                minutos++; //aumenta minutos
                segundos = 0; //se reinician segundos
            } while (minutos <= 59);
            horas++; //aumentan horas
            minutos = 0; //se reinician los minutos
        } while (horas <= 23);

        System.out.println("============FIN=============");
    }
}
