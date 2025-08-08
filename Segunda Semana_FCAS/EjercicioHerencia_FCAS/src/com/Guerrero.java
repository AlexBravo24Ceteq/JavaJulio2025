package com;

public class Guerrero extends Personaje {

    private int armadura;
    private int daño;
    private double regeneración;

    public Guerrero(String nombre, int nivel, int vida, String género, int armadura, int daño, double regeneración) {
        super(nombre, nivel, vida, género);
        this.armadura = armadura;
        this.daño = daño;
        this.regeneración = regeneración;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public double getRegeneración() {
        return regeneración;
    }

    public void setRegeneración(double regeneración) {
        this.regeneración = regeneración;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Clase: Guerrero, " +
                "armadura=" + armadura +
                ", daño=" + daño +
                ", regeneración= %" + regeneración +
                '}';
    }
}
