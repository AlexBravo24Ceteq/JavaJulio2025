package com;

import java.util.Scanner;

public class Cientifica extends Calculadora{

    public Cientifica() {
    }

    public Cientifica(String marca, String color, String fuenteEnergia) {
        super(marca, color, fuenteEnergia);
    }

    @Override
    public String toString() {
        return "Cientifica{} " + super.toString();
    }

    public void  sumar(double a, double b) {
        System.out.println(a+b);
        System.out.println();
        System.out.println("*******************************************************************************");
    }

    public void restar(double a, double b) {
        System.out.println(a-b);
        System.out.println();
        System.out.println("*******************************************************************************");

    }

    public void multiplicar(double a, double b) {
        System.out.println(a*b);
        System.out.println();
        System.out.println("*******************************************************************************");
    }

    public void dividir(double a, double b) {
        System.out.println(a/b);
        System.out.println();
        System.out.println("*******************************************************************************");

    }


    @Override
    public void raizCuadrada() {
        Scanner entrada = new Scanner(System.in);
        double raiz, valor;
        System.out.println("Ingresa el numero para sacar su raiz");
        valor = entrada.nextDouble();
        raiz = Math.sqrt(valor);
        System.out.println("La raiz cuadrada de: "+valor+ " es igual a: "+raiz);
        System.out.println();
        System.out.println("*******************************************************************************");

    }

    @Override
    public void elevarExponente() {
        Scanner entrada = new Scanner(System.in);
        int  valor1,valor2;
        double exponente;
        System.out.println("Ingresa el numero que quieres exponensiar");
        valor1 = entrada.nextInt();
        System.out.println("Ingresa el numero al que lo quieres elevar");
        valor2 = entrada.nextInt();
        exponente = Math.pow(valor1, valor2);
        //System.out.println("El numero :" +valor1 + " elevado a: "+valor2+ " es igual a : "+ exponente);
        //System.out.println(exponente);
        System.out.println("("+valor1+")"+valor2+"="+exponente);
        System.out.println();
        System.out.println("*******************************************************************************");
    }

}
