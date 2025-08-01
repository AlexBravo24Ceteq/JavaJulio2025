package com.condicionales;

import java.util.Scanner;

public class Condicionales14_ASV {
    public static void main(String[] args) {
        /*
        14. Un obrero necesita calcular su salario semanal, el cual se obtiene
        de la siguiente manera:
        Si trabaja 40 horas o menos se le paga $16 por hora.
        Si trabaja más de 40 horas se le paga $16 por cada una de las primeras
        40 horas y $20 por cada hora extra.
         */
        Scanner entrada = new Scanner(System.in);
        int horasTrabajo, salario, salarioExtra, HoraXtra, horasXtra, sueldoTotal;

        System.out.println("Ingrese las Horas trabajadas: ");
        horasTrabajo = entrada.nextInt();

        if(horasTrabajo <= 40){
            salario = horasTrabajo * 16;
            sueldoTotal = salario;

        }
        else {
            salario = 40 * 16;
            horasXtra = horasTrabajo - 40;
            salarioExtra = horasXtra * 20;
            sueldoTotal = salario + salarioExtra;
        }

        System.out.println("Su sueldo final es de: $"+ sueldoTotal);

    }
}
