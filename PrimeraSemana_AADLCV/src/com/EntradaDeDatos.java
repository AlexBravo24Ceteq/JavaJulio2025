package com;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void main(String[] args) {

        // Ingresas valores a través de teclado
        Scanner entrada = new Scanner(System.in);
        // Necesito declarar una variable para guardar algo
        // Ejemplo, guardar un nombre
        String nombre;

        // Mandamos un mensaje que  nos solicite el nombre
        System.out.println("Ingresa tu nombre");
        nombre = entrada.nextLine(); // Aquí el programa espera que ingresemos un nombre
        // por teclado para después guardarlo en la variable nombre
        // Una vez guardado el valor, podemos decidir que hacer con el.
        // Ejemplo, mandar un saludo
        System.out.println("Hola " + nombre);
        // Con ese mismo Scanner llamado entrada, puedo solicitar ahora una edad
        // pero necesito primero una variable donde guardar la edad
        int edad;
        System.out.println("Ingresa una edad");
        edad = entrada.nextInt();

        System.out.println(nombre + " tu edad es : " + edad);

        String apellidos;
        System.out.println("Ingresa tus apellidos");
        // Si el mensaje se llega a saltar la instrucción, podemos consumir el espacio
        // que quedó volando con una entrada de teclado sin asignar
        entrada.nextLine(); // esto consume el espacio
        apellidos = entrada.nextLine(); // y posteriormente entramos a la instrucción
        // que si nos pedirá los apellidos

        System.out.println("Tu nombre completo es : " + nombre + " " + apellidos);



    }

}
