package com;

public class Bebidas {

    private String tipo;
    private String marca;
    private String tamaño;
    private double precio;

    public Bebidas(String tipo, String marca, String tamaño, double precio) {
        this.tipo = tipo;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bebidas{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", precio=" + precio +
                '}';
    }
}
