package com;

public class Materia {

    private String nombre;
    private int creditos;
    private int numeroAula;

    public Materia() {
    }

    public Materia(String nombre, int creditos, int numeroAula) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.numeroAula = numeroAula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                ", numeroAula=" + numeroAula +
                '}';
    }
}
