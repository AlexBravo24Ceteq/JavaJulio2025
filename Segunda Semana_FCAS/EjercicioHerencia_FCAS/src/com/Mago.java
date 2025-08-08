package com;

public class Mago extends Personaje{
    private int maná;
    private int ap;
    private int sábiduría;

    public Mago(String nombre, int nivel, int vida, String género, int maná, int ap, int sábiduría) {
        super(nombre, nivel, vida, género);
        this.maná = maná;
        this.ap = ap;
        this.sábiduría = sábiduría;
    }

    public int getManá() {
        return maná;
    }

    public void setManá(int maná) {
        this.maná = maná;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getSábiduría() {
        return sábiduría;
    }

    public void setSábiduría(int sábiduría) {
        this.sábiduría = sábiduría;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Clase: Mago, " +
                "maná=" + maná +
                ", ap=" + ap +
                ", sábiduría=" + sábiduría +
                '}';
    }
}
