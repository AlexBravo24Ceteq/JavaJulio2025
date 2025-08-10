package com.modelo;

public class Producto {

    private String nombreProducto;
    private double precio;
    private int stock;
    private String caducidad;
    private String descripcion;

    public Producto() {
    }

    public Producto(String nombreProducto, double precio, int stock, String caducidad, String descripcion) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.caducidad = caducidad;
        this.descripcion = descripcion;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", caducidad='" + caducidad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
