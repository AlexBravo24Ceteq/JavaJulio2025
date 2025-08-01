package com.condicionales;

import java.util.Scanner;

public class Condicionales14_GDSA {
    public static void main(String[] args) {
        /*
        14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
        horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
        primeras 40 horas y $20 por cada hora extra.
         */
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("/PROGRAMA PARA CALCULAR EL SALARIO DE UN OBRERO /");
        System.out.println("/////////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas en la semana: ");
        int horas = input.nextInt();
        int salario;
        if (horas <= 40) {
            salario = horas * 16;
        } else {
            int horasExtra = horas - 40;
            salario = (40 * 16) + (horasExtra * 20);
        }
        System.out.println("El salario semanal es: $" + salario);
        System.out.println("///////////////FIN DEL PROGRAMA///////////////");
    }
}
