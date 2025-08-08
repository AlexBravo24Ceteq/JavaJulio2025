package com;

public class Libreria {
    private String nombre;
    private int antiguedad;

    private Encargado encargado;
    private Ubicacion direccion;
    private Edificio edicio;

    public Libreria(){}

    public Libreria(String nombre, int antiguedad, Encargado encargado, Ubicacion direccion, Edificio edicio) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.encargado = encargado;
        this.direccion = direccion;
        this.edicio = edicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

    public Ubicacion getDireccion() {
        return direccion;
    }

    public void setDireccion(Ubicacion direccion) {
        this.direccion = direccion;
    }

    public Edificio getEdicio() {
        return edicio;
    }

    public void setEdicio(Edificio edicio) {
        this.edicio = edicio;
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "nombre='" + nombre + '\'' +
                ", antiguedad=" + antiguedad +
                ", \n encargado=" + encargado +
                ", \n direccion=" + direccion +
                ", \n edicio=" + edicio +
                '}';
    }
}
