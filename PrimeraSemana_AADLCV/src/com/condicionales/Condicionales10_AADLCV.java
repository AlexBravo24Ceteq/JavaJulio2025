package com.condicionales;

import java.util.Scanner;

public class Condicionales10_AADLCV {

    /* 10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
    mes correspondiente.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 12: ");
        int mes = entrada.nextInt();

        switch (mes) {
            case 1:  // Enero5
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                System.out.println("Este mes tiene 31 días.");
                break;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                System.out.println("Este mes tiene 30 días.");
                break;
            case 2:  // Febrero
                System.out.println("Este mes tiene 28 días (29 si es año bisiesto).");
                break;
            default:
                System.out.println("ERROR: número de mes incorrecto.");
        }
    }
}
