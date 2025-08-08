package com;

public class Lacteos {

    private String tipo;
    private String marca;
    private String origen;
    private double precio;

    public Lacteos(String tipo, String marca, String origen, double precio) {
        this.tipo = tipo;
        this.marca = marca;
        this.origen = origen;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Lacteos{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", origen='" + origen + '\'' +
                ", precio=" + precio +
                '}';
    }
}
