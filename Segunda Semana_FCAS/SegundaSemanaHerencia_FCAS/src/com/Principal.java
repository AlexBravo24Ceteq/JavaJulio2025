package com;

public class Principal {
    public static void main(String[] args) {

        //Persona juan = new Persona("Juan", "Masculino", 30); -> Esto ya no puede ser debido
        //a que la clase persona no puede ser instanciada ya. Pero en su lugar creamos
        //A este objeto juan como nuevo empleado
        Persona juan = new Empleado();


        Empleado javaDeveloper = new Empleado("Alfredo", "Masculino", 30, "AL8676980DF", 25000, "matutino");

        //Persona juan solo puede usar sus metodos get y set de su clase, pero el empleado puede
        //tomar los de su clase y los de persona

        juan.setEdad(31);

        javaDeveloper.setEdad(31);

        System.out.println(juan);
        System.out.println(javaDeveloper);

        /*
        Actividad, crear un ejercicio donde apliques el concepto de herencia.
        Usaremos nuevo proyecto "EjercicioHerencia_FCAS"
        Paquete com->clase principal->clase padre (ej. Animal)-> clase hija (Ej. perro)
        Creamos objetos en principal e imprimimos.
        */

        juan.comer();
        javaDeveloper.comer();

        //Probando saludar
        String saludoDeJuan = juan.saludar();
        System.out.println(juan.saludar());

        //Probrar el metodo sumar a traves de mi Empleado javaDeveloper
        javaDeveloper.sumar(402.34, 139.65);

        //Probando metodo sumar pero polimorfico, ej. sumar 3 nums
        juan.sumar(12,16,29);
        juan.sumar(40,201,34,21);

        juan.checarEntrada();
        javaDeveloper.checarEntrada();
        //Usaremos el volar
        javaDeveloper.volar();

        //Los objetos pueden tomar comportamientos de 3 partes.
        // 1. De métodos propios osea definidos
        // 2. De heredados de otras clases que incluyen abstractas
        // 3. De métodos de interfaces.

    }
}
