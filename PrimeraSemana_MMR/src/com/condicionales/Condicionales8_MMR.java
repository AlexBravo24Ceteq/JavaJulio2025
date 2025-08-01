package com.condicionales;

import java.util.Scanner;

public class Condicionales8_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
            seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
            obtenido.
            Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
            Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
            “ERROR: número incorrecto”.
         */
        System.out.println("==============================");
        System.out.println("=========VALOR OPUESTO========");
        System.out.println("========(lado opuesto)========");

        int valorDado;
        String opuesto;
        System.out.println("Ingresa valor del dado");
        valorDado = entrada.nextInt();

        switch (valorDado){
            case 1:
                opuesto = "seis";
                break;
            case 2:
                opuesto = "cinco";
                break;
            case 3:
                opuesto = "cuatro";
                break;
            case 4:
                opuesto = "tres";
                break;
            case 5:
                opuesto = "dos";
                break;
            case 6:
                opuesto = "uno";
                break;
            default:
                opuesto = "ERROR: número incorrecto";
        }

        System.out.println(opuesto);
        System.out.println("============FIN============");
    }
}
