package com;

public class Mascota extends Animal {
    private String nombre;
    private String dueño;
    private boolean vacunado;

    public Mascota(){}

    public Mascota(String especie, int edad, String tipo, String nombre, String dueño, boolean vacunado) {
        super(especie, edad, tipo);
        this.nombre = nombre;
        this.dueño = dueño;
        this.vacunado = vacunado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", dueño='" + dueño + '\'' +
                ", vacunado=" + vacunado +
                "} " + super.toString();
    }
}
