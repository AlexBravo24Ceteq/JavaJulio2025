package com;

public class Procesador {

    private String marca;
    private String modelo;
    private double frecuencia;

    //Podemos crear atributos o metodos de clase agregando palabras reservadas como static.
    //Podría ser clasificado como una constante de clase, pero que aun puede ser modificado.
    //Es decir el valor de los nucleos será igual para todos los procesadores que se
    //creen en esta clase.

    //Si queremos que un valor sea inmutable o no cambie, ocupamos final

    private static final int nucleos = 8;

    public Procesador(){

    }

    public Procesador(String marca, String modelo, double frecuencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frecuencia = frecuencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public static int getNucleos() {
        return nucleos;
    }


    @Override
    public String toString() {
        return "Procesador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frecuencia=" + frecuencia +
                ", nucleos=" + nucleos +
                '}';
    }


}