package com.ciclos;

import java.util.Scanner;

public class Ciclos4_FCAS {
    public static void  main(String[] args) {

        /*
        4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
        cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
        “Carácter no encontrado”.
         */
        System.out.println("\uD835\uDCEC===================================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==DETECTOR DE LETRAS EN UNA FRASE==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        String frase;
        char letra;
        int conteo = 0;

        System.out.println("Ingresa una frase: ");
        frase = entrada.nextLine().toLowerCase();
        System.out.println("¿Qué letra deseas contar en la frase?");
        letra = entrada.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==letra){
                conteo++;
            }
        }
        System.out.println("La frase: " + frase + " ;contiene " + conteo + " la letra: "+ letra);

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC===================================\uD835\uDCEC");

    }
}
