package com;

public class Cientifica extends Calculadora {

    public Cientifica() {
    }

    @Override
    public void raizCuadrada(double a) {
        System.out.println("Raiz de "+ a + " Cuadrada: "+ Math.sqrt(a));

    }

    @Override
    public void elevarExponente(double a, double exponente) {
        System.out.println("Obtener el exponente de " + a +" con exponente " + exponente+" ,Que es: " + Math.pow(a, exponente));

    }


    public void suma(double a, double b, double c) {
        System.out.println("Suma de Tres Variables: "+a+", "+b+", "+c+"," + "Resultado:" + (a*b*c));

    }


    public void resta(double a, double b, double c) {
        System.out.println("Resta de Tres Variables: "+ (a-b-c));

    }

    //@Override
    public void multiplicacion(double a, double b, double c) {
        System.out.println("Multiplicacion de Tres Variables: "+ (a*b*c));

    }

    //@Override
    public void division(double a, double b, double c) {
        System.out.println("Division de Tres Variables: "+ (a/b/c));

    }


}
