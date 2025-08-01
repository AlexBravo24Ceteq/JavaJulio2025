package com.condicionales;

import java.util.Scanner;

public class Condicionales12_FCAS {
    public static void  main(String[] args) {

         /*
        12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / (altura[m]^2))
        e indique el estado en el que se encuentra esa persona en función del valor de IMC:
        Nota 1: se recomienda el empleo de sentencias if–else anidadas.
        Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
        */

        System.out.println("\uD835\uDCEC===============================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==INDICE DE MASA CORPORAL==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        double peso;
        double altura;

        System.out.println("Ingrese su peso en kg");
        peso = entrada.nextDouble();
        System.out.println("Ingrese su altura en metros");
        altura = entrada.nextDouble();

        double IMC = (peso/(altura * altura));

        if (IMC < 16) {
            System.out.println("IMC: " + IMC + "-->" + "Ingreso clínico urgente");
        }else if (IMC >= 16 && IMC <17) {
            System.out.println("IMC: " + IMC + "-->" + "Infrapeso");
        }else if (IMC >= 17 && IMC <18) {
            System.out.println("IMC: " + IMC + "-->" + "bajo peso");
        }else if (IMC >=18 && IMC <25) {
            System.out.println("IMC: " + IMC + "-->" + "peso normal o saludable");
        }else if (IMC >=25 && IMC <30) {
            System.out.println("IMC: " + IMC + "-->" + "sobrepeso, obesidad de grado I");
        }else if (IMC >=30 && IMC <35) {
            System.out.println("IMC: " + IMC + "-->" + "sobrepeso crónico, obesidad de grado II");
        }else if (IMC >=35 && IMC <40) {
            System.out.println("IMC: " + IMC + "-->" + "obesidad premórbida, obesidad de grado III");
        }else if (IMC > 40) {
            System.out.println("IMC: " + IMC + "-->" + "obesidad mórbida, obesidad de grado IV");
        }

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC==================================\uD835\uDCEC");
    }

}
