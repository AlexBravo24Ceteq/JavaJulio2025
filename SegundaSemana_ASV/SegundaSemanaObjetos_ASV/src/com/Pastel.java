package com;

public class Pastel {
    private String ingredientes;
    private int precio;
    private int numRebanadas;


    public Pastel() {
    }

    public Pastel(String ingredientes, int precio, int numRebanadas) {
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.numRebanadas = numRebanadas;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumRebanadas() {
        return numRebanadas;
    }

    public void setNumRebanadas(int numRebanadas) {
        this.numRebanadas = numRebanadas;
    }

    @Override
    public String toString() {
        return "Pastel{" +
                "ingredientes='" + ingredientes + '\'' +
                ", precio=" + precio +
                ", numRebanadas=" + numRebanadas +
                '}';
    }
}


