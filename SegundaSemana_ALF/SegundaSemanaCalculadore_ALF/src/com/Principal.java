package com;

public class Principal {
    public static void main(String[] args) {

        Cientifica cientifica = new Cientifica("CASIO","DORADO","PILAS DOBLE A");
        System.out.println(cientifica);
        cientifica.sumar(1,4); // suma con argumentos propios y me pide dos parametros de cientifica
        System.out.println("SIGUIENTE OPERACION............");
        cientifica.restar(5,4);
        System.out.println("SIGUIENTE OPERACION............");
        cientifica.sumar(); //este se hereda de la calse calculadora
        System.out.println("SIGUIENTE OPERACION............");
        cientifica.raizCuadrada();
        System.out.println("SIGUIENTE OPERACION............");
        cientifica.elevarExponente();

    }
}
