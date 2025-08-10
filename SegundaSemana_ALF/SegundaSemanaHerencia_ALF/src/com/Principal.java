package com;

public class Principal {
    public static void main(String[] args) {

        //Creamos una nueva persona
        //Persona ya no se puede instaciar por la clase persona que es abstacta
        //Persona juan = new Persona("Juan", "Masculino", 30);
        //Creamos a un empleado
        Persona juan = new Empleado();//POLIMORFISMO DE ASIGNACION
        Empleado javaDeveloper =
                new Empleado("Alfredo","Masculino",30,"LOFA950416",25000,"Matutino");

        juan.setEdad(24);
        javaDeveloper.setEdad(25);
        System.out.println(juan);
        System.out.println(javaDeveloper);

        //Probando el metodo comer a traves de persona o empleado
        //en ambos casos ejecuta el mensaje estoy comiendo
        juan.comer();
        javaDeveloper.comer();

        //Probando metodo llamadao saludar
        //String saludoDeJuan = juan.saludar();
        //System.out.println(saludoDeJuan);
        juan.saludar();
        double resultado = javaDeveloper.sumar(17,8);
        System.out.println("la suma es: "+ resultado);

        //llamar el metodo poliformico
        juan.sumar(34,6,5);
        juan.checarEntrada();
        javaDeveloper.checarEntrada();

        //UTLIZAR METODO VOLAR
        javaDeveloper.volar();

        //Nuestros objetos pueden tomar comportamientos de tres partes
        //1.- metodos propios (sus mclases tienen metodos definidos)
        //2. Heredados de otras clases(incluyendo clases abstractas
        //3.- de metodos provenientes de interfaces
    }
}
