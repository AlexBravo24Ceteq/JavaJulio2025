package com.condicionales;

import java.util.Scanner;

public class Condicionales8_AADLCV {

    /* 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
    seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
    obtenido.
    Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
    Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
    “ERROR: número incorrecto”.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el resultado del dado (1 a 6): ");
        int numero = entrada.nextInt();

        String[] numerosEnLetras = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};
        int caraOpuesta;

        if (numero >= 1 && numero <= 6) {

            caraOpuesta = 7 - numero;
            System.out.println("La cara opuesta es: " + numerosEnLetras[caraOpuesta - 1]);
        } else {
            System.out.println("ERROR: número incorrecto");
        }

    }

}
