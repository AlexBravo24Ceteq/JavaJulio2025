package com;

public class Fruta {

    private String fruta;
    private double kilos;
    private double precio;

    public Fruta(String fruta, double kilos, double precio) {
        this.fruta = fruta;
        this.kilos = kilos;
        this.precio = precio;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "fruta='" + fruta + '\'' +
                ", kilos=" + kilos +
                ", precio=" + precio +
                '}';
    }
}
