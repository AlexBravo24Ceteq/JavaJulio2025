package com.condicionales;

import java.util.Scanner;

public class Condicionales14_ALF {
    public static void main(String[] args) {

        /*14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
        horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
        primeras 40 horas y $20 por cada hora extra.*/
        System.out.println("PROGRAMA QUE CALCULA EL SALARIO SEMANAL");
        System.out.println("******************************************");
        Scanner entrada = new Scanner(System.in);
        int horas, horaXtra;
        double salario, salarioXtra, sueldoTotal, suma,horas_aux;
        System.out.println("Ingrese las horas trabajadas en la semana");
        horas = entrada.nextInt();
        if(horas<=40){
            salario = horas * 16;
            System.out.println("Trabajaste "+horas+ " horas");
            System.out.println("Tu paga es de $16 x hora por lo tanto ganas: "+ salario);
        } else if (horas >=41) {
            System.out.println("Trabajaste mas de 40 hrx ");
            salario = 40 * 16;
            horas_aux = horas - 40;
            salarioXtra = horas_aux * 20;
            sueldoTotal = salario + salarioXtra;
            System.out.println("Tu sueldo por las primeras 40 hrs es: "+ salario);;
            System.out.println("Tu sueldo por tus "+horas_aux+ " horas extra es: "+ salarioXtra);
            System.out.println("TU SUELDO TOTAL ES DE: "+sueldoTotal);

        }
        System.out.println("FIN DEL PROGAMA");

    }
}
