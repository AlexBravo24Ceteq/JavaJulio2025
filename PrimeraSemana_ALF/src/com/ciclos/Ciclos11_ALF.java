package com.ciclos;

import java.util.Scanner;

public class Ciclos11_ALF {
    public static void main(String[] args) {

         /*
        11.Dibuja un cuadrado, como en la imagen que acompaña, i
        ntroducir desde teclado el ancho y el alto. Ejemplo: 8 x 8
         */

        Scanner entrada = new Scanner(System.in);
        int alto, ancho, area;

        System.out.println("Ingrese el Ancho: ");
        ancho = entrada.nextInt();
        System.out.println("Ingrese el Alto: ");
        alto = entrada.nextInt();

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                //System.out.print("*");

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
