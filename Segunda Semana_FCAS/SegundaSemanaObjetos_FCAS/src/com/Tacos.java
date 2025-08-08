package com;

public class Tacos {

    private String carne;
    private int cantidad;
    private String tortilla;
    private String vegetales;
    private String salsa;


    public Tacos() {

    }

    public Tacos(int cantidad, String carne, String tortilla, String salsa, String vegetales) {
        this.cantidad = cantidad;
        this.carne = carne;
        this.tortilla = tortilla;
        this.salsa = salsa;
        this.vegetales = vegetales;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getVegetales() {
        return vegetales;
    }

    public void setVegetales(String vegetales) {
        this.vegetales = vegetales;
    }

    public String getTortilla() {
        return tortilla;
    }

    public void setTortilla(String tortilla) {
        this.tortilla = tortilla;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    @Override
    public String toString() {
        return "Tacos{" +
                "carne='" + carne + '\'' +
                ", cantidad=" + cantidad +
                ", tortilla='" + tortilla + '\'' +
                ", vegetales='" + vegetales + '\'' +
                ", salsa='" + salsa + '\'' +
                '}';
    }


}
