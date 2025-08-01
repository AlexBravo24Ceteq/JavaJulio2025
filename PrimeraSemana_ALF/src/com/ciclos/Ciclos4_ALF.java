package com.ciclos;

import java.util.Scanner;

public class Ciclos4_ALF {
    public static void main(String[] args) {

          /*
        4.Programa que reciba una frase y una letra por teclado. Deberá retornar
        como resultado cuántas veces existe esa letra dentro de la frase. Si no existe,
        imprimir un mensaje “Carácter no encontrado”.
         */

        Scanner entrada = new Scanner(System.in);
        String frase;
        int contadorletra = 0;
        char letra;

        System.out.println("Ingrese una frase: ");
        frase = entrada.nextLine();
        //entrada.nextLine();
        System.out.println("Ingrese la letra solicitada: ");
        letra = entrada.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra){
                contadorletra++;
            }

        }

        if(contadorletra > 0){
            System.out.println("La letra aparece: "+ contadorletra+ " veces");

        }
        else{
            System.out.println("caracter No encontrado");
        }
    }
}
