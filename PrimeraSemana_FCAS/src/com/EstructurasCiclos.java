package com;

import java.util.Scanner;

public class EstructurasCiclos {
    public static void  main(String[] args) {

     /*
     Conocidos como estructuras de iteración o bucles
     Nos ayudarán a repetir sentencias o procesos, ya sea un numero determinado de veces o
     indeterminado.
     */
        //while - indeterminado
        //Actua mientras se cumpla una condición
            //Mientras (x se cumpla o sea verdadero){
            //se ejecutará este bloque de codigo
      int x = 1;

      while(x<5){
          //Mientras x sea menor a 5, se ejecutará el print infinitas ocaciones
          System.out.println("Hola mundo");
          //Para detener el ciclo debemos controlar o cambiar x con un incremento
          //x = x+1; otra manera de expresar este incremento es:
          x++;
      }
      //Do while - indeterminado
        //primero realiza y luego verifica la condición para saber si sigue ejecutando
        //Util en situaciones donde una condición pueda no cumplirse
        //pero nos aseguramos que el programa ejecute mínimo 1 vez

        do {
            System.out.println("Hola mundo");
        }while (x<5); //Primero ejecuta el bloque y luego pregunta si debe seguir

        //Podemos usar este ciclo si necesitaramos usar un msj para solicitar contraseña
        //así este msj se muestra a menos que la contraseña sea correcta

        Scanner entrada = new Scanner(System.in);
        String password = "admin";
        String pssword; //En esta se guardará la que metamos como usuario

        do {
            System.out.println("Ingrese la contraseña");
            pssword = entrada.next();
        }while (!pssword.equals(password));


        // ciclo for, determinado. Usado cuando sabemos o hay idea de hasta cuando vamos a parar
        //Se usa:   (variable de control; condición; incremento o decremento)

        for (int i=1; i<=5; i++){
            System.out.println(i+"Hola mundo");
        }



    }
}
