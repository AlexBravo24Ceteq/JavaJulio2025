package com.condicionales;

import java.util.Scanner;

public class Condicionales9_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
            introducimos otro número nos da un error.
         */
        System.out.println("==============================");
        System.out.println("=========DIA DE SEMANA========");
        System.out.println("============(día)=============");

        int diaSemana;
        String diaTexto;
        System.out.println("Ingresa día de la semana");
        diaSemana = entrada.nextInt();

        switch (diaSemana){
            case 1:
                diaTexto = "Domingo";
                break;
            case 2:
                diaTexto = "Lunes";
                break;
            case 3:
                diaTexto = "Martes";
                break;
            case 4:
                diaTexto = "Miercoles";
                break;
            case 5:
                diaTexto = "Jueves";
                break;
            case 6:
                diaTexto = "Viernes";
                break;
            case 7:
                diaTexto = "Sabado";
                break;
            default:
                diaTexto = "ERROR: día incorrecto";
        }

        System.out.println(diaTexto);
        System.out.println("============FIN============");
    }
}
