package com;

public class Procesador {
    private String marca;
    private String modelo;
    private double frecuencia;
    //podemos crear atributos o metodos de clase, agregando la plabra reservada
    //Static- el cual podria ser clasificado como una constante, pero aun puede ser
    //modificado- es decir el valor de los nucleos sera iguales a todos los procesadores
    //para todos los procesadores que se vallan a crear de esta clase
    //Con final ya no se puede ni modificar por medio de los setters
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
