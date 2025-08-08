package com;

public class Camiseta {

    private String tipoTela;
    private int ancho;
    private int largo;
    private String talla;
    private double precio;

    public Camiseta(){}

    public Camiseta(String tipoTela, int ancho, int largo, String talla, double precio) {
        this.tipoTela = tipoTela;
        this.ancho = ancho;
        this.largo = largo;
        this.talla = talla;
        this.precio = precio;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Camiseta{" +
                "tipoTela='" + tipoTela + '\'' +
                ", ancho=" + ancho +
                ", largo=" + largo +
                ", talla='" + talla + '\'' +
                ", precio=" + precio +
                '}';
    }
}
