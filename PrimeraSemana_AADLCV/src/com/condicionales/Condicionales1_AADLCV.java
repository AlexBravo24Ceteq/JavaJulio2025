package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AADLCV {

    public static void main(String[] args) {
        /*
        1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
         */

        System.out.println("=========================================================");
        System.out.println("PROGRAMA PARA EVALUAR CUAL NUMERO ES MAYOR");
        System.out.println("================ O SI SON IGUALES =======================");

        // Para ingresar dos números por teclado necesitamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Necesitamos dos variables donde guardar los números a comparar
        int numero1, numero2;

        // Mandamos un mensaje en consola para poder solicitar los números
        System.out.println("Introduce un primer número");
        numero1 = entrada.nextInt();
        System.out.println("Introduce un segundo numero");
        numero2 = entrada.nextInt();

        // Evaluamos
        if (numero1>numero2){
            System.out.println("El PRIMER número tecleado es MAYOR");
        }else if(numero2>numero1){
            System.out.println("El SEGUNDO número tecleado es MAYOR");
        }else {
            System.out.println("Los números tecleados son IGUALES");
        }

        System.out.println("========== FIN DEL PROGRAMA ===========");

    }

}
