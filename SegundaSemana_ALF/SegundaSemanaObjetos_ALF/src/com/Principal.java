package com;

public class Principal {
    public static void main(String[] args) {
        //En poo solo existe una clase main que se encarga de ejecutar el proyecto
        //Creamos nuestro primer objeto de nuestra clase persona


        Persona persona1 = new Persona(); //Instanciamos un objeto

        //Asignar valores a mi objeto persona1
       //persona1.nombre="Alfredo";
        //Creamos una persona con sus atributos inicializados el constructor
        //con todos los parametros
        Persona juan = new Persona("Juan", 24,"Mexicana","Masculino");

        //Crear persona con solo atributos nombre y sexo
        //Tambien conocido como sobrecarga
        Persona sara = new Persona("Sara","Femenino");

        //Probando  los seter para poder establecerle un valor a mi objeto vacio persona1
        //El constructor vacio nos sirbe como comodin , ya que el metodo  setter
        //puedeo elegir en el momento que deso guardar en mi objeto

        persona1.setNombre("Alfredo"); //Asignamos valor d eun atributo

        //los metodos get me devuelve el valor guardado en un atributo
        juan.getEdad();
        int edadJuan = juan.getEdad();
        System.out.println(juan.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(juan.getNacionalidad());//Aqui sige siendo juan mexicano
        juan.setNacionalidad("Aleman");//Aqui ya cambio a aleman
        System.out.println(juan.getNacionalidad());

        //Para ver todos los atributos de un objeto se utiliza en metodo toString
        System.out.println(juan);//con el metodo toStirng mostramos todos los valores asignados
        //segun lo que ya tenga guardado
        System.out.println(sara);

        System.out.println("******************************************************************");
        Maestro maestroVacio = new Maestro();
        Maestro maestroLleno = new Maestro("Alex", 34,"Programacion","Matutino");
        maestroVacio.setNombre("Alfredo");
        System.out.println(maestroLleno);
        System.out.println(maestroVacio);
        System.out.println("***********************************************************************");
        Alumno alumnoVacio = new Alumno();
        Alumno alumnoLleno = new Alumno("Alfredo","LOFA950416",2);
        alumnoVacio.setNombre("Maria");
        System.out.println(alumnoLleno);
        System.out.println(alumnoVacio);
        System.out.println("********************************************************************");

        Materia materiaVacia = new Materia();
        Materia materiaLleno = new Materia("Programacion2",5,3);
        materiaVacia.setNombre("Ingles");
        System.out.println(materiaLleno);
        System.out.println(materiaVacia);

    }
}
