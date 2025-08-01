package com.condicionales;

import java.util.Scanner;

public class Condicionales12_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
           [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
         */
        System.out.println("==============================");
        System.out.println("=========MASA CORPORAL========");
        System.out.println("=============(IMC)============");

        float peso, altura, IMC;
        String resultado = "";
        System.out.println("Ingresa tu peso (kg)");
        peso = entrada.nextFloat();
        System.out.println("Ingresa tu altura (m)");
        altura = entrada.nextFloat();

        IMC = (float) peso/(altura*altura);
        if (IMC < 16)
            resultado = "Criterio de ingreso en hospital";
        else if (IMC >= 16 && IMC < 17)
            resultado = "infrapeso";
        else if (IMC >= 17 && IMC < 18)
            resultado = "bajo peso";
        else if (IMC >= 18 && IMC < 25)
            resultado = "peso normal (saludable)";
        else if (IMC >= 25 && IMC < 30)
            resultado = "sobrepeso (obesidad de grado I)";
        else if (IMC >= 30 && IMC < 35)
            resultado = "sobrepeso crónico (obesidad de grado II)";
        else if (IMC >= 35 && IMC <= 40)
            resultado = "obesidad premórbida (obesidad de grado III)";
        else if (IMC > 40)
            resultado = "obesidad mórbida (obesidad de grado IV)";

        System.out.println("Tu indice de masa corporal es " + resultado);

        System.out.println("============FIN============");
    }
}
