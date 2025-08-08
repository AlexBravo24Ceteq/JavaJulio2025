package com;

public class Persona {

    //Abstracción. Basicamente, los atributos.
    // En este caso, los de una persona, como: nombre, edad, nacionalidad, sexo.

    //ENCAPSULACIÓN- PILAR DE LA POO
    //Define el nivel de acceso, casi siempre es privado en atributos.
    //pueden ser, private, protected, public, default


    private String nombre;
    private int edad;
    private String nacionalidad;
    private String sexo;


    //Métodos constructores. Nos permitirán crear un objeto con sus atributos iniciados o no

    //Constructor vacio. Me permite crear o iniciar un objeto sin darle un valor a sus atributos
    public Persona(){

    }

    //Constructor con todos los parametros
    //Crea con todos los atributos iniciados

    public Persona(String nombre, int edad, String nacionalidad, String sexo){
        this.nombre =nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }

    //generar un constructor solo con los parametros necesarios, para el ej.3.
    public Persona(String nombre, String sexo){
        this.nombre =nombre;
        this.sexo = sexo;
    }

    //Métodos getter y setter, encapsulan, ayudan a acceder y modificar los atributos.
    //Getter, comienzan con get luego del nombre del atributo con la primera en mayuscula.
    //Setter, empieza en set y luego el atributo, igual con la primera en mayuscula

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


    //Método.toString()
    //Convertir a cadena de texto la info
    //Para poder recuperar
    //Como si fuera una radiografía con, click derecho+generar+tostring


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
