package com;

public abstract class Persona {
    private String nombre;
    private String genero;
    private int edad;

    public Persona(){}

    public Persona(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                '}';
    }

    /*METODOS PROPIOS O FUNCIONES DE UNA CLASE
     comportamientos que puede terner nuestro objeto o acciones
     que puede realizar      */

    //metodo sin retorno - ejecutan algo pero no estan obligados a devolver la información
    public void comer(){
        //accion a realizar del metodo
        System.out.println("Estoy comiendo");
    }

    //metodo con retorno - debe declarar metodo a devolver
    /* Estan obligados a devolver un tipo de dato que declaran. Tambien pueden mandar
    a ejecutar algo en consola o alguna logica, pero su primer funcion es devolver un valor
     */
    public String saludar(){
        String saludo = "Hola"; //cadena de saludo
        System.out.println("Hola M");
        return saludo;
    }

    //metodo que devuelva un double para una suma
    public double sumar(double a, double b){
        System.out.println(a+b);
        return a+b;
    }
    /*POLIMORFISMO - habilidad de un metodo, variable u objeto de poseer varias
    formas. En este caso en los metodos, podemos tener un mismo nombre, pero el metodo se ejecutará de
    una distinta forma
     */
    //suma de metodo polimorfico
    public double sumar(double a, double b, double c){
        System.out.println(a+b+c);
        return a+b+c;
    }

    public double sumar(double a, double b, double c, double d){
        System.out.println(a+b+c);
        return a+b+c;
    }

    //EJEMPLO DE CREACION DE METODO ABSTRACTO
    //Esto volvera a nuestra clase Persona abstracta y solo servira para poder heredar el codigo, ya que no
    //puede instanciarse
    //no se pueden crear objetos de esta clase

    //metodo abstracto  es aquel que dice QUE va a hacer, pero no COMO hacerse
    //Metodo sin cuerpo y sin definir

    public abstract void checarEntrada();
}
