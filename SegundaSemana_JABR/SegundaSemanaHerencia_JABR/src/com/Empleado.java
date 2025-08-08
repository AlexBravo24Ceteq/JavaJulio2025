package com;

//Esta clase va a heredar los atributos y métodos de la clase
//Persona y la HERENCIA se realiza con la palabra extends
public class Empleado extends Persona implements IPiloto{

    //Aqui podemos declarar los atributos que sean propios
    //de un Empleado, pero los de persona también ya se estan
    //sumando a esta clase
    private String rfc;
    private double salario;
    private String turno;

    public Empleado(){}

    //Al generar el constructor con todos los parametros
    //debemos fijarnos en elegir el constructor completo de la clase padre
    //(Persona) para que se sume al constructor de la clase hija (Empleado)
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

    //Las clases hijas que hereden de Persona deben definir a su manera
    //COMO SE REALIZARA ESTA ACCION
    @Override
    public void checarEntrada() {
        System.out.println("Checando entrada turno matutino");
    }

    //Este es un método que proviene e la interface IPiloto
    @Override
    public void volar() {
        System.out.println("Aprendí a volar...");
    }
}
