package com.condicionales;

import java.util.Scanner;

public class Condicionales12_GDSA {
    public static void main(String[] args) {
        /*
        12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
            [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC
         */
        System.out.println("///////////////////////////////////////////////");
        System.out.println("/ PROGRAMA PARA CALCULAR EL IMC ///////////////");
        System.out.println("///////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce tu peso en Kilogramos: ");
        double peso = input.nextDouble();
        System.out.print("Introduce tu altura en Metros: ");
        double altura = input.nextDouble();
        if (peso <= 0 || altura <= 0) {
            System.out.println("ERROR: El peso y la altura deben ser mayores que cero.");
        } else {
            double imc = peso / (altura * altura);
            System.out.print("Tu IMC es: "+imc+" ");
            if (imc < 16) {
                System.out.println("Diagnostico: Ingreso al Hospital");
            } else if (imc>=16&&imc<=17) {
                System.out.println("Diagnostico: Infra Peso");
            } else if (imc>=17&&imc<=18) {
                System.out.println("Diagnostico: Bajo Peso");
            }else if (imc>=18&&imc<=25) {
                System.out.println("Diagnostico: Peso Normal ( Saludable )");
            }else if (imc>=25&&imc<=30) {
                System.out.println("Diagnostico: Sobre Peso ( Obesidad de Grado I )");
            } else if (imc>=30&&imc<=35) {
                System.out.println("Diagnostico: Sobre Peso Cronico ( Obesidad de Grado II )");
            }else if (imc>=35&&imc<=40) {
                System.out.println("Diagnostico: Obesidad Premorbida ( Obesidad de Grado III )");
            }else if (imc>40) {
                System.out.println("Diagnostico: Obesidad Morbida ( Obesidad de Grado IV )");
            }

            System.out.println("///////////////FIN DEL PROGRAMA///////////////");
        }
    }
}
