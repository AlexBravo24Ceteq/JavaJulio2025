package com.ciclos;

import java.util.Scanner;

public class Ciclos2_FCAS {
    public static void  main(String[] args) {

        /*
        2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado,
        hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.     23 x 95 = ???
         */

        System.out.println("\uD835\uDCEC========================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==TABLA DE MULTIPLICAR==\uD835\uDCEC");

        int x;
        int y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el número del que deseas saber su tabla");
        x = entrada.nextInt();
        System.out.println("Ingresa el alcance que deseas para tu tabla");
        y = entrada.nextInt();

        for (int i=1; i<=y; i++){
            System.out.println( x + " * "+ i + " = " + (x*i));
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC========================\uD835\uDCEC");

    }
}
