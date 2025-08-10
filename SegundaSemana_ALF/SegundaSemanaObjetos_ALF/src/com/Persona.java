package com;

public class Persona {
    //ABSTRACCIN - consiste en definir atributos  y metodos que tendra
    //cierto objeto
    //metodos de una persona
    //ENCAPSULACION- DEFINE EL NIVEL DE ACCESO A METODOS A ATRIUBUTOS DE NUESTRO OBJETO
    //casi se usa mas privado (private)
    //Modificadores de accesso son los siguientes
    //private,protected, public, default
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String sexo;

    //METODOS CONSTRUCTORES
    //Son metodos que nos permitiran crear un objeto con sus  atributos iniciados o no
    //Metodo cronstuctro vacio- permite crear o iniciar un objeto
    //sin necesidad de asignarle un valor a sus atributos


    public Persona() {
        //Metodo vacio
    }
    //Metodo constructor con los parametros
    //Me permite crear un objeto pero ya con sus atributos iniciados

    public Persona(String nombre, int edad, String nacionalidad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }
    //Generar un metodo solo con los constructores solo con parametros necesarios en este caso solo
    //nombre y sexo


    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }
    //Metodos getter y setters
    //GET NOS DEVOLVERA EL VALOR ASIGANADO EN UN ATRIBUTO
    //SETER NO ERMITE ESTABLECER O ASIGNAR Y MOFICIAR EL VALOR EN LOS ATRIBUTOS

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
    //Creamos metodo . toString
    //Convierte en cadena de texto a informacion de los atributos de u objeto
    //recupera la info y verla en consolo

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
