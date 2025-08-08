package com.ciclos;

public class Ciclos1_FCAS {
    public static void  main(String[] args) {

        //1.- Programa un algoritmo que realice la tabla de multiplicar del 12

        System.out.println("\uD835\uDCEC================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==TABLA DEL 12==\uD835\uDCEC");

        int x=1;
        while (x<=12){
            System.out.println("12 x"+ x + " = " + (12*x));
            x++;
        }

        //Con ciclo for

        for (int i=1; i<=12; i++){
            System.out.println("12 x"+ i + " = " + (12*i));
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC================\uD835\uDCEC");
    }
}
