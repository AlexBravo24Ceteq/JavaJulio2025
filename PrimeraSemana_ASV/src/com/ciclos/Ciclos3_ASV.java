package com.ciclos;

import java.util.Scanner;

public class Ciclos3_ASV {
    public static void main(String[] args) {
        /*
        3. Realiza un programa para determinar
        si un String es palíndromo.
         */
        Scanner entrada = new Scanner(System.in);

        String frase, invertida;
        char aux;
        System.out.println("Ingresa una palabra o frase: ");
        frase = entrada.nextLine();
        invertida = "";


        for (int i = frase.length() - 1 ; i >= 0 ; i--) {
            aux = frase.charAt(i);
            invertida = invertida + aux;
            
        }
        System.out.println("la palabra invertida es: "+ invertida);

        if (frase.equals(invertida)){
            System.out.println("La palabra "+ frase + " es un palindromo: " + invertida);
        }

        else{
            System.out.println("La palabra ingresada "+ frase+ " no es palindromo: "+ invertida);
        }



    }
}
