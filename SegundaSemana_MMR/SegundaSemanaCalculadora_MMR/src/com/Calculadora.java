package com;

public abstract class Calculadora implements IOperaciones{
    private String marca;
    private String color;
    private String tipo;

    public Calculadora(){}

    public Calculadora(String marca, String color, String tipo) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public double sumar(double a, double b) {
        return (a+b);
    }

    @Override
    public double restar(double a, double b) {
        return (a-b);
    }

    @Override
    public double multiplicar(double a, double b) {
        return (a*b);
    }

    @Override
    public double dividir(double a, double b) {
        return (a/b);
    }

    public abstract double raizCuadrada(double a);
    public abstract double exponente(double a, double b);
}
