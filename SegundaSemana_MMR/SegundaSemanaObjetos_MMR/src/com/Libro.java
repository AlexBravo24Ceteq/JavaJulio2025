package com;

public class Libro {
    private String nombre;
    private String autor;
    private float costo;
    private String editorial;

    public Libro(){

    }

    public Libro(String nombre, String autor, float costo, String editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.costo = costo;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", costo=" + costo +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
