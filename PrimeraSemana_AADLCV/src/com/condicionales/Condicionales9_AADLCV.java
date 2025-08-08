package com.condicionales;

import java.util.Scanner;

public class Condicionales9_AADLCV {

    /* 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
    introducimos otro número nos da un error.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 7: ");
        int numero = entrada.nextInt();

        String[] dias = {
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        };

        if (numero >= 1 && numero <= 7) {
            System.out.println("El día correspondiente es: " + dias[numero - 1]);
        } else {
            System.out.println("ERROR: número incorrecto");
        }

    }

}
