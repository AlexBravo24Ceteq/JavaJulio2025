package com;

public class Principal {
    public static void main(String[] args) {
        /* en la POO solo debe existir una clase con el
        metodo main, que se encargará de ejecutar el proyecto
         */

        //Ej. crear primer objeto Persona()
        Persona persona1 = new Persona();

        //Asignar valores a persona
        //persona1.nombre = "Alex"

        //Ej.2 Persona con sus atributos iniciados con el contructor con los parametros
        Persona juan = new Persona("Juan", 20, "Mexicano", "Masculino");

        //Ej.3 Persona con unos atributos
        Persona sara =  new Persona("Sara", "Femenino");

        //Probar metodos set para establecer valor a objeto vacio Persona1
        /* el constructor vacio me sirve de comodin ya que con los metodos setters
        puedo elegir momento y que guardar en mi objeto */
        persona1.setNombre("Pedro"); //asigna nombre a persona
        persona1.setNacionalidad("Mexicano"); //asigna nacionalidad

        //Metodos get - me devuelven el valor de un atributo
        //juan.getEdad(); //20
        int edadJuan = juan.getEdad();

        System.out.println(persona1.getEdad());
        System.out.println(juan);
        /*************************/
        ////// ACTIVIDAD POO //////

        //MASCOTA//
        Mascota mascota = new Mascota();
        Mascota Shita = new Mascota("Shita", "gato", 1, "calicó");

        mascota.setNombre("Atom");

        System.out.println(mascota);
        System.out.println(Shita);

        //PASTEL//
        Pastel cualquiera = new Pastel();
        Pastel chocolate = new Pastel("chocolate", 1.5F,250,"amarillo", false);

        cualquiera.setSabor("vainilla");

        System.out.println(cualquiera);
        System.out.println(chocolate);

        //LIBRO//
        Libro libro = new Libro();
        Libro elLibro = new Libro("elLibro", "anonimo", 150.35f, "LaEdi");

        libro.setCosto(250.99f);

        System.out.println(libro);
        System.out.println(elLibro);
    }
}
