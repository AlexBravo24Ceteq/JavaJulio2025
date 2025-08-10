package com;

import java.util.Scanner;

public  abstract class Calculadora implements IOperaciones{
    private String marca;
    private String color;
    private String fuenteEnergia;

    public Calculadora() {
    }

    public Calculadora(String marca, String color, String fuenteEnergia) {
        this.marca = marca;
        this.color = color;
        this.fuenteEnergia = fuenteEnergia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuenteEnergia() {
        return fuenteEnergia;
    }

    public void setFuenteEnergia(String fuenteEnergia) {
        this.fuenteEnergia = fuenteEnergia;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", fuenteEnergia='" + fuenteEnergia + '\'' +
                '}';
    }

    @Override
    public void sumar() {
        Scanner entrada = new Scanner(System.in);
        int suma;
        System.out.println("Ingresa el primer valor a sumar:");
        int valor1 = entrada.nextInt();
        System.out.println("Ingresa el segundo valor a sumar:");
        int valor2 = entrada.nextInt();
        suma = valor1 +valor2;
        System.out.println("La suma de los dos valores es: "+suma);
        System.out.println();
        System.out.println("*******************************************************************************");
    }

    @Override
    public void restar() {
        Scanner entrada = new Scanner(System.in);
        int resta;
        System.out.println("Ingresa el primer valor a restar:");
        int valor1 = entrada.nextInt();
        System.out.println("Ingresa el segundo valor a restar:");
        int valor2 = entrada.nextInt();
        resta = valor1 - valor2;
        System.out.println("La resta de los dos valores es: "+ resta);
        System.out.println();
        System.out.println("*******************************************************************************");

    }

    @Override
    public void multiplicar() {
        Scanner entrada = new Scanner(System.in);
        int multi;
        System.out.println("Ingresa el primer valor a multiplicar:");
        int valor1 = entrada.nextInt();
        System.out.println("Ingresa el segundo valor a multiplicar:");
        int valor2 = entrada.nextInt();
        multi = valor1 *valor2;
        System.out.println("La multiplicasion de los dos valores es: "+multi);
        System.out.println();
        System.out.println("*******************************************************************************");

    }

    @Override
    public void dividir() {
        Scanner entrada = new Scanner(System.in);
        int divi;
        System.out.println("Ingresa el primer valor a dividir:");
        int valor1 = entrada.nextInt();
        System.out.println("Ingresa el segundo valor a dividir:");
        int valor2 = entrada.nextInt();

        if(valor2 == 0){
            System.out.println("No se puede dividir entre cero....");
        }else {
            divi = valor1 / valor2;
            System.out.println("La division de los valores es: "+divi);
            System.out.println();
            System.out.println("*******************************************************************************");
        }
    }
    public abstract void raizCuadrada();//METODO ABSTRACTO

    public abstract void elevarExponente();// ABSTRACTO
}
