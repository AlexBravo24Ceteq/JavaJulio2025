package com;

public class Principal {
    public static void main(String[] args) {

        //Vamos a crear una persona
        //Persona juan = new Persona("Juan", "Masculino", 34);
        Persona juan = new Empleado(); //Polimorfismo de asignacion
        //La clase persona no puede ser instanciada, pero en su lugar
        //creamos a este objeto juan como un nuevo Empleado

        //Creamos un nuevo Empleado
        Empleado javaDeveloper = new Empleado("Alfredo", "Masculino", 30, "AL66384", 24502, "Matutino");

        //Personma Juan solo puede utilizar sus metodos
        //get y set de su clase
        juan.setEdad(32);

        //Empleado puede utilizar los Get y Set
        //de su clase, mas los de la clase Persona

        javaDeveloper.setEdad(27);

        System.out.println(juan);
        System.out.println(javaDeveloper);

        //Probando el metodo comer, llamandolo a trave de una Persona
        //o de un Empleado.
        juan.comer(); //Ejecuta una impresion en consola con el msj "Estoy comiendo..."
        javaDeveloper.comer(); //Ejecuta una impresion en consola con el msj "Estoy comiendo..."

        //Probando el metodo saludar
        //String saludoDeJuan = juan.saludar();
        //System.out.println(juan.saludar());
        juan.saludar();

        //Probar el metodo sumar a traves de mi empleado
        //JavaDeveloper
        double resultado = javaDeveloper.sumar(3.4, 2);

        juan.sumar(12,20);

        juan.checarEntrada();
        javaDeveloper.checarEntrada();

        //Utilizar el metodo volar
        javaDeveloper.volar();

        //Nuestros Objetos pueden tomar comportamientos de
        //3 partes
        //1. De Metodos propios (sus clases tienen metodos definidos)
        //2. Heredados de otras clases (incluyendo clases abstractas)
        //3. De Metodos provenientes de interfaces





    }
}
