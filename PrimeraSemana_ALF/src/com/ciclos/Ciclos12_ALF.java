package com.ciclos;

import java.util.Scanner;

public class Ciclos12_ALF {
    public static void main(String[] args) {
        /*12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
        cuando el promedio de las edades sea superior a 25.*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("EJERCICIO 12.");
        System.out.println("*****************************************");
        int edad, sumatoria=0, promedio,sumatoriaIndice=0;

       do {
           System.out.println("Ingrese su edad: ");
           edad = entrada.nextInt();
           sumatoria = sumatoria + edad;
           sumatoriaIndice++;
           promedio = sumatoria/sumatoriaIndice;
           System.out.println("El promedio actula es: "+ promedio);

       }while (promedio<=25);
        System.out.println("FIN DEL PROGRAMA");
    }
}
