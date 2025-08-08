package com;

public class Carne {

    private String tipo;
    private String corte;
    private int kilos;
    private double precio;

    public Carne(String tipo, String corte, int kilos, double precio) {
        this.tipo = tipo;
        this.corte = corte;
        this.kilos = kilos;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
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
        return "Carne{" +
                "tipo='" + tipo + '\'' +
                ", corte='" + corte + '\'' +
                ", kilos=" + kilos +
                ", precio=" + precio +
                '}';
    }
}
