package com;

public abstract class Persona {

    private  String nombre;
    private String genero;
    private int edad;

    public Persona() {
    }

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

    //Metodos propios o funciones de una clase
    //son comportamientos que pueden tener nuestra clase
    //o acciones a realizar

    //Creando un metodo sin retorno ( void)
    //son metodos que ejecutan algo peor no estan obligados a devolver la info
    //de algun tipo de dato
    public void comer(){
        //Aqui va la accion que queremos que este metodo realize
        System.out.println("Estoy comiendo.......");
    }
    //Creando un metodo con retorno (debe declarar un tipo de dato a devolver)
    //estan obligados a devolver un tipo de dato que declaran
    //tambien pueden mandar algo o logica en consola pero su principal funcion
    //es devolver un valor

    public String saludar(){ //se declara el metodo de tipo string
        String saludo = "Hola mundo"; //lo que contiene dentro del string saludo
        //Puedo hacer que este metodo imprima el saludo y ademas lo devuelva par aguardarlo en o
        //otro metodo
        System.out.println(saludo);
        return  saludo;//se devuelve saludo por medio del metodo saludar
    }
    //EJEMPLO CREANDO UN METODO QUE DEVUELVA UN DOUBLE
    //PARA EJECUTAR UNA SUMA
    public double sumar(double a, double b){
        System.out.println(a+b);
        return a+b;
    }
    //CREANDO METODO POLIMORFICO
    //Es la habilidad de un metodo variable u objeto de poseer varias
    //formas
    //ejemplo el metodo sumar anterior solo pedia 2 numeros ahora pedira 3
    public double sumar(double a, double b,double c){
        System.out.println(a+b+c);
        return a+b+c;
    }
    //Mismo metodo pero ahora sumara 4 numeros
    //lista de parametros o argumentos entre mas solicite un metodo se llama a sobre carga de argumentos
    //el metodo sumar el tener el mismo metodo pero con funciones diferentes
    public double sumar(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
        return a+b+c+d;
    }

    //EJEMPLO DE CREACION DE UN METODO ABSTRACTO
    //Esto volvera al clase persona en abstracta
    //heredara codigo ya que no se podra instancioarse
    //No podremos crear objetos de esta clase Persona
    public abstract void checarEntrada();
}
