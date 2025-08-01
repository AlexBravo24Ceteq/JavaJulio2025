package com.condicionales;

import java.util.Scanner;

public class Condicionales7_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
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
        System.out.println("============================");
        System.out.println("=========COSTO VIAJE========");
        System.out.println("===(Costo total a pagar)====");

        int cantAlumnos;
        float precioxAlumno = 0, costoBus = 0;
        System.out.println("Ingresa cantidad de alumnos a viajar");
        cantAlumnos = entrada.nextInt();

        if (cantAlumnos >= 100){
            precioxAlumno = 65;
            costoBus = precioxAlumno * cantAlumnos;
        } else if (cantAlumnos >= 50 /*&& cantAlumnos < 100*/){
            precioxAlumno = 70;
            costoBus = precioxAlumno * cantAlumnos;
        } else if (cantAlumnos >= 30 /*&& cantAlumnos < 50*/){
            precioxAlumno = 95;
            costoBus = precioxAlumno * cantAlumnos;
        } else if (cantAlumnos < 30){
            costoBus = 4000;
            precioxAlumno = costoBus/cantAlumnos;
        }

        System.out.println("El costo por alumno es de: "+precioxAlumno+" euros");
        System.out.println("El total de transporte es de: "+costoBus+" euros");
        System.out.println("============FIN============");
    }
}
