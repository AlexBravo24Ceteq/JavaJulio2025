package com;

public class Persona {
    //ABSTRACCION - pilar de la POO
    //Que consiste en definir atributos
    //y metodos que tendra un objeto

    //¿Que atributos tiene una persona?
    //nombre, edad, nacionalidad, sexo
    //ENCAPSULACION - Pilar de la POO
    //Define el nivel de acceso a metodos o
    //atributos de nuestro objeto. En el caso de
    //atributos, casi siempre se utiliza del mas
    //restrictivo (private)
    //Los modifivadores de acceso son los siguientes:
    //private, protected, public, default

    private String nombre;
    private int edad;
    private String nacionalidad;
    private String sexo;

    //METODOS CONSTRUCTORES
    //Son metodos que me permitiran
    //crear un objeto con sus atributos
    //iniciados o no

    //METODO CONSTRUCTOR VACIO - Me permite
    //crear o iniciar un objeto, sin necesidad
    //de asignarle un valor a sus atributos

    public Persona (){

    }

    //METODO CONSTRUCTOR CON TODOS LOS PARAMETROS
    //Me permite crear un objeto pero ya con sus
    //atributos iniciados


    public Persona(String nombre, int edad, String nacionalidad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }

    //Puedo generar un metodo constructor solo con los parametros necesarios
    //Ej. Poder crear una Persona solo con nombre, con nombre y edad, con nombre y genero
    //etc, etc, etc


    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    //METODOS GETTERS Y METODOS SETTERS
    //METODOS GET NOS VAN A DEVOLVER EL VALOR ASIGNADO
    //EN UN ATRIBUTO
    //METODOS SET NOS VAN A PERMITIR ESTABLECER UN VALOR EN
    //UN ATRIBUTO O ACTUALIZADO


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

    //Metodo toString()
    //convierte en cadena de texto la informacion de los atributos y verlo
    //en consola
    //como si de una radiografia se tratase


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
