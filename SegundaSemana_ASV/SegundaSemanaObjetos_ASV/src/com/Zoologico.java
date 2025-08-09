package com;

public class Zoologico {
    private double precioEntrada;
    private String animales;
    private String horaApertura;
    private String horacerrar;
    private String tiposcomida;
    private int precioestacionamiento;


    public Zoologico() {
    }

    public Zoologico(double precioEntrada, String animales, String horaApertura, String horacerrar, String tiposcomida, int precioestacionamiento) {
        this.precioEntrada = precioEntrada;
        this.animales = animales;
        this.horaApertura = horaApertura;
        this.horacerrar = horacerrar;
        this.tiposcomida = tiposcomida;
        this.precioestacionamiento = precioestacionamiento;
    }


    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String getAnimales() {
        return animales;
    }

    public void setAnimales(String animales) {
        this.animales = animales;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoracerrar() {
        return horacerrar;
    }

    public void setHoracerrar(String horacerrar) {
        this.horacerrar = horacerrar;
    }

    public String getTiposcomida() {
        return tiposcomida;
    }

    public void setTiposcomida(String tiposcomida) {
        this.tiposcomida = tiposcomida;
    }

    public int getPrecioestacionamiento() {
        return precioestacionamiento;
    }

    public void setPrecioestacionamiento(int precioestacionamiento) {
        this.precioestacionamiento = precioestacionamiento;
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "precioEntrada=" + precioEntrada +
                ", animales='" + animales + '\'' +
                ", horaApertura='" + horaApertura + '\'' +
                ", horacerrar='" + horacerrar + '\'' +
                ", tiposcomida='" + tiposcomida + '\'' +
                ", precioestacionamiento=" + precioestacionamiento +
                '}';
    }
}
