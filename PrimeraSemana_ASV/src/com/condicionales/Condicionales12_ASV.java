package com.condicionales;

import java.util.Scanner;

public class Condicionales12_ASV {

    public static void main(String[] args) {

        /*
        12.Construir un programa que calcule el índice de masa corporal de una persona
        (IMC = peso [kg] / altura2[m]) e indique el estado en el que se encuentra
        esa persona en función del valor de IMC:
        Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos
        (peso y altura) deben ser introducidos por teclado por el usuario.

         */
        Scanner entrada = new Scanner(System.in);

        double altura, peso, masaCorporal;

        System.out.println("Ingrese su Altura: ");
        altura = entrada.nextDouble();
        System.out.println("Ingrese su peso: ");
        peso = entrada.nextDouble();

        masaCorporal = peso/altura;

        System.out.printf("Su indice de masa Corporal es: %.2f%n", masaCorporal);

        if(masaCorporal < 16){
            System.out.println("Criterio de Ingreso a Hospital");
        }
        else if (masaCorporal >= 16 && masaCorporal < 17) {
            System.out.println("Infrapeso");
            
        }

        else if (masaCorporal >= 17 && masaCorporal < 18) {
            System.out.println("bajo peso");

        }


        else if (masaCorporal >= 18 && masaCorporal < 25) {
            System.out.println("Peso Normal");

        }

        else if (masaCorporal >= 25 && masaCorporal < 30) {
            System.out.println("Sobrepeso (Obesidad Grado I)");

        }

        else if (masaCorporal >= 30 && masaCorporal < 35) {
            System.out.println("Sobrepeso cronico (Obesidad Grado II)");

        }

        else if (masaCorporal >= 35 && masaCorporal < 40) {
            System.out.println("Obesidad premorbida (Obesidad Grado III)");

        }

        else{
            System.out.println("Obesidad morbida (Obesidad Grado IV)");

        }




    }



}
