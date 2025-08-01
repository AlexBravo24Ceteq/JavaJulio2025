package com.condicionales;

import java.util.Scanner;

public class Condicionales10_GDSA {
    public static void main(String[] args) {
        /*
        10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
            mes correspondiente.
         */
        System.out.println("///////////////////////////////////////////////");
        System.out.println("/ PROGRAMA PARA VER EL MES DEL AÑO AL /////////");
        System.out.println("///////////INTRODUCIR UN NUMERO////////////////");
        System.out.println("///////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 12: ");
        int mes = input.nextInt();
        String mensaje;
        switch (mes) {
            case 1:
                mensaje = "Enero tiene 31 días.";
                break;
            case 2:
                mensaje = "Febrero tiene 28 días.";
                break;
            case 3:
                mensaje = "Marzo tiene 31 días.";
                break;
            case 4:
                mensaje = "Abril tiene 30 días.";
                break;
            case 5:
                mensaje = "Mayo tiene 31 días.";
                break;
            case 6:
                mensaje = "Junio tiene 30 días.";
                break;
            case 7:
                mensaje = "Julio tiene 31 días.";
                break;
            case 8:
                mensaje = "Agosto tiene 31 días.";
                break;
            case 9:
                mensaje = "Septiembre tiene 30 días.";
                break;
            case 10:
                mensaje = "Octubre tiene 31 días.";
                break;
            case 11:
                mensaje = "Noviembre tiene 30 días.";
                break;
            case 12:
                mensaje = "Diciembre tiene 31 días.";
                break;
            default:
                mensaje = "ERROR: número de mes incorrecto.";
                break;
        }
        System.out.println(mensaje);
        System.out.println("///////////////FIN DEL PROGRAMA///////////////");
    }
}
