package com;

public abstract class Persona {
    private String nombre;
    private String genero;
    private int edad;

    public Persona(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public Persona() {
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
    //Este es un metodo que retorna algo
    public int getEdad() {
        return edad;
    }
    //Y los métodos sin retorno, en este caso es por la palabra void, no devuelven
    //pero ejecutan acción
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
    //Métodos propios o funciones de clase
    //Practicamente comportamientos que puede tener o acciones que realiza

    //Ej. creando un método sin retorno o void
    //Ejecuta algo pero no estan obligados a devolver la info de algun tipo de dato

    public void  comer(){
        //Aquí va la accion que queremos que haga el método

        System.out.println("esta comiendo...");
    }

    //Creando uno con retorno, debe declarar el tipo de dato a devolver
    //Obligados a devolver un tipo de dato que declaran. Ejecuta algo en consola pero
    //lo principal es devolver valor.

    public String saludar(){
            String saludo = "Hola hola";
//Podemos hacer que este metodo imprima y lo guarde para otro momento
        System.out.println(saludo);
            return saludo; //este metodo devolverá lo contenido en saludo
    }

    //Ej. creamos un metodo que devuelva un double para ejecutar una suma
    public double sumar(double a, double b) {
        System.out.println(a + b);
        return a+b;
    }

    //Metodo polimorfico
    //Esto es la habilidad que tiene un metodo, variable u objeto de poseer varias formas
    //En los metodos podemos tener un mismo nombre pero el metodo tendrá otras formas
    //ej. ahora suma 3 nums

    public double sumar (double a, double b, double c){
        System.out.println(a+b+c);
        return a+b+c;
    }
    //ej. ahora suma 4 nums

    public double sumar (double a, double b, double c, double d){
        System.out.println(a+b+c+d);
        return a+b+c+d;
    }
//Aquí se provoca una sobrecarga de métodos, son varios métodos que se llaman igual.
    /*Esta sobrecargad de métodos se da gracias a la sobrecarga de argumentos
    Que se da cuando una metodo solicita más de una lista de argumentos o parametros
    Entonces, una sobrecarga de métodos es el polimorfismo
     */



    //Ej de creación de un método abstracto
    //Volvera a nuestra clase Persona abstracta, solo servira para heredar el codigo
    //pero ya no instanciarse, osea no podemos crear más objetos de esta clase
    //El abstracto es aquel que dicer que se hará pero no como se hará,
    // Es un método sin cuerpo o definición


    public abstract void checarEntrada ();


}
