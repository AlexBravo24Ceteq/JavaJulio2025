package com;

import java.util.Scanner;

public class EstructuraCiclos {
    public static void main(String[] args) {
        //Ciclos - Bucles - Estructuras a Iteracion
        //Son Estructuras que nos ayudan a repetir
        //Sentencias procesos
        //Ya sea un numero determinado de veces o indetermindado

        //Ciclo while - ciclo indeterminado
        //Actua mientras se cumpla una condicion

        /*
        Mientras (esto se cumpla o sea verdadero){
        se ejecutara este bloque de codigo
        }
         */

        int x = 4;
        /*
        while(x<5){ //Mientras x sea menor a 5, se ejecuta lo de adentro
            System.out.println(x + ": Hola Mundo");
            //Para poder detener el ciclo debemos controlar
            //o cambiar el valor de x con un incremento
            //x = x + 1;
            //Otra forma de expresar un incremento en x es con
            x++;

        }
        */

        //do while
        //primero realiza y despues verifica la condicion
        //para saber si debe seguir ejecutandose
        //Es util en situaciones en las que una condicion
        //pueda no cumplirse pero nos aseguramos
        //que el programa se ejecuta por lo menos una vez

        /*
        do{ //ejecuta el siguiente bloque de codigo
            System.out.println("Hola Mundo");
        }while (x<=5); //despues pregunta si debe seguir ejecutandose


         */

        //Ej. Podemos utilizar  el ciclo do-while si necesitaramos
        //evitar un msj, para solicitar una contraseña, y que este
        //msj se muestre , a menos que la contraseña sea correcta

        Scanner entrada = new Scanner(System.in);
        String password = "admin";
        String contrasena; //aqui vamos a guardar la que ingrese el usuario

        /*
        do{
            System.out.println("Introduce una contraseña: ");
            contrasena = entrada.next();

        }while (!contrasena.equals(password));
        
        
         */
        
        //Ciclo for - para
        //Es un ciclo determinado. Regularmente 
        //Utilizado cuando sabemos o tenemos una 
        //idea de hasta cuando parar o ejecutar una 
        //tarea
        
        /*
          para(estos parametros){
             se ejecuta este bloque de codigo
          }
          
          (una variable de control; una condicion;
          un incremento o decremento)          
         */

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " hola mundo");
            
        }
    }

}
