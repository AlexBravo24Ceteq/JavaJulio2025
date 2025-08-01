package com.ciclos;

import java.util.Scanner;

public class Ciclos12_GDSA {
    public static void main(String[] args) {
        /*
        12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
        cuando el promedio de las edades sea superior a 25.
         */
        System.out.println("»»»»»»»»»»»»»» Ejercicio 12 ««««««««««««««««««««");

        Scanner input=new Scanner(System.in);
        int edad,contador=1;
        int promedio=0,suma=0;
        boolean bandera=true;
        while(bandera){
            System.out.print("Ingresa la edad Numero "+contador+": ");
            edad= input.nextInt();
            suma=suma+edad;
            contador++;
            promedio = suma/contador;
            if(promedio>=25){
                bandera=false;
            }

        }
        System.out.println("Se Finalizo por que alcanzo el promedio maximo de 25");
        System.out.println("Promedio: "+promedio);


        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
