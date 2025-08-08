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

    //MÉTODOS PROPIOS O FUNCIONES DE UNA CLASE
    //Prácticamente son comportamientos que puede tener nuestro objeto
    //o acciones que puede realizar

    //EJ. CREANDO UN MÉTODO SIN RETORNO (void)
    //Son métodos que ejecutan algo, pero no estan obligados a devolver la informacion
    //de algún tipo de dato
    public void comer(){
        //Aqui va la accion que queremos que este metodo realice
        System.out.println("Estoy comiendo...");
    }

    //Ej. CREANDO UN MÉTODO CON RETORNO (debe declarar un tipo de dato a devolver)
    //Estan obligados a devolver un tipo de dato que declaran. También pueden mandar
    //a ejecutar algo en consola o alguna logica, pero su principal funcion
    //es devolver un valor

    public String saludar(){
        String saludo = "Hola Mundo"; //Declaramos un String con un saludo
        //Puedo hacer que este metodo mande a imprimir el saludo
        //y además lo devuelva para guardarlo en otro momento
        System.out.println(saludo);
        return saludo; //Este metodo devolvera lo contenido en la variable saludo
    }

    //Ejemplo. Creando un método que devuelva un double
    //para ejecutar una suma

    public double sumar (double a, double b){
        System.out.println(a+b);
        return a+b;
    }

    //Creando un método polimorfico
    //POLIMORFISMO- es la habilidad de un método, variable u objeto de poseer varias
    //formas. En este caso en los métodos, podemos tener un mismo nombre, pero
    //el metodo se ejecutara de una distinta forma
    //Ej. sumar ahora 3 numeros
    public double sumar (double a, double b, double c){
        System.out.println(a+b+c);
        return a+b+c;
    }
    //Ej. otro metodo más para sumar, pero ahora 4 numeros
    public double sumar (double a, double b, double c, double d){
        System.out.println(a+b+c+d);
        return a+b+c+d;
    }

    //EJEMPLO DE CREACIÓN DE UN MÉTODO ABSTRACTO
    //Esto volverá a nuestra clase Persona abstracta y solo servirá para poder
    //heredar ese codigo, ya que no podrá instanciarse
    //No podremos crear objetos de esta clase

    //Un método abstracto es aquel que dice QUÉ se va hacer, pero no CÓMO hacerse
    //Es un método sin cuerpo o sin definir

    public abstract void checarEntrada();



}
