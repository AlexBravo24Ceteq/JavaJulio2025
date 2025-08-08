package com;

public class Empleado extends Persona implements IPiloto{

    //El extends ayuda para traer información de otras

    private String rfc;
    private double salario;
    private String turno;

    public Empleado(){}

    public Empleado(String nombre, String genero, int edad, String rfc, double salario, String turno) {
        super(nombre, genero, edad);
        this.rfc = rfc;
        this.salario = salario;
        this.turno = turno;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "rfc='" + rfc + '\'' +
                ", salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
    //Las clase hija que hereden de Persona deben definir a su manera el
    //Cómo se realizará esta acción
    @Override
    public void checarEntrada() {
        System.out.println("Checando entrada turno matutino");
    }
    //Metodo que viene de interface IPiloto
    @Override
    public void volar() {
        System.out.println("Aprendió a volar...");}



}
