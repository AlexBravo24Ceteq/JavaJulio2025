package com;

public abstract class Calculadora implements IOperadores{
    private String marca;
    private String color;
    private String tamanio;

    public Calculadora() {
    }

    public Calculadora(String marca, String color, String tamanio) {
        this.marca = marca;
        this.color = color;
        this.tamanio = tamanio;
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

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }


    @Override
    public void suma(double a, double b) {
        System.out.println(a+b);

    }

    @Override
    public void resta(double a, double b) {
        System.out.println(a-b);

    }

    @Override
    public void multiplicacion(double a, double b) {
        System.out.println(a*b);

    }

    @Override
    public void division(double a, double b) {
        System.out.println(a/b);

    }

    public abstract void raizCuadrada(double a);

    public abstract void elevarExponente(double a, double exponente);


}
