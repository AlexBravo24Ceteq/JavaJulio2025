package com;

/* Esta clase va a heredar los atributos y metodos de la clase
Persona y la HERENCIA se realiza con la palabra extends
 */
public class Empleado extends Persona implements IPiloto{
    /* Aqui podemos declarar los atributos propios de empleado,
    sin declarar lo de persona que ya lo contiene con la herencia   */

    private String rfc;
    private double salario;
    private String turno;

    public Empleado(){}
    /* al generar el constructor con todos los parametros
    debemos fijarnos en elegir el constructor completo de la clase padre (Persona)
    para que se sumen a la clase hija(EMPLEADO)
     */
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

    @Override
    public void checarEntrada() {
        System.out.println("Checando entrada");
    }

    //Metodo que proviene de la interface
    @Override
    public void volar() {
        System.out.println("Aprendí a volar...");
    }
}
