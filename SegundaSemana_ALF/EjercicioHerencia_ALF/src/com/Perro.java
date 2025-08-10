package com;

public class Perro extends Animal{
    private boolean jugeton;
    private boolean protector;
    private boolean inteligencia;

    public Perro() {
    }

    public Perro(String nombre, int edad, String raza, boolean jugeton, boolean protector, boolean inteligencia) {
        super(nombre, edad, raza);
        this.jugeton = jugeton;
        this.protector = protector;
        this.inteligencia = inteligencia;
    }

    public boolean isJugeton() {
        return jugeton;
    }

    public void setJugeton(boolean jugeton) {
        this.jugeton = jugeton;
    }

    public boolean isProtector() {
        return protector;
    }

    public void setProtector(boolean protector) {
        this.protector = protector;
    }

    public boolean isInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(boolean inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "jugeton=" + jugeton +
                ", protector=" + protector +
                ", inteligencia=" + inteligencia +
                "} " + super.toString();
    }
}
