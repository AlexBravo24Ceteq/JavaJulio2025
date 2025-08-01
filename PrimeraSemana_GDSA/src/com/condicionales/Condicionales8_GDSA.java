package com.condicionales;

import java.util.Scanner;

public class Condicionales8_GDSA {
    public static void main(String[] args) {
        /*
        8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
        seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
        obtenido.
        Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
        Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
        “ERROR: número incorrecto”.
         */
        System.out.println("///////////////////////////////////////////////");
        System.out.println("/ PROGRAMA PARA VER CARAS OPUESTAS DE UN DADO /");
        System.out.println("///////////////////////////////////////////////");
        System.out.println("///////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el resultado del dado (1 a 6): ");
        int numero = input.nextInt();
        if (numero < 1 || numero > 6) {
            System.out.println("ERROR: número incorrecto");
        } else {
            int caraOpuesta = 7 - numero;
            String caraOpuestaEnLetras = "";
            switch (caraOpuesta) {
                case 1:
                    caraOpuestaEnLetras = "uno";
                    break;
                case 2:
                    caraOpuestaEnLetras = "dos";
                    break;
                case 3:
                    caraOpuestaEnLetras = "tres";
                    break;
                case 4:
                    caraOpuestaEnLetras = "cuatro";
                    break;
                case 5:
                    caraOpuestaEnLetras = "cinco";
                    break;
                case 6:
                    caraOpuestaEnLetras = "seis";
                    break;
            }
            System.out.println("La cara opuesta es: " + caraOpuestaEnLetras);
        }
        System.out.println("///////////////FIN DEL PROGRAMA///////////////");
    }
}
