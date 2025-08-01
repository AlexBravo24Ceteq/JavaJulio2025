package com.ciclos;

import java.util.Scanner;

public class Ciclos12_ASV {
    public static void main(String[] args) {
        /*
        12.Se ingresan un conjunto de n edades de personas por teclado.
        El programa finalizara cuando el promedio de las edades sea superior a 25.
         */

        Scanner entrada = new Scanner(System.in);
        int edad, promedio, sumatoria = 0, contador = 0;

        do{
            System.out.println("Ingrese su edad: ");
            edad = entrada.nextInt();
            sumatoria = sumatoria + edad;
            contador++;
            promedio = sumatoria/contador;
            System.out.println("El promedio calculado es de: "+promedio);

        }while (promedio <= 25);
    }
}
