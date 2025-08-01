package com.ciclos;

import java.util.Scanner;

public class Ciclos2_GDSA {
    public static void main(String[] args) {
       /* 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
        desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
        23 x 95 = ???
        */
        System.out.println("»»»»»»»»»»»»»» Ejercicio 2 ««««««««««««««««««««");
        Scanner input=new Scanner(System.in);
        int num1,num2;
        System.out.print("Tabla de: ");
        num1= input.nextInt();
        System.out.print("Hasta el: ");
        num2=input.nextInt();
        int z=0;
        while (z<=num2){
            System.out.println("Multiplicación: "+num1+"x"+z+"= "+(num1*z));
            z++;
        }
        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
