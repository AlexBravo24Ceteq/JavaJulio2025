package com.condicionales;

import java.util.Scanner;

public class Condicionales8_ASV {
    public static void main(String[] args) {
        /*
        8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al
        lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena)
        de la cara opuesta al resultado obtenido.
        Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
        Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
        “ERROR: número incorrecto”

         */

        Scanner entrada = new Scanner(System.in);
        int dado;
        System.out.println("Introduzca el valor obtenido del dado: ");
        dado = entrada.nextInt();

        if(dado == 1){
            System.out.println("La cara Opuesta de 1 es 6");

        }
        else if(dado == 2){
            System.out.println("La cara Opuesta de 2 es 5");
        }
        else if(dado == 3){
            System.out.println("La cara Opuesta de 3 es 4");
        }
        else if(dado == 4){
            System.out.println("La cara Opuesta de 4 es 3");
        }
        else if(dado == 5){
            System.out.println("La cara Opuesta de "+ dado +  " es 2");
        }
        else if(dado == 6){
            System.out.println("La cara Opuesta de"+ dado + "es 1");
        }
        else{
            System.out.println("Numero Invalido");
        }

    }
}
