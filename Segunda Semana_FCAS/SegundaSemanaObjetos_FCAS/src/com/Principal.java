package com;

public class Principal {
    public static void main(String[] args) {
        //En la POO (Programación orientada a objetos), solo debe
        //existir una clase con el metodo main, que se encargará de
        //ejecutar el proyecto

        //Crearemos el primero de la clase Persona
        Persona persona1 = new Persona();

        //Asignar valores a mi objeto persona1
        //persona1.nombre="Alex"

        //Ej. 2.- Crear una persona con sus atributos iniciados usando el constructor
        //con todos los parametros.

        Persona juan = new Persona("Juan",
                20, "Mexicana", "Masculino");

        //Ej. 3.- Queremos solo nombre y sexo, puedes colocar los valores que
        // no quieres en nulo, pero lo mejor es.
        Persona Sara = new Persona("Sara", "femenino");

        //Probar metodo set, para poder establecer un valor a mi objeto vacio
        // llamado persona1
        //El constructor vacio me sirve como comodin para los setters
        //Así yo puedo elegir en que momento y que guardar en mi objeto

        persona1.setNombre("Pedro");

        //Los metodos get, me devuelven el valor de un atributo
        //juan.getEdad();
        //int edadJuan = juan.getEdad();
        //O mandarla con

        System.out.println(juan.getEdad());

        System.out.println(persona1.getNombre());

        juan.setNacionalidad("Francesa"); //Si mando el print antes, saldrá mexicana.
        //Pero ahora estamos remplazando su nacionalidad a francesa.

        System.out.println(juan.getNacionalidad());

        System.out.println(juan);
        //Nos mandará donde se aloja, pero no la cadena de texto de todos los datos,
        // aquí ocuparemos el tostring

//---------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------------
//>>>>>>TACOS<<<<<<
        Tacos arabes = new Tacos();
        Tacos pastor = new Tacos(5,"pastor", "maiz","verde","con todo");

        arabes.setCarne("arabe");
        arabes.setCantidad(2);

        System.out.println("\n" + ">>>>TACOS<<<<");
        System.out.println(arabes);
        System.out.println(pastor);
        System.out.println(">>>>>>-<<<<<<");

//---------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------------
//>>>>>>CANCIONES<<<<<<
        Canciones Pop = new Canciones();
        Canciones Rap = new Canciones("rap", "eladio carrión", 2, "3MEN2 KBRON");

        Pop.setArtista("Billie Ellish");
        Pop.setColaboradores(1);

        System.out.println("\n" + ">>>>CANCIONES<<<<");
        System.out.println(Pop);
        System.out.println(Rap);
        System.out.println(">>>>>>-<<<<<<");

//---------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------------
//>>>>>>LIBRETAS<<<<<<
       Libretas francesa = new Libretas();
       Libretas profesional = new Libretas("profesional", 100, 4, "Scribe", "corto");

        francesa.setHojas(150);
        francesa.setTamaño("francesa");


        System.out.println("\n" + ">>>>LIBRETAS<<<<");
        System.out.println(francesa);
        System.out.println(profesional);
        System.out.println(">>>>>>-<<<<<<");







    }
}
