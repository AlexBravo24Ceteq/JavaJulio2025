package com;

public class Motor {

    private String nombre;
    private int cilindrada;
    private int turbo;

    public Motor() {
    }

    public Motor(String nombre, int cilindrada, int turbo) {
        this.nombre = nombre;
        this.cilindrada = cilindrada;
        this.turbo = turbo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getTurbo() {
        return turbo;
    }

    public void setTurbo(int turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "nombre='" + nombre + '\'' +
                ", cilindrada=" + cilindrada +
                ", turbo=" + turbo +
                '}';
    }
}
