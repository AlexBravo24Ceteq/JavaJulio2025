package com.condicionales;

import java.util.Scanner;

public class Condicionales7_FCAS {
    public static void  main(String[] args) {

        /*
        7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
        debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
        cobrar es la siguiente:
        * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
        * De 50 a 99 alumnos, el costo es de 70 euros.
        * De 30 a 49 alumnos, el costo es de 95 euros.
        * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
        alumnos.
        Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
        pagar cada alumno por el viaje.
        */
        System.out.println("\uD835\uDCEC==================================\uD835\uDCEC");
        System.out.println("==COBRANZA DEL VIAJE DE ESTUDIOS==");

        Scanner entrada = new Scanner(System.in);
        int alumnos;
        double pago;
        int renta = 4000;

        System.out.println("Cantidad de alumnos que irán al viaje");
        alumnos = entrada.nextInt();

        if (alumnos >= 100 ){
            pago = alumnos * 65;
            System.out.println("A cada alumno se le cobrarán $65, dando un total de: $" + pago);
        }else if (alumnos >= 50 && alumnos < 100){
            pago = alumnos * 70;
            System.out.println("A cada alumno se le cobrarán $70, dando un total de: $" + pago);
        }else if (alumnos >= 30 && alumnos < 50){
            pago = alumnos * 95;
            System.out.println("A cada alumno se le cobrarán $95, dando un total de: $" + pago);
        }else if (alumnos < 30 ){
            pago = 4000 / alumnos;
            System.out.println("A cada alumno se le cobrarán: $" + pago);
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC==================================\uD835\uDCEC");
    }
}
