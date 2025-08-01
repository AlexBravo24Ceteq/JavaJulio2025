package com;

import java.util.Scanner;

public class EstructurasCiclos {

    public static void main(String[] args) {

        // CICLOS - BUCLES - Estructuras de iteracion
        // Son estructuras que nos ayudarán a repetir sentencias o procesos
        // Ya sea un número determinado de veces o indeterminado
        // Ciclo while - Ciclo indeterminado
        // Actua mientras se cumpla una condición

        /*
        Mientras (esto se cumpla o sea verdadero) {
                    se ejecutará este bloque de código
                    }
         */

        int x = 1;
       /*
       while (x <= 5){ // Mientras x sea menor a 5
           // se ejecutará lo de aquí
           System.out.println(x + " : Hola Mundo");
           // Para poder detener el ciclo debemos controlar o cambiar el valor de x
           // con un incremento
           // x = x + 1;
           // Otra forma de expresar un incremento en x es con
           x++;
       }
        */

        // do while
        // Primero realiza y después verifica la condición para saber si debe
        // seguir ejecutandose
        // Es util en situaciones en las que una condición pueda no cumplirse
        // pero nos aseguramos que el programa se ejecute por lo menos una vez

        /*
        do { // Ejecuta el siguiente bloque de código
            System.out.println("Hola Mundo");
        } while (x <= 5); // Después pregunta si debe seguir ejecutandose
         */

        // Ejemplo. Podemos utilizar el ciclo do-while si necesitaramos enviar un mensaje
        // para solicitar yba contraseña, y que este mensaje se muestre, a menos que
        // la contraseña sea correcta

        /*
        Scanner entrada = new Scanner(System.in);
        String password = "admin";
        String contrasenia; // aquí vamos a guardar la que ingrese el usuario

        do{
            System.out.println("Introduce una contraseña: ");
            contrasenia = entrada.next();
        }while (!contrasenia.equals(password));
         */

        // Ciclo for - para
        // Es un ciclo determinado. Regularmente utilizado cuando sabemos
        // o tenemos una idea de hasta cuando parar o ejectutar una tarea

        /*
        para (estos parametros) {
                se ejecuta este bloque de código
                }

                (una variable de control; una condicion; un incremento o decremento)
         */

        for (int i = 1; i <=5 ; i++) {
            System.out.println(i + " : Hola Mundo");

        }
    }
}