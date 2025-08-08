package com.condicionales;

import java.util.Scanner;

public class Condicionales8_ALF {
    public static void main(String[] args) {
        /*8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
        seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
        obtenido.
        Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
        Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
        “ERROR: número incorrecto”.*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Mostrar por pantalla el número en letras (dato cadena) de la cara opuesta al resultado\n" +
                "        obtenido.");
        System.out.println("*******************************************************************************");
        int numero;
        System.out.println("Introduce un numero del 1 al 6 que tiene un dado");
        numero = entrada.nextInt();
        if(numero == 1){
            System.out.println("La cara opuesta del numero ingresado: "+numero+ " es seis");
        } else if (numero == 2) {
            System.out.println("La cara opuesta del numero ingresado: "+numero+ " es cinco");
        } else if (numero == 3) {
            System.out.println("La cara opuesta del numero ingresado: "+numero+ " es cuatro");
        } else if (numero == 4) {
            System.out.println("La cara opuesta del numero ingresado: "+numero+ " es tres");
        } else if (numero == 5) {
            System.out.println("La cara opuesta del numero ingresado: "+numero+ " es seis");
        } else if (numero == 6) {
            System.out.println("La cara opuesta del numero ingresado: "+numero+ " es uno");
        } else if (numero < 1 || numero > 6) {
            System.out.println("ERROR EL NUMERO DADO ES INCORRECTO ):");
        }
    }
}
