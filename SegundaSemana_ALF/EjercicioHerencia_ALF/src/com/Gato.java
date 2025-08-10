package com;

public class Gato extends Animal{

    private String limpieza;
    private String caza;
    private String inteligencia;

    public Gato() {
    }

    public Gato(String nombre, int edad, String raza, String limpieza, String caza, String inteligencia) {
        super(nombre, edad, raza);
        this.limpieza = limpieza;
        this.caza = caza;
        this.inteligencia = inteligencia;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }

    public String getCaza() {
        return caza;
    }

    public void setCaza(String caza) {
        this.caza = caza;
    }

    public String getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(String inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "limpieza='" + limpieza + '\'' +
                ", caza='" + caza + '\'' +
                ", inteligencia='" + inteligencia + '\'' +
                "} " + super.toString();
    }
}
