package com;

public class Restaurante {

    private String tipoComida;
    private int precioPlatillos;
    private int preciovaletParking;
    private boolean terraza;


    public Restaurante() {
    }

    public Restaurante(String tipoComida, int precioPlatillos, int preciovaletParking, boolean terraza) {
        this.tipoComida = tipoComida;
        this.precioPlatillos = precioPlatillos;
        this.preciovaletParking = preciovaletParking;
        this.terraza = terraza;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public int getPrecioPlatillos() {
        return precioPlatillos;
    }

    public void setPrecioPlatillos(int precioPlatillos) {
        this.precioPlatillos = precioPlatillos;
    }

    public int getPreciovaletParking() {
        return preciovaletParking;
    }

    public void setPreciovaletParking(int preciovaletParking) {
        this.preciovaletParking = preciovaletParking;
    }

    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }


    @Override
    public String toString() {
        return "Restaurante{" +
                "tipoComida='" + tipoComida + '\'' +
                ", precioPlatillos=" + precioPlatillos +
                ", preciovaletParking=" + preciovaletParking +
                ", terraza=" + terraza +
                '}';
    }
}
