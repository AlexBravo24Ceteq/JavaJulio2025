package com.ciclos;

import java.util.Scanner;

public class Ciclos4_GDSA {
    public static void main(String[] args) {
       /*
        4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
        cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
        “Carácter no encontrado”.*/
        System.out.println("»»»»»»»»»»»»»» Ejercicio 4 ««««««««««««««««««««");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String texto = input.nextLine();
        texto=texto.toLowerCase();
        System.out.println("Ingrese una lettra para contar : ");
        String letra = input.nextLine();
        int inicio = 0;
        int fin = texto.length();
        int contador=0;
        while (inicio < fin) {
            if (texto.charAt(inicio) == letra.charAt(0)) {
                contador++;
            }
            inicio++;
        }
        System.out.println("la Frase contiene "+contador+" letras "+letra);
        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
