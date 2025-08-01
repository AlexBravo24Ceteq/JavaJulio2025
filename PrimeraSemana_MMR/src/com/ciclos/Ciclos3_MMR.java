package com.ciclos;

import java.util.Scanner;

public class Ciclos3_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 3. Realiza un programa para determinar si un String es palíndromo.
         */
        System.out.println("============================");
        System.out.println("=========PALINDROMO=========");
        System.out.println("============================");

        String palabraOriginal, palabraInversa = "";
        System.out.println("Ingresa posible palindromo");
        palabraOriginal = entrada.nextLine();

        int i;
        int contLetras = palabraOriginal.length()-1; //Cantidad de valores de la palabra ingresada
        for (i = contLetras; i >= 0; i--){ //recorrido de ultima letra hasta la primera
            palabraInversa = palabraInversa + palabraOriginal.charAt(i); //se genera nueva palabra inversa
        }
        palabraOriginal = palabraOriginal.replace(" ", "");
        palabraInversa = palabraInversa.replace(" ", "");

        if (palabraOriginal.toLowerCase().equals(palabraInversa.toLowerCase()))
            System.out.println("Es un palindromo :) ");
        else System.out.println("No es un palindromo :( ");

        System.out.println("============FIN=============");
    }
}
