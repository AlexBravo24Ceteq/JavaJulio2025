package com.ciclos;

import java.util.Scanner;

public class Ciclos4_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
            cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
            “Carácter no encontrado”.
         */
        System.out.println("============================");
        System.out.println("======EXISTE CARACTER=======");
        System.out.println("============================");

        String frase, letra = "", valorPosicion = "";
        int numCaracteres, i = 0, conteo = 0;
        System.out.println("Ingresa frase");
        frase = entrada.nextLine();
        System.out.println("Ingresa caracter a buscar");
        letra = entrada.nextLine();

        if (frase.contains(letra)){ //si la palabra contiene la letra
            numCaracteres = frase.length(); //cantidad de caracteres de la frase
            while (i < numCaracteres) { //mientras exista el caracter
                valorPosicion = String.valueOf(frase.charAt(i)); //valor de la posicion en la frase
                if (valorPosicion.equals(letra)) //si el valor de la posicion es igual al de la comparacion
                    conteo = conteo+1; //se aumenta el conteo
                i++;
            }
            System.out.println("El carácter se encuentra " + conteo + " veces");
        } else
            System.out.println("El carácter no esta contenido en la frase");

        System.out.println("============FIN=============");
    }
}
