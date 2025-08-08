package com;

public class Mascota {
    private String nombre;
    private int edad;
    private String animal;
    private String raza;

    public Mascota(){

    }

    public Mascota(String nombre, String animal, int edad, String raza) {
        this.nombre = nombre;
        this.animal = animal;
        this.edad = edad;
        this.raza = raza;
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

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", animal='" + animal + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
