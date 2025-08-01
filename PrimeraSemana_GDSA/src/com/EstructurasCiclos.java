package com;

import java.util.Scanner;

public class EstructurasCiclos {
    public static void main(String[] args) {
        /*
        ciclos o bucles- estructuras de interacion
        son estructuras que nos ayudaran  a repetir sentencias o procesos
        ya sea un numero determinado de veces o indeterminados
         */

        /*
        ciclo while - Ciclo indeterminado
        actua mientras se cumpla una condicion

        mientras (esto se cumpla o sea verdadero){
            se ejecutara este bloque de codigo
        }
         *//*
        int x=1;
        while(x<5){//mientras x sea menor se ejecuta el codigo
            System.out.println("X= "+x+" Hola Mundo");
            //para controlar el el ciclo se deve de cambiar el valor de x
            //con un incremento
            //x++; o x=x+1;
            x++;
        }*/
        /*
        ciclo do while
        primero realiza y despues verifica la condicion
        para saber si debe seguir ejecutandose
        es util en situaciones en las que una condicion pueda no cumplirse
        pero nos aseguramos wue el programa se ejecute alguna vez
         */
        /*int x=7;
        do {
            System.out.println("hola mundo");
            x++;
        }while (x<=5);*/
        /*
        Ej. podemos utilizaar el ciclo do while
        si necesitaramos enviar un msj para solicitar
        una contraseña y que este msj se muestre amenos que la
        contraseña sea correcta
         */
       /* Scanner input = new Scanner(System.in);
        String password="admin";
        String passInput;
        do {
            System.out.print("Introduce tu contraseña: ");
            passInput=input.next();

        }while (!passInput.equals(password));*/

        /*
        Ciclo for -para
        es un ciclo determinado
        regularmente usado cuando sabemos o tenemos una idea
        de hasta cuando parar o ejecutar una tarea

        para(estos parametros){
            se ejecuta este bloque de codigo
        }
         */
        for (int i = 0; i <= 5 ; i++) {
            System.out.println(i+" Hola Mundo");
        }
    }
}
