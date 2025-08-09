package com;

public class Principal {
    public static void main(String[] args) {
        //En la POO solo debe existir una clase con
        //el metodo main, que se encargara de ejecutar
        //el proyecto

        //Ej. Crear nuestro primer objeto de la Clase Persona
        Persona persona1 = new Persona();

        //Asignar valores a mi objeto persona1
        //persona1.nombre = "Alex";

        //Ej. 2. Crear una persona con sus atributos iniciados
        //utilizando el constructor con todos los parametros
        Persona juan = new Persona("Juan", 33, "Frances", "Masculino");

        //EJ. 3 Crear una persona con solo Nombre y Sexo
        Persona sara = new Persona("Sara", "Femenino");

        //Probar los metodos set para poder establecerle un valor
        //a mi objeto vacio llamado persona1

        //El constructor vacio me sirve como un comodin, ya que
        //con los metodos setters
        //yo puedo elegir en que momento y que guardar en mi objeto
        persona1.setNombre("Pedro");

        //Los metodos get, me devuelven el valor de un atributo
        //juan.getEdad();
        //int edadJuan = juan.getEdad();


        System.out.println(juan.getEdad());

        System.out.println(persona1.getEdad());

        System.out.println(persona1.getNombre());
        System.out.println(juan.getNacionalidad());

        juan.setNacionalidad("Italiano"); //aqui estoy reemplanzando la nacionalidad de Juan
        //Que era frances

        System.out.println(juan.getNacionalidad());

        System.out.println(juan);


        //Clase Restaurante
        Restaurante Andretti = new Restaurante();
        Restaurante puertoSuarez = new Restaurante("Argentina", 355, 24, true);

        Andretti.setTipoComida("Italiana");
        Andretti.setPreciovaletParking(30);

        System.out.println(Andretti);
        System.out.println(puertoSuarez);


        //Clase Zoologico
        Zoologico kenia = new Zoologico(133.23, "Cebras, Elefantes, jirafas", "8am", "4pm", "Hamburgesas, papas fritas", 200);
        Zoologico sydney = new Zoologico();

        sydney.setAnimales("Loros, Pavorreales, venados");
        sydney.setHoraApertura("9am");

        System.out.println(kenia);
        System.out.println(sydney);

        //Clase Pastel

        Pastel kinder = new Pastel();
        Pastel lemonPie = new Pastel("Limon, azucar glass, galleta", 300, 9);
        kinder.setIngredientes("Chocolate, malvavisco");
        kinder.setNumRebanadas(12);

        System.out.println(kinder);
        System.out.println(lemonPie);
    }


}
