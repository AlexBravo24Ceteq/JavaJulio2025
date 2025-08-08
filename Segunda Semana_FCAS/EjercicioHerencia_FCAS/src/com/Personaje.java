package com;

public class Personaje {

    private String nombre;
    private int nivel;
    private int vida;
    private String género;

    public Personaje(String nombre, int nivel, int vida, String género) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.género = género;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    @Override
    public String toString() {
        return "Personaje {" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", vida=" + vida +
                ", género='" + género + '\'';
    }
}
