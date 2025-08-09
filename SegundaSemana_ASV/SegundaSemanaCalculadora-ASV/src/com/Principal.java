package com;

public class Principal {
    public static void main(String[] args) {

        Cientifica calcCienti = new Cientifica();
        Cientifica cientifica2 = new Cientifica();
        calcCienti.suma(6, 23);

        calcCienti.elevarExponente(4, 4);

        cientifica2.suma(4, 8, 2);

        cientifica2.raizCuadrada(4);

    }
}
