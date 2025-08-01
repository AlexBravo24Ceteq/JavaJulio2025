package com.condicionales;

import java.util.Scanner;

public class Condicionales2_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 2.Realiza un programa que pida un número por teclado y
            nos indique si es par o impar.
        */
        System.out.println("============================");
        System.out.println("======EVALUA UN NÚMERO======");
        System.out.println("========(PAR Ó IMPAR)=======");

        int numero;
        System.out.println("Ingresa un numero");
        numero = entrada.nextInt();

        // % - sirve para extraer el reciduo de una division
        if ((numero%2) == 0){ //Si el reciduo de dividir a 2 es 0
            System.out.println("El número ingresado es par"); //es par
        } else { //de lo contrario
            System.out.println("El número ingresado es impar"); //es impar
        }
        System.out.println("============FIN============");
    }
}
