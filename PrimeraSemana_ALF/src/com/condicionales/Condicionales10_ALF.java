package com.condicionales;

import java.util.Scanner;

public class Condicionales10_ALF {
    public static void main(String[] args) {
        /*10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
        mes correspondiente.*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que dice cuantos dias tiene cada mes del año");
        int mes;
        System.out.println("Introcue un  numero del 1 al 12 de acuerdo al mes deseado");
        mes = entrada.nextInt();
        if(mes == 1){
            System.out.println("EL MES 1 PERTENECE A ENERO Y CUENTA CON 31 DIAS");
        } else if (mes == 2) {
            System.out.println("EL MES 2 PERTENECE A FEBRERO Y CUENTA CON 28 O 29 (DIAS SI ES BISIESTO)");
        } else if (mes == 3) {
            System.out.println("EL MES 3 PERTENECE A MARZO Y CUENTA CON 31 DIAS");
        } else if (mes == 4) {
            System.out.println("EL MES 4 PERTENECE A ABRIL Y CUENTA CON 30 DIAS");
        } else if (mes == 5) {
            System.out.println("EL MES 5 PERTENECE A MAYO Y CUENTA CON 31 DIAS");
        } else if (mes == 6) {
            System.out.println("EL MES 6 PERTENECE A JUNIO Y CUENTA CON 30 DIAS");
        } else if (mes == 7) {
            System.out.println("EL MES 7 PERTENECE A JULIO Y CUENTA CON 31 DIAS");
        } else if (mes == 8) {
            System.out.println("EL MES 8 PERTENECE A AGOSTO Y CUENTA CON 31 DIAS");
        } else if (mes == 9) {
            System.out.println("EL MES 9 PERTENECE A SEPTIEMBRE Y CUENTA CON 30 DIAS");
        } else if (mes == 10) {
            System.out.println("EL MES 10 PERTENECE A OCTUBRE Y CUENTA CON 31 DIAS");
        } else if (mes == 11) {
            System.out.println("EL MES 11 PERTENECE A NOVIEMBRE Y CUENTA CON 30 DIAS");
        } else if (mes == 12) {
            System.out.println("EL MES 12 PERTENECE A DICIEMBRE Y CUENTA CON 31 DIAS");
        } else if (mes >=13) {
            System.out.println("El valor es  incorrecto...");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
