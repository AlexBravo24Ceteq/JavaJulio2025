package com;

public class Principal {

    public static void main(String[] args) {
        //En la POO solo debe existir una clase
        //con el método main, que se encargara de ejecutar
        //el proyecto

        //Ej. Crear nuestro primer objeto de la clase Persona
        Persona persona1 = new Persona();

        //Asignar valores a mi objeto persona1
        //persona1.nombre="Alex";

        //Ej.2. Crear  una persona con sus atributos iniciados utilizando el
        //constructor con todos los parametros
        Persona juan = new Persona("Juan",20,"Mexicana","Masculino");

        //Ej. 3. Crear una persona con solo nombre y sexo
        Persona sara = new Persona("Sara", "Femenino");

        //Probar los métodos set, para poder establecerle un valor a mi objeto vacio
        //llamado persona1
        //El constructor vacio me sirve como un comodín, ya que con los métodos setters
        //Yo puedo elegir en que momento y qué guardar en mi objeto
        persona1.setNombre("Pedro");

        //Los métodos get, me devuelven el valor de un atributo
        //juan.getEdad();
       // int edadJuan = juan.getEdad();

        System.out.println(juan.getEdad());

        System.out.println(persona1.getNombre());
        System.out.println(juan.getNacionalidad());
       juan.setNacionalidad("Francesa"); //aqui estoy reemplaando la nacionalidad de juan
        //que era "Mexicana"

        System.out.println(juan.getNacionalidad());

        System.out.println(juan);

        //Creo 2 objetos de la clase Camiseta, uno vacio y uno con todo

        Camiseta comun = new Camiseta();

        Camiseta rinbros = new Camiseta("Algodon", 40, 50, "Chica", 50.59);

        comun.setPrecio(20);

        System.out.println(comun);
        System.out.println(rinbros);

    }

}
