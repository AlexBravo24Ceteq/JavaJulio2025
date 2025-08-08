package com;

public class Animal {
    private String especie;
    private int edad;
    private String tipo;

    public Animal(){}

    public Animal(String especie, int edad, String tipo) {
        this.especie = especie;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", edad=" + edad +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
