package com;

public class Asesino extends Personaje {
    private int agilidad;
    private int precisión;
    private int percepción;

    public Asesino(String nombre, int nivel, int vida, String género, int agilidad, int precisión, int percepción) {
        super(nombre, nivel, vida, género);
        this.agilidad = agilidad;
        this.precisión = precisión;
        this.percepción = percepción;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getPrecisión() {
        return precisión;
    }

    public void setPrecisión(int precisión) {
        this.precisión = precisión;
    }

    public int getPercepción() {
        return percepción;
    }

    public void setPercepción(int percepción) {
        this.percepción = percepción;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Clase: Asesino, " +
                "agilidad=" + agilidad +
                ", precisión=" + precisión +
                ", percepción=" + percepción +
                '}';
    }
}
