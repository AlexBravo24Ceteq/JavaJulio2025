package com.ciclos;

import java.util.Scanner;

public class Ciclos11_FCAS {
    public static void  main(String[] args) {

         /*
        11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
        ancho y el alto. Ejemplo: 8 x 8
        */

        System.out.println("\uD835\uDCEC===================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC===CUADRADO B*H ===\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);

        int ancho, alto;
        System.out.println("Ingrese el ancho de la figura");
        ancho = entrada.nextInt();
        System.out.println("Ingrese el alto de la figura");
        alto = entrada.nextInt();

        String fila = "";
        for (int j = 1; j <= ancho; j++){ //Se construye la fila
            fila += ("*  ");
        }
        for (int i = 1; i <= alto; i++){ //Se imprime n veces la fila (alto)
            System.out.println(fila);

        }

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC===================\uD835\uDCEC");
    }
}
