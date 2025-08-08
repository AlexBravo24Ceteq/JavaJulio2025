package com.condicionales;

import java.util.Scanner;

public class Condicionales9_ALF {
    public static void main(String[] args) {

        /*
        * 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
            introducimos otro número nos da un error.
        * */

        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("PROGRAMA QUE DICE EL DIA, ENTRE 1 AL 7");
        System.out.println("****************************************");
        System.out.println("Ingresa un numero del 1 al 7");
        num = entrada.nextInt();
        if (num == 1){
            System.out.println("EL DIA DE LA SEMANA ES LUNES");
        } else if (num == 2) {
            System.out.println("EL DIA DE LA SEMANA ES MARTES");
        } else if (num == 3) {
            System.out.println("EL DIA DE LA SEMANA ES MIERCOLES");
        } else if (num == 4) {
            System.out.println("EL DIA DE LA SEMANA ES JUEVES");
        } else if (num == 5) {
            System.out.println("EL DIA DE LA SEMANA ES VIERNES");
        } else if (num == 6) {
            System.out.println("EL DIA DE LA SEMANA ES SABADO");
        } else if (num == 7) {
            System.out.println("EL DIA DE LA SEMANA ES DOMINGO");
        } else if (num >=8) {
            System.out.println("NUMERO INCORRECTO.......");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
