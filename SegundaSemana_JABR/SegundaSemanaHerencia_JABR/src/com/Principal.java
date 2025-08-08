package com;

public class Principal {

    public static void main(String[] args) {

        //Vamos a crear una Persona
        Persona juan = new Empleado(); //Polimorfismo de asignacion
        //La clase Persona no puede ser instanciada, pero en su lugar, creamos
        //a este objeto juan como un nuevo Empleado

        //Creamos un nuevo Empleado
        Empleado javaDeveloper =
                new Empleado("Alfredo", "MASCULINO", 30, "AL8676980DF", 25000, "Matutino");

        //Persona juan solo puede utilizar sus métodos Get y Set de su clase
        juan.setEdad(31);

        //Empleado puede utilizar los Get y Set de su clase, mas los de la clase Persona
        javaDeveloper.setEdad(31);

        System.out.println(juan);
        System.out.println(javaDeveloper);

        //Probando el método comer, llamandolo a través de una Persona o de
        //un Empleado.

        juan.comer(); //Ejecuta una impresion en consola con el msj "Estoy comiendo..."
        javaDeveloper.comer(); //Ejecuta una impresion en consola con el msj "Estoy comiendo..."

        //Probando el método saludar
      //  String saludoDeJuan = juan.saludar();
        //System.out.println(juan.saludar());
        juan.saludar();

        //Probar el metodo sumar a través de mi Empleado javaDeveloper
        double resultado = javaDeveloper.sumar(19,20);

        juan.sumar(12,13);

        juan.checarEntrada();
        javaDeveloper.checarEntrada();

        //Utilizar el método volar
        javaDeveloper.volar();

        //Nuestros objetos pueden tomar comportamientos de 3 partes
        //1. De métodos propios (sus clases tienen métodos definidos)
        //2. Heredados de otras clases (incluyendo clases abstractas)
        //3. De métodos provenientes de interfaces

    }

}
