package com.ciclos;

public class Ciclos5_GDSA {
    public static void main(String[] args) {
         /*
            5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
            de un día desde las 00:00:00 horas hasta las 23:59:59 horas*/
        System.out.println("»»»»»»»»»»»»»» Ejercicio 5 ««««««««««««««««««««");
        for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    System.out.println(hora + ":" + minuto + ":" + segundo);
                }
            }
        }
        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
