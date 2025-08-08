package com.condicionales;

import java.util.Scanner;

public class Condicionales10_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
            mes correspondiente.
         */
        System.out.println("==============================");
        System.out.println("=========DIAS DEL MES=========");
        System.out.println("============(días)============");

        int mes;
        int dias;
        System.out.println("Ingresa el número del mes");
        mes = entrada.nextInt();

        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                dias = -1;
        }

        if (dias == -1)
            System.out.println("ERROR: mes incorrecto");
        else
            System.out.println("El mes tiene "+dias+" dias");

        System.out.println("============FIN============");
    }
}
