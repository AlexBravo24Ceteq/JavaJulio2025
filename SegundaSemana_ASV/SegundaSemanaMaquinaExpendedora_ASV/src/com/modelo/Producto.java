package com.modelo;

public class Producto {

    private String nombreProducto;
    private double precioProducto;
    private int stockProducto;
    private String caducidadProducto;
    private String descripcionProducto;

    public Producto() {
    }

    public Producto(String nombreProducto, double precioProducto, int stockProducto, String caducidadProducto, String descripcionProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.caducidadProducto = caducidadProducto;
        this.descripcionProducto = descripcionProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getCaducidadProducto() {
        return caducidadProducto;
    }

    public void setCaducidadProducto(String caducidadProducto) {
        this.caducidadProducto = caducidadProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", stockProducto=" + stockProducto +
                ", caducidadProducto='" + caducidadProducto + '\'' +
                ", descripcionProducto='" + descripcionProducto + '\'' +
                '}';
    }
}
