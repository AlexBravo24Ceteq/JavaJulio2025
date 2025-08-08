package com;

public class Procesador {
    private String marca;
    private String modelo;
    private double frecuencia;
    /*podemos crear atributos o metodos de clase, agregando la palabra
    reservada static el cual podria ser clasificado como constante de clase, pero que
    aun puede ser modificado. Es decir, el valor de los nucleos sera igual para
    todos los procesadores que vayan a crear esta clase.

    Si queremos que el valor sea inmutable(que no cambie) - final
     */
    private static final int nucleos = 8;

    public Procesador(){}

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
