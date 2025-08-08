package com;

import java.util.Scanner;

public class EntradadeDatos {
    public static void main(String[] args) {
        //Ingresar valores a traves de teclado
        Scanner entrada = new Scanner(System.in);
        //Necesito declarar una variable para guardar algo
        //Ejemplo, guardar un nombre
        String nombre;

        //Mandamos un mensaje que nos solicite el nombre
        System.out.println("Ingresa tu nombre: ");
        nombre = entrada.nextLine(); //Aqui el programa espera a ingresemos un nombre
        //por teclado para despues guardarlo en la variable nombre
        //una vez guardado el valor, podemos decidir que hacer con el
        //Ej. Mandar un saludo

        System.out.println("Hola "+ nombre);

        //con ese mismo scanner llamado entrada puedo solicitar ahora una edad
        //pero necesito primero una variable donde guardar la edad
        int edad;
        System.out.println("Ingrese una edad");
        edad = entrada.nextInt();

        System.out.println(nombre + " tu edad es: " + edad+ " años");

        String apellidos;
        System.out.println("ingresa tus apellidos");
        //Si el mensaje se llega a saltar la instruccion, podemos consumir el espacio que
        //quedo volando con una entrada de teclado sin asignar
        entrada.nextLine(); //esto consume el espacio
        apellidos = entrada.nextLine(); //y posteriormente entramos a la instruccion
        //que si nos pedira los apellidos

        System.out.println("Tu Nombre completo es: "+ nombre + " "+ apellidos);
    }
}
