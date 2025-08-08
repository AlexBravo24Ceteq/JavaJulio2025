package com.condicionales;

import java.util.Scanner;

public class Condicionales5_ALF {
    public static void main(String[] args) {
        /*
        * 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
          parámetros: edad, nota y sexo.
        * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
        * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
        * Otros casos -> NO ACEPTADA*/

        Scanner entrada = new Scanner(System.in);
        int edad, nota;
        String sexo;
        System.out.println("PROGRAMA DE ACEPTACION");
        System.out.println("*********************************");
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        System.out.println("Ingrese la calificasion de su nota:");
        nota = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su sexo:");
        sexo = entrada.nextLine();

        if(edad>=18 && nota>=5){
            if(sexo.equalsIgnoreCase("femenino")){
                System.out.println("ES ACEPTADA :)");

            }
        }else if(edad>=18 || nota>=5 || sexo.equalsIgnoreCase("masculino")) {
            System.out.println("ES POSIBLE");

        }
        if (edad<=17 && nota<=4 ) {
            System.out.println("ES RECHAZADA ):");
        }
        System.out.println("FIN DEL PROGRAMA....");
    }
}
