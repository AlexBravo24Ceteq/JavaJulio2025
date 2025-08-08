package com.ciclos;

import java.util.Scanner;

public class Ciclos10_ASV {
    public static void main(String[] args) {
        /*
        10. Programa que lea 20 números e indique si son
        positivos o negativos y pares o impares y además muestre
        la sumatoria de los positivos y sumatoria de los impares.
         */
        Scanner entrada = new Scanner(System.in);
        int cantidadValores, valor, contador = 0;
        int sumaImpares = 0, sumaPositivos = 0;

        System.out.println("Ingrese la cantidad de Numeros a Ingresar");
        cantidadValores = entrada.nextInt();

        do{
            System.out.println("Ingrese un valor");
            valor = entrada.nextInt();

            if(valor>0){
                System.out.println("Valor Positivo");
                sumaPositivos = sumaPositivos + valor;
                
            }
            else if(valor < 0){
                System.out.println("Valor Negativo");
                
            }
            else{
                System.out.println("Es Cero");
            }


            if (valor%2 == 0) {
                System.out.println("Valor Par");
                
            }

            else {
                System.out.println("Valor ImPar");

            }


            contador++;
        } while (contador < cantidadValores);



    }
}
