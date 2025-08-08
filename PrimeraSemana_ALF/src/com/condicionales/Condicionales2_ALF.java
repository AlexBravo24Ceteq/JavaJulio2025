package com.condicionales;

import java.util.Scanner;

public class Condicionales2_ALF {
    public static void main(String[] args) {
        /*
        * 2.Realiza un programa que pida un número por
        * teclado y nos indique si es par o impar.*/

        Scanner entrada = new Scanner(System.in);
        int numero;//declarar variable de tipo int
        System.out.println("PROGRMA QUE EVALUA SIN UN NUMERO ES PAR O IMPAR");
        System.out.println("*****************************************************");
        System.out.print("Ingrese un número: ");//Aqui pedimos que ingrese un numero
        numero = entrada.nextInt();// aqui es donde se guarda

        if (numero % 2 == 0) {//Si es verdadera
            System.out.println(numero + " es un número par.");
        } else {//No se cumple la condicion
            System.out.println(numero + " es un número impar.");
        }

    }
}
