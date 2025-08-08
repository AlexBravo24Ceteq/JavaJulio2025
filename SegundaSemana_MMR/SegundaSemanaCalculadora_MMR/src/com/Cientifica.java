package com;

public class Cientifica extends Calculadora {
    @Override
    public double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double exponente(double a, double b) {
        return Math.pow(a, b);
    }

    public double sumar(double a, double b, double c){
        return (a+b+c);
    }
    public double restar(double a, double b, double c){
        return (a-b-c);
    }
    public double multiplicar(double a, double b, double c){
        return (a*b*c);
    }
    public double dividir(double a, double b, double c){
        return ((a/b)/c);
    }
}
