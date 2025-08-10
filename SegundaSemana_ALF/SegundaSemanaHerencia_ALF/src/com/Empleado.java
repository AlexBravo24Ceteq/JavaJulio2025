package com;

//Esta clase heredara los atributos y metodos de la clase
//Persona y la herencia se realiza con la palabra extends
public class Empleado extends Persona implements IPiloto {

    //Aqui solo declaramos atributos propios de empleado y con extends
    //ya tiene la herencia de persona
    private  String rfc;
    private double salario;
    private String turno;

    public Empleado(){

    }
    //Se elige el constructor con todos los parametros
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
                "} " + super.toString();
    }

    //Las clases hijas deben definir a su manera como realizar esta accion es abstracta

    @Override
    public void checarEntrada() {
        System.out.println("Checando entrada de turno matutino");

    }
    //ESTE METODO PROBIENE DE LA INTERFACE IPILOTO
    @Override
    public void volar() {
        System.out.println("Aprendi a volar.....");
    }
}
