package com.condicionales;

import java.util.Scanner;

public class Condicionales3_ALF {
    public static void main(String[] args) {

        /*
        * 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
        segundo número es 0, debe mostrar un mensaje de error.*/

        Scanner entrada = new Scanner(System.in);
        double resultado, num1, num2;
        System.out.println("PROGRAMA QUE DIVIDE DOS NUMEROS");
        System.out.println("**********************************************");
        System.out.println("Ingresa el primer valor (Dividiendo)");
        num1 = entrada.nextDouble();
        System.out.println("Ingresa el segundo valor (Divisor)");
        num2 = entrada.nextDouble();
        if(num2 == 0){
            System.out.println("Error nada puede ser divisible por cero ):");
        }else {
            resultado = num1 /num2;
            System.out.println("El resultado de la division es: "+resultado);
        }
        System.out.println("************************************************");
        System.out.println("FIN DEL PROGRAMA.....");
    }
}
