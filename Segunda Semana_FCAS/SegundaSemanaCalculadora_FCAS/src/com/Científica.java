package com;

public class Científica extends Calculadora {

    public double Sum3N (double a, double b, double c){
        return a+b+c;
    }
    public double Res3N (double a, double b, double c){
        return a-b-c;
    }
    public double Div3N(double a, double b, double c){
        if (b == 0 || c == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;}
        return a / b / c;
    }
    public double Mulp3N (double a, double b, double c){
        return a*b*c;
    }



    public Científica(double costo, String energía, String tamaño) {
        super(costo, energía, tamaño);
    }

    public Científica() {
        super();
    }

    @Override
    public double RAIZ(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double EXPO(double a, double b) {
        return Math.pow (a,b);
    }
}
