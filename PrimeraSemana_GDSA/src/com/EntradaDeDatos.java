package com;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        //ingresar valores atraves de teclado
        Scanner input;
        input = new Scanner(System.in);
        //var para guardar input
        String nombre;
        double peso;
        double altura;

        //mandamos mensaje que solicite algo en este caso nombre
        System.out.println("Ingresa tu nombre");
        nombre=input.nextLine();
        System.out.println("Hola "+nombre);
        System.out.println("Ingresa tu peso");
        peso=input.nextDouble();
        System.out.println("tu peso es : "+peso);
        System.out.println("Ingresa tu Altura");
        altura=input.nextDouble();
        System.out.println("Tu altura es : "+altura);



    }
}
