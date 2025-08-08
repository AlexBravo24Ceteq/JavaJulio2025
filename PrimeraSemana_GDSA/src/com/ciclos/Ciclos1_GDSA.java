package com.ciclos;

public class Ciclos1_GDSA {
    public static void main(String[] args) {
        /*
        1.- Programa un algoritmo que realice la tabla de multiplicar del 12
         */
        //ejemplo con while
        System.out.println("»»»»»»»»»»»»»» Ejercicio 1 ««««««««««««««««««««");

        int x=1;
        while (x<=10){
            System.out.println("12x"+x +"= "+(12*x));
            x++;
        }
        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
        //ejemplo con for
        for (int i = 0; i <=13 ; i++) {
            System.out.println("12x"+i +"= "+(12*i));
        }
        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
