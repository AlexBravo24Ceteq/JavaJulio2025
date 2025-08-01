package com.condicionales;

import java.util.Scanner;

public class Condicionales7_ASV {
    public static void main(String[] args) {
        /*
        7. El director de una escuela está organizando un viaje de estudios y
        requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar
        a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
        * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
        * De 50 a 99 alumnos, el costo es de 70 euros.
        * De 30 a 49 alumnos, el costo es de 95 euros.
        * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros,
           sin importar el número de alumnos.
        Realiza un algoritmo que permita determinar el pago a la compañía de autobuses
        y lo que debe pagar cada alumno por el viaje.
         */

        Scanner entrada = new Scanner(System.in);
        int numAlumnos, costoViaje;

        System.out.println("Ingrese el numero de alumnos: ");
        numAlumnos = entrada.nextInt();

        if(numAlumnos >= 100){
            costoViaje = numAlumnos * 65;

        }
        else if (numAlumnos < 99 && numAlumnos > 50) {
            costoViaje = numAlumnos * 70;

        } else if (numAlumnos < 49 && numAlumnos >30) {
            costoViaje = numAlumnos * 90;

        }

        else{
            costoViaje = 4000;
            //System.out.println("La renta del autobus sale en: "+costoViaje);

        }

        System.out.println("El costo de viaje es de: $"+costoViaje);

    }
}
