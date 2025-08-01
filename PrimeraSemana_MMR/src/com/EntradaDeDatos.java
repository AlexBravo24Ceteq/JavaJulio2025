package com;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        //ingresar valores a traves del teclado
        Scanner entrada = new Scanner(System.in);
        String nombre; //variable para almacenar algo

        //Solicitud de nombre
        System.out.println("Ingresa tu nombre");
        nombre = entrada.next(); //se asigna lo tecleado a variable
        System.out.println("Hola " + nombre);

        //No es necesario declarar el scanner mas de una vez, se usa las veces que se necesiten

        //solicitud de edad
        int edad;
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();
        System.out.println(nombre +" tu edad es: " + edad);

        String apellidos;
        System.out.println("Ingresa tus apellidos");
        /*Si el msj se llega a saltar las instrucciones, podemos consumir el espacio en una entrada de teclado
        sin asignar          */
        entrada.nextLine(); //esto consume el espacio
        apellidos = entrada.nextLine(); //se entra a la instruccion y se piden lo requerido
        System.out.println("Tu nombre es " + nombre+ " "+ apellidos);
    }
}
