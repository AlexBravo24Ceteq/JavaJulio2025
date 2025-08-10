package com;

public class Maestro {
    private String nombre;
    private int edad;
    private String materiaAsignada;
    private String turno;

    public Maestro() {
        //Constructor vacio
    }

    public Maestro(String nombre, int edad, String materiaAsignada, String turno) {
        this.nombre = nombre;
        this.edad = edad;
        this.materiaAsignada = materiaAsignada;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateriaAsignada() {
        return materiaAsignada;
    }

    public void setMateriaAsignada(String materiaAsignada) {
        this.materiaAsignada = materiaAsignada;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Maestro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", materiaAsignada='" + materiaAsignada + '\'' +
                ", turno='" + turno + '\'' +
                '}';
    }
}
