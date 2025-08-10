package com;

public class Llantas {
    private String nombre;
    private String tipo;
    private int durabilidad;

    public Llantas() {
    }

    public Llantas(String nombre, String tipo, int durabilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.durabilidad = durabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    @Override
    public String toString() {
        return "Llantas{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", durabilidad=" + durabilidad +
                '}';
    }
}
