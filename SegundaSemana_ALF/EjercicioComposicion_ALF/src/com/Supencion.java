package com;

public class Supencion {
    private String nombre;
    private int tiempoDurabilidad;
    private String comodidad;

    public Supencion() {
    }

    public Supencion(String nombre, int tiempoDurabilidad, String comodidad) {
        this.nombre = nombre;
        this.tiempoDurabilidad = tiempoDurabilidad;
        this.comodidad = comodidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoDurabilidad() {
        return tiempoDurabilidad;
    }

    public void setTiempoDurabilidad(int tiempoDurabilidad) {
        this.tiempoDurabilidad = tiempoDurabilidad;
    }

    public String getComodidad() {
        return comodidad;
    }

    public void setComodidad(String comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Supencion{" +
                "nombre='" + nombre + '\'' +
                ", tiempoDurabilidad=" + tiempoDurabilidad +
                ", comodidad='" + comodidad + '\'' +
                '}';
    }
}
