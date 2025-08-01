package com.condicionales;

import java.util.Scanner;

public class Condicionales8_FCAS {
    public static void  main(String[] args) {

        /*
        8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
        seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
        obtenido.
        Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
        Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
        “ERROR: número incorrecto”.
        */

        System.out.println("\uD835\uDCEC====================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==DADO Y CONTRARIO==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        int Ndado;

        do {
        System.out.println("Tiraste un dado, ingresa el número que sale en la cara superior");
        Ndado = entrada.nextInt();

            if (Ndado == 1 ){
                System.out.println("La cara es: " + Ndado + " "+"Y la cara contraria es SEIS");
            }else if (Ndado == 2 ){
                System.out.println("La cara es: " + Ndado + " "+"Y la cara contraria es CINCO");
            }else if (Ndado == 3 ){
                System.out.println("La cara es: " + Ndado + " "+"Y la cara contraria es CUATRO");
            }else if (Ndado == 4 ){
                System.out.println("La cara es: " + Ndado + " "+"Y la cara contraria es TRES");
            }else if (Ndado == 5 ){
                System.out.println("La cara es: " + Ndado + " "+"Y la cara contraria es DOS");
            }else if (Ndado == 6 ){
                System.out.println("La cara es: " + Ndado + " "+"Y la cara contraria es UNO");
            }else {
                System.out.println("Esa cara no esta en un dado de seis caras, repite tu dato");
            }
        } while (Ndado < 1 || Ndado > 6); // Aquí va a repetir mi codigo si el número NO está entre 1 y 6

        System.out.println("\uD835\uDCEC==FIN DEL PROGRAMA==\uD835\uDCEC");
        System.out.println("\uD835\uDCEC====================\uD835\uDCEC");
    }
}
