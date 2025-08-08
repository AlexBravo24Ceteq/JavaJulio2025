package com;

public class Libretas {

    private String tamaño;
    private int hojas;
    private int Nlibretas;
    private String marca;
    private String margen;


    public Libretas(){

    }

    public Libretas(String tamaño, int hojas, int nlibretas, String marca, String margen) {
        this.tamaño = tamaño;
        this.hojas = hojas;
        Nlibretas = nlibretas;
        this.marca = marca;
        this.margen = margen;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getHojas() {
        return hojas;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    public int getNlibretas() {
        return Nlibretas;
    }

    public void setNlibretas(int nlibretas) {
        Nlibretas = nlibretas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMargen() {
        return margen;
    }

    public void setMargen(String margen) {
        this.margen = margen;
    }

    @Override
    public String toString() {
        return "Libretas{" +
                "tamaño='" + tamaño + '\'' +
                ", hojas=" + hojas +
                ", Nlibretas=" + Nlibretas +
                ", marca='" + marca + '\'' +
                ", margen='" + margen + '\'' +
                '}';
    }
}
