package com;

import java.util.Scanner;

public class EstructurasCiclos {

    public static void main(String[] args) {
        //CICLOS - BUCLES - Estructuras de iteracion
        //Son estructuras que nos ayudarán a repetir sentencias o procesos
        //Ya sea un numero determinado de veces o indeterminado

        //Ciclo while - Ciclo indeterminado
        //Actua mientras se cumpla una condicion

        /*
             mientras (esto se cumpla o sea verdadero){
                        se ejecutara este bloque de codigo
             }
         */

        int x = 6;

        /*
        while (x<=5){ //mientras x sea menor a 5
            //Se ejecutará lo de aqui
            System.out.println(x + " : Hola Mundo");
            //Para poder detener el ciclo debemos controlar o cambiar el valor de x
            //con un incremento
           // x = x + 1;
            //Otra forma de expresar un incremento en x es con
            x++;
        }
      */

        //do while
        //primero realiza y después verifica la condicion para saber si debe
        //seguir ejecutandose
        //Es util en situaciones en las que una condicion pueda no cumplirse
        //pero nos aseguramos que el programa se ejecute por lo menos una vez

        /*
        do{ //ejecuta el siguiente bloque de codigo
            System.out.println("Hola Mundo");
        }while (x<=5); //después pregunta si debe seguir ejecutandose
*/

        //Ej. Podemos utilizar el ciclo do-while si necesesitaramos enviar un msj
        //para solicitar una contraseña, y que este msj se muestre, a menos que
        //la contraseña sea correcta
/*
        Scanner entrada = new Scanner(System.in);
        String password = "admin";
        String contrasenia; //aqui vamos a guardar la que ingrese el usuario

        do{
            System.out.println("Introduce una contraseña");
            contrasenia = entrada.next();
        }while (!contrasenia.equals(password));
*/

        //ciclo for - para
        //Es un ciclo determinado. Regularmente utilizado cuando sabemos
        //o tenemos una idea de hasta cuando parar o ejecutar una tarea
        /*
            para (estos parametros){
                    se ejecuta este bloque de codigo
             }
             
             (una variable de control; una condicion; un incremento o decremento)
         */
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i + " : Hola Mundo");
        }

    }

}
