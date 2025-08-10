package com;

public class Automovil {
    //Atributos propios
    private String marca;
    private int modelo;
    private String color;
    //Atributos de otras clases
    private Motor motor;//objeto llamado Motor
    private Llantas llantas;
    private Tecnologia tecnologia;
    private Supencion suspencion;

    public Automovil() {
    }

    public Automovil(String marca, int modelo, String color, Motor motor, Llantas llantas, Tecnologia tecnologia, Supencion suspencion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.llantas = llantas;
        this.tecnologia = tecnologia;
        this.suspencion = suspencion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llantas getLlantas() {
        return llantas;
    }

    public void setLlantas(Llantas llantas) {
        this.llantas = llantas;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Supencion getSuspencion() {
        return suspencion;
    }

    public void setSuspencion(Supencion suspencion) {
        this.suspencion = suspencion;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", color='" + color + '\'' +
                ", \nmotor=" + motor +
                ", \nllantas=" + llantas +
                ", \ntecnologia=" + tecnologia +
                ", \nsuspencion=" + suspencion +
                '}';
    }
}
