package com.condicionales;

import java.util.Scanner;

public class Condicionales2_ASV {
    public static void main(String[] args) {
        /*
        2.Realiza un programa que pida un número
        por teclado y nos indique si es par o impar.

         */

        //Creamos el Scanner
        Scanner entrada = new Scanner(System.in);

        //Creamos la variable para guardar el numero
        int valorInicial;

        //Mandamos a pedir el numero
        System.out.println("Introduzca un valor: ");
        valorInicial = entrada.nextInt();

        //Para saber si un numero es par o impar, usamos el Modulo de 2 (%2)
        // si Numero Numero%2 == 0, sabemos que es par y si es
        //num %2 == 1, es impar

        //Lo implentamos con un if

        if(valorInicial%2 == 0){
            System.out.println("Es Numero Par");

        }

        else {
            System.out.println("Es Numero Impar");
        }


    }
}
