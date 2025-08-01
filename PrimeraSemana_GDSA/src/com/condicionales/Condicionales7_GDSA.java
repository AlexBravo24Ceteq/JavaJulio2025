package com.condicionales;

import java.util.Scanner;

public class Condicionales7_GDSA {
    public static void main(String[] args) {
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
        System.out.println("///////////////////////////////////////////////");
        System.out.println("/PROGRAMA PARA CALCULAR EL PAGO A LA COMPAÑIA /");
        System.out.println("/////////////// DE AUTOBUSES //////////////////");
        System.out.println("//////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Alumnos: ");
        int alu = input.nextInt();
        int costo;
        double pago;
        boolean bandera=false;
        if(alu>=100){
            costo=65;
        } else if (alu>=50 && alu<=99) {
            costo=70;
        } else if (alu>=30 && alu<=49) {
            costo=95;
        }else{
            costo=4000;
            bandera=true;
        }
        if (!bandera){
            pago=costo*alu;
        }else {
            pago=costo;
        }

        System.out.println("Debe de pagar $"+pago);
        System.out.println("///////////////FIN DEL PROGRAMA///////////////");
    }
}
