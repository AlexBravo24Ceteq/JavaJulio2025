package com;

public abstract class Calculadora implements IOperaciones{

    private String tamaño = "Mediana";
    private double costo = 200;
    private String energía = "Solar";

    public Calculadora(double costo, String energía, String tamaño) {
        this.costo = costo;
        this.energía = energía;
        this.tamaño = tamaño;
    }

    public Calculadora() {}

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEnergía() {
        return energía;
    }

    public void setEnergía(String energía) {
        this.energía = energía;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "costo=" + costo +
                ", tamaño='" + tamaño + '\'' +
                ", energía='" + energía + '\'' +
                '}';
    }

    public abstract double RAIZ(double a);
    public abstract double EXPO(double a, double b);


    @Override
    public double SUMAR(double a, double b) {
        return a + b;
    }

    @Override
    public double RESTA(double a, double b) {
        return a - b;
    }

    @Override
    public double DIVIDIR(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return a / b;
    }

    @Override
    public double MULTIPLICAR(double a, double b) {
        return a * b;
    }

}