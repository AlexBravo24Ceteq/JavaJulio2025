package com.condicionales;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Condicionales1_JABR {

    public static void main(String[] args) {
        /*
        1.Realiza un programa que reciba dos números por
        teclado e indique cuál es mayor o si son iguales.
         */

        System.out.println("=============================================");
        System.out.println("==PROGRAMA PARA EVALUAR CUAL NUMERO ES MAYOR=");
        System.out.println("============O SI SON IGUALES=================");

        //Para ingresar dos numeros por teclado necesitamos a la clase Scanner
        Scanner entrada = new Scanner(System.in);
        //Necesitamos dos variables donde guardar los numeros a comparar
        int numero1, numero2;

        //Mandamos un msj en consola para poder solicitar los numeros
        System.out.println("Introduce un primer numero");
        numero1 = entrada.nextInt();
        System.out.println("Introduce un segundo numero");
        numero2 = entrada.nextInt();

        //Evaluamos
        if (numero1>numero2){
            System.out.println("El PRIMER numero tecleado es MAYOR");
        }else if(numero2>numero1){
            System.out.println("El SEGUNDO numero tecleado es MAYOR");
        }else{
            System.out.println("Los numeros tecleados son IGUALES");
        }

        System.out.println("============FIN DEL PROGRAMA==================");


    }

}
