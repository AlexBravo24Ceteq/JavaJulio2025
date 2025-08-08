package com.condicionales;

import java.util.Scanner;

public class Condicionales7_ALF {
    public static void main(String[] args) {
        /*7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
        debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
        cobrar es la siguiente:
        * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
        * De 50 a 99 alumnos, el costo es de 70 euros.
        * De 30 a 49 alumnos, el costo es de 95 euros.
        * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
        alumnos.
        Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
        pagar cada alumno por el viaje.*/
        Scanner entrada = new Scanner(System.in);
        int alumno;
        double pago;
        System.out.println("Determinar pago a compañia de autobuses deacuerdo a cuantos alumnos sean");
        System.out.println("*************************************************************************");
        System.out.println("Introduce la cantidad de alumnos que asistiran al viaje");
        alumno = entrada.nextInt();
        if(alumno >= 100){
            pago = alumno * 65;
            System.out.println("LA CANTIDAD DE ALUMNOS QUE ASISTIRAN SON: "+ alumno);
            System.out.println("CADA ALUMNO PAGA DE 65 EUROS CADA UNO");
            System.out.println("EL PRECIO TOTAL POR EL VIAGE SERA DE: "+ pago);
        } else if (alumno >=50 ) {
            pago = alumno * 70;
            System.out.println("LA CANTIDAD DE ALUMNOS QUE ASISTIRAN SON: "+ alumno);
            System.out.println("CADA ALUMNO PAGA DE 70 EUROS CADA UNO");
            System.out.println("EL PRECIO TOTAL POR EL VIAGE SERA DE: "+ pago);

        } else if (alumno >=30) {
            pago = alumno * 95;
            System.out.println("LA CANTIDAD DE ALUMNOS QUE ASISTIRAN SON: "+ alumno);
            System.out.println("CADA ALUMNO PAGA DE 95 EUROS CADA UNO");
            System.out.println("EL PRECIO TOTAL POR EL VIAGE SERA DE: "+ pago);
        } else if (alumno <= 29) {
            pago = 4000;
            System.out.println("LA CANTIDAD DE ALUMNOS QUE ASISTIRAN SON: "+ alumno);
            System.out.println("EL PRECIO TOTAL POR EL VIAGE SERA DE: "+ pago);
        }
        System.out.println("FIN DEL PROGRAMA");

    }
}
