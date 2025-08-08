package com;

public class Pastel {
    private String sabor;
    private float peso;
    private float costo;
    private String color;
    private boolean decorado;

    public Pastel(){

    }

    public Pastel(String sabor, float peso, float costo, String color, boolean decorado) {
        this.sabor = sabor;
        this.peso = peso;
        this.costo = costo;
        this.color = color;
        this.decorado = decorado;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getDecorado() {
        return decorado;
    }

    public void setDecorado(boolean decorado) {
        this.decorado = decorado;
    }

    @Override
    public String toString() {
        return "Pastel{" +
                "sabor='" + sabor + '\'' +
                ", peso=" + peso +
                ", costo=" + costo +
                ", color='" + color + '\'' +
                ", decorado=" + decorado +
                '}';
    }
}
