package com;

public class Principal {
    public static void main(String[] args) {
        //Crear persona
        Persona juan = new Empleado(); //polimorfismo de asignacion
        //La clase persona no puede ser instanciada pero en su lugar se crea el objeto Empleado

        //se crea nuevo Empleado
        Empleado javaDeveloper =
                new Empleado("Alfredo", "MASCULINO", 30, "as123212123", 25000, "Matutino");

        //Persona solo puede utilizar sus metodos
        juan.setEdad(31);

        //Empleado utiliza su,s metodos + los de su padre
        javaDeveloper.setEdad(31);

        System.out.println(juan);
        System.out.println(javaDeveloper);

        //llamado a metodo comer a traves de persona
        juan.comer(); //ejecuta "Estoy comiendo"
        javaDeveloper.comer();  //ejecuta "Estoy comiendo"

        //probando metodo saludar
        /* String saludoDeJuan = juan.saludar();
        System.out.println(juan.saludar());*/

        juan.saludar();

        //probar el metodo sumar
        javaDeveloper.sumar(19, 20);

        juan.sumar(12, 13, 14);

        juan.checarEntrada();
        javaDeveloper.checarEntrada();

        //utilizar metodo volar
        javaDeveloper.volar();

        /*Nuestros objetos pueden tomar comportamientos de 3 partes
            1. De metodos propios (sus clases tienen metodos definidos)
            2. Heredados de otras clases (incluyendo clases abstractas)
            3. De métodos provenientes de interfaces
         */
    }
}
