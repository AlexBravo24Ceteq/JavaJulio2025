package com.condicionales;

import java.util.Scanner;

public class Condicionales7_AADLCV {

    public static void main(String[] args) {

        /* 7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
        debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
        cobrar es la siguiente:
        Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
        De 50 a 99 alumnos, el costo es de 70 euros.
        De 30 a 49 alumnos, el costo es de 95 euros.
        Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
        alumnos.
        Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
        pagar cada alumno por el viaje.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de alumnos que asistirán al viaje: ");
        int alumnos = entrada.nextInt();

        double costoPorAlumno;
        double pagoTotal;

        if (alumnos >= 100) {
            costoPorAlumno = 65;
            pagoTotal = alumnos * costoPorAlumno;
        } else if (alumnos >= 50) {
            costoPorAlumno = 70;
            pagoTotal = alumnos * costoPorAlumno;
        } else if (alumnos >= 30) {
            costoPorAlumno = 95;
            pagoTotal = alumnos * costoPorAlumno;
        } else {
            pagoTotal = 4000;
            costoPorAlumno = pagoTotal / alumnos;
        }

        System.out.println("El pago total a la compañía de autobuses es: " + pagoTotal + " euros.");
        System.out.println("Cada alumno debe pagar: " + String.format("%.2f", costoPorAlumno) + " euros.");

    }
}
