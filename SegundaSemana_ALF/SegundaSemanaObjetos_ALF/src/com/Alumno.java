package com;

public class Alumno {
    private String nombre;
    private String matricula;
    private int grado;

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public Alumno(String nombre, String matricula, int grado) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                ", grado=" + grado +
                '}';
    }
}
