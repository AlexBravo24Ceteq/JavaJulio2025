package com;

public class Procesador {
    private String marca;
    private String modelo;
    private double frecuencia;
    //Podemos crar atributos o metodos de clase, agregando la
    //palabra reservada static. El cual podria ser
    //clasificado como una constante de clase, pero
    //que aun puede ser modificado. Es Decir, el valor de
    //los nucleos sera igual para todos los procesadores que se
    //vayan a crear de esta clase

    //Si queremos que un valor sea inmutable, es decir,
    //que no cambie, agregamos la palabra final
    private static final int nucleos = 8;

    public Procesador() {
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

    /*
    public static void setNucleos(int nucleos) {
        Procesador.nucleos = nucleos;
    }

     */

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
