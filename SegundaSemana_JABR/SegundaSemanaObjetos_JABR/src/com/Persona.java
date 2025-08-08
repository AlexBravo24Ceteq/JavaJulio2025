package com;

public class Persona {

    //ABSTRACCION- Pilar de la POO
    //Que consiste en definir atributos y métodos que tendrá
    //un objeto

    //¿Qué atributos tiene una persona?
    //nombre, edad, nacionalidad,
    //sexo
    //ENCAPSULACION- Pilar de la POO
    //Define el nivel de acceso a métodos o atributos de nuestro
    //objeto. En el caso de atributos, casi siempre se utiliza el
    //más restrictivo (private)
    //Los modificadores de acceso son los siguientes:
    //private, protected, public, default
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String sexo;

    //MÉTODOS CONSTRUCTORES
    //Son métodos que me permitirán crear un objeto
    //con sus atributos iniciados o no

    //MÉTODO CONSTRUCTOR VACIO - Me permite crear o iniciar
    //un objeto, sin necesidad de asignarle un valor a sus
    //atributos
    public Persona(){

    }

    //MÉTODO CONSTRUCTOR CON TODOS LOS PARAMETROS
    //Me permite crear un objeto pero ya con sus atributos iniciados


    public Persona(String nombre, int edad, String nacionalidad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }

    //Puedo generar un método constructor solo con los parametros necesarios
    //Ej. Poder crear una Persona solo con nombre, con nombre y edad, con nombre y genero
    //etc, etc, etc

    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    //MÉTODOS GETTERS Y MÉTODOS SETTERS
    //MÉTODOS GET NOS VAN A DEVOLVER EL VALOR ASIGNADO EN UN ATRIBUTO
    //MÉTODOS SET NOS VAN A PERMITIR ESTABLECER UN VALOR EN UN ATRIBUTO O ACTUALIZARLO


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

    //Método .toString()
    //Convierte en cadena de texto la informacion de los atributos de un objeto
    //Para poder recuperar su informacion y verla en consola
    //Como si de una radiografia se tratase
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
