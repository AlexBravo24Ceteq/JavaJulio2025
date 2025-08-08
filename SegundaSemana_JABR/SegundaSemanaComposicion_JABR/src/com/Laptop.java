package com;

public class Laptop {

    //Nuestra Laptop va a poseer atributos propios
    private String marca;
    private String modelo;
    private String color;
    //y además contará con atributos que son objetos que forman
    //parte de ella
    private Almacenamiento disco;
    private Procesador cpu;
    private Ram memoria;
    private static int nucleos = 8;

    public Laptop(){}

    public Laptop(String marca, String modelo, String color, Almacenamiento disco, Procesador cpu, Ram memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.disco = disco;
        this.cpu = cpu;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Almacenamiento getDisco() {
        return disco;
    }

    public void setDisco(Almacenamiento disco) {
        this.disco = disco;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    public Ram getMemoria() {
        return memoria;
    }

    public void setMemoria(Ram memoria) {
        this.memoria = memoria;
    }

    public static int getNucleos() {
        return nucleos;
    }

    public static void setNucleos(int nucleos) {
        Laptop.nucleos = nucleos;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", disco=" + disco +
                ", cpu=" + cpu +
                ", memoria=" + memoria +
                ", nucleos=" + nucleos +
                '}';
    }
}
