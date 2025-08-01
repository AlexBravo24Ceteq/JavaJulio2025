package com;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {

        //Ingresar valores atraves de teclado
        Scanner entrada = new Scanner(System.in); //inicializamos a scanner para poder ingresar datos
        String nombre; //declaramos valiable donde se guardara ese nombre
        System.out.println("Ingresa tu nombre"); // pedimos por mensage el nombre
        nombre = entrada.next(); //aqui se guarda el nombre ingresado
        System.out.println("Hola "+ nombre); // muestra el nombre
        //Con el mismo scanner utilizamos para pedir mas datos
        int edad;
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();//Pudes ingresar cadenas de texto con espacios

        String apellidos;
        System.out.println("Ingresa tus apellidos");
        entrada.nextLine(); //con esta declaracion refresca las nuevas entradas para no tener saltos de informacion
        apellidos = entrada.nextLine();//con nextLine podemos ingresar datos con espacios
        //y poder entrar ingresar valores de tipo cadenas

        System.out.println("Bienvenido "+nombre.toUpperCase()+ " "+ apellidos.toUpperCase()+ " tu edad es "+ edad);

    }
}
