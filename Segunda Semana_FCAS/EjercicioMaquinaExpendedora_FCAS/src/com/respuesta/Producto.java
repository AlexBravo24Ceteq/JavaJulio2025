package com.respuesta;

public class Producto {

    private String Nombre;
    private double costo;
    private int stock;

    public Producto(){}

    public Producto(String nombre, double costo, int stock) {
        Nombre = nombre;
        this.costo = costo;
        this.stock = stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Nombre='" + Nombre + '\'' +
                ", costo=" + costo +
                ", stock=" + stock +
                '}';
    }
}
