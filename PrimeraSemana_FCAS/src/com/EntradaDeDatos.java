package com;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void  main(String[] args) {

        //Ingresar valores a través de teclado
        Scanner entrada = new Scanner(System.in);
        //Se requiere declarar la variable para guardar algo
        //Como un nombre
        String nombre;

        //Se manda el mensaje que solicite el nombre
        System.out.println("Ingresa un nombre");
        nombre = entrada.next(); //En este caso el programa espera que ingreses algo
        //por el teclado para guardarlo en la variable "nombre". Una vez guardado
        //podemos decidir que hacer con el, como mandar un saludo

        System.out.println("Hola" + nombre);
        //Con el mismo scanner llamado entrada, puedes solicitar varios datos
        //En este caso ahora será edad, pero primero necesitamos la variable para guardar
        int edad;
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();
        System.out.println(nombre + "tu edad es: " + edad);

        //Para que tome dos datos, next no es util porque solo toma la primera palabra
        //En ese caso usamos .nextLine
        String apellidos;
        System.out.println("Ingresa tus apellidos");
        //Si el mensaje llega a saltar la instrucción, podemos consumir el espacio
        //que queda al aire, con una entrada de teclado sin asignar
        entrada.nextLine(); //Esto consume el espacio y luego vamos a la instrucción
        apellidos = entrada.nextLine();
        System.out.println("Tu nombre completo es: " + nombre + " " + apellidos);


    }
}
