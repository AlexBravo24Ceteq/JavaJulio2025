package com.ciclos;

import java.util.Scanner;

public class Ciclos11_GDSA {
    public static void main(String[] args) {
        /*
        11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
            ancho y el alto. Ejemplo: 3*2
          * * *
          * * *
         */
        System.out.println("»»»»»»»»»»»»»» Ejercicio 11 ««««««««««««««««««««");

        Scanner input=new Scanner(System.in);
        int ancho,alto;
        System.out.println("Ingresa ancho y alto de la matriz");
        System.out.print("Ancho: ");
        ancho=input.nextInt();
        System.out.print("Alto: ");
        alto= input.nextInt();
        System.out.println("Matriz introducida de "+ancho +"x"+ alto);
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        
        
        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
