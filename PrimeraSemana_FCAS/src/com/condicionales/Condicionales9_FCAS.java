package com.condicionales;

import java.util.Scanner;

public class Condicionales9_FCAS {

    public static void  main(String[] args) {

        /*
        9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
        introducimos otro número nos da un error.
        */

        System.out.println("\uD835\uDCEC====================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==DÍA DE LA SEMANA==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        int DíaS;

        do {
            System.out.println("Buenas, ¿podrías indicarme qué día de la semana es hoy?");
            System.out.println("(Toma en cuenta que Lunes = 1, Martes = 2 y así respectivamente)");
            DíaS = entrada.nextInt();

            if (DíaS == 1 ){
                System.out.println("Muchas gracias, ahora se que es Lunes");
            }else if (DíaS == 2 ){
                System.out.println("Muchas gracias, ahora se que es Martes");
            }else if (DíaS == 3 ){
                System.out.println("Muchas gracias, ahora se que es Miercoles");
            }else if (DíaS == 4 ){
                System.out.println("Muchas gracias, ahora se que es Jueves");
            }else if (DíaS == 5 ){
                System.out.println("Muchas gracias, ahora se que es Viernes");
            }else if (DíaS == 6 ){
                System.out.println("Muchas gracias, ahora se que es Sábado");
            }else if (DíaS == 7 ){
                System.out.println("Muchas gracias, ahora se que es Domingo");
            }else {
                System.out.println("Ese día no existe, no juegues conmigo, dime el día, por favor \uD83D\uDE41");
            }
        } while (DíaS < 1 || DíaS > 7); // El codigo es el mismo que en el ejercicio 8, va a repetir mi codigo si el número NO está entre 1 y 7
        //Aunque estoy conciente que pude ocupar el condicional CASE

        System.out.println("\uD835\uDCEC==FIN DEL PROGRAMA==\uD835\uDCEC");
        System.out.println("\uD835\uDCEC====================\uD835\uDCEC");

    }
}
