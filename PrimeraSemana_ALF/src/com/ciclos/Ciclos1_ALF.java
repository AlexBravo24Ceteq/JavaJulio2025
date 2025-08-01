package com.ciclos;

public class Ciclos1_ALF {
    public static void main(String[] args) {
    /*
    * 1.- Programa un algoritmo que realice la tabla de multiplicar del 12*/
        System.out.println("TABLA DEL 12 CON CICLO WHILE");
        int x = 1;
        while (x<=10){
            System.out.println("12 x "+ x+ " = "+ (12*x));
            x++;
        }

        System.out.println("TABLA DEL 12 CON CICLO FOR");

        for (int i = 1; i <=10 ; i++) {
            System.out.println("12 x "+i+" = "+ (12*i));
            
        }
    }
}
