package com;

public class Almacenamiento {
    private  String marca;
    private String tipo;
    private double capasidad;

    public Almacenamiento() {
    }

    public Almacenamiento(String marca, String tipo, double capasidad) {
        this.marca = marca;
        this.tipo = tipo;
        this.capasidad = capasidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapasidad() {
        return capasidad;
    }

    public void setCapasidad(double capasidad) {
        this.capasidad = capasidad;
    }

    @Override
    public String toString() {
        return "Almacenamiento{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", capasidad=" + capasidad +
                '}';
    }
}
