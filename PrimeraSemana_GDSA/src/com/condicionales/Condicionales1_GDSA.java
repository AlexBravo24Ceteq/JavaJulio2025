package com.condicionales;

import java.util.Scanner;

public class Condicionales1_GDSA {
    public static void main(String[] args) {
        /*
        1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
         */
        System.out.println("//////////////////////////////////////////////");
        System.out.println("//PROGRAMA PARA EVALUAR CUAL NUMERO ES MAYOR//");
        System.out.println("//////////////O SI SON IGUALES////////////////");
        System.out.println("//////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        int valor1,valor2;
        System.out.println("Introduce el primer numero");
        valor1=input.nextInt();
        System.out.println("Introduce el Segundo Numero");
        valor2=input.nextInt();
        if(valor1>valor2){
            System.out.println("El Primer Numero es Mayor");
        } else if (valor1<valor2) {
            System.out.println("El Primer Numero es Menor");
        }else {
            System.out.println("Los Numeros Son Iguales");
        }
        System.out.println("///////////////FIN DEL PROGRAMA///////////////");

    }
}
