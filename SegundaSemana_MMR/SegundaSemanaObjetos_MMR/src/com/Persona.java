package com;

public class Persona {
    /*ABSTRACCION - Pilar de la programacion orientada a objetos
    que consiste en definir atributos y metodos que tendra un objeto
     */
    //¿Que atributos tiene una persona? nombre, edad, nacionalidad
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String sexo;

    /* Metodos contructores
        metodos que me permiten crear un objeto con sus atributos
     */

    /* Metodos constructor vacio
        me permite crear o iniciar objeto sin asignarle valor a sus atributos
     */
    public Persona(){

    }

    /* Metodo constructor con todos los parametros iniciados
        Me permite crear un objeto pero ya con sus atributos iniciados
     */
    public Persona(String nombre, int edad, String nacionalidad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }

    //metodo constructor solo con los parametros necesarios
    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    //METODOS GETTERS Y SETTERS
    /* metodos get devuelven el valor asignado a un atributo
        metodos set permiten establecer un valor en un atributo o actualizarlo
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodo .toString()
    //Convierte a cadena la informacion de los atributos de un objeto
    //para recuperar la informacion y verla en consola

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
