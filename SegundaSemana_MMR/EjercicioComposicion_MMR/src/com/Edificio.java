package com;

public class Edificio {
    private String color;
    private String material;
    private int pisos;

    public Edificio(){}

    public Edificio(String color, String material, int pisos) {
        this.color = color;
        this.material = material;
        this.pisos = pisos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", pisos=" + pisos +
                '}';
    }
}
