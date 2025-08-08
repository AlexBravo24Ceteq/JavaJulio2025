package com.ciclos;

public class Ciclos5_FCAS {
    public static void  main(String[] args) {

        /*
         5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
             de un día desde las 00:00:00 horas hasta las 23:59:59 horas
         */
        System.out.println("\uD835\uDCEC=========\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==RELOJ==\uD835\uDCEC");

        int horas;
        int min;
        int seg;

        for (horas=0; horas < 24 ; horas++){
            for (min=0; min < 60; min++){
                for (seg=0; seg < 60; seg++){
                    System.out.printf("%02d:%02d:%02d%n", horas, min, seg);
                    }
            }
        }
        System.out.println("====FIN====");
        System.out.println("\uD835\uDCEC=========\uD835\uDCEC");
    }
}
