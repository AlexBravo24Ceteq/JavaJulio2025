package com.ciclos;

public class Ciclos1_ASV {
    public static void main(String[] args) {
        //1.- Programa un algoritmo que realice la
        // tabla de multiplicar del 12


        System.out.println("1. Tabla de Multiplicar del 12");

        /*
        int x = 1;
        while (x <= 10){
            System.out.println("12 x "+ x + " = " + (12*x));
            x++;
        }

         */
        //Ej2. Solucionandolo con un ciclo for
        for (int i = 1; i <= 10; i++){
            System.out.println("12 x "+ i + " = "+ (12*i));
        }
    }
}
