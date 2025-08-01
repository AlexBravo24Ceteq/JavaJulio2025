package com;

import java.util.Scanner;

public class EstructurasCiclos {
    public static void main(String[] args) {

        //CICLOS- Estructuras de iteracion
        //Son estructuras que ayudan a repetir sentencias o procesos
        //ya sea un n determinando o indeterminado
        //CICLO WHILE- ciclo indeterminado
        //Actua mientras se cumpla una condicion
        //funciona mientras (esto se cumpla o sea verdadero){
        // este bloque de codigo se ejecutara}
        //int x =1;
        /*
        while(x <= 5){ //Mientras x sea menor que 5
            System.out.println(x + " : HOLA MUNDO");// se ejecuta el codigo
            x++; // aqui el valor de x sube de uno en uno y solo imprime 4 veces hola mundo

        }*/

        //DO- WHILE - se ejecuta una vez por lo menos y despues pregunta la condicion
        /*do{
            System.out.println("HOLA MUNDO CON DO-WHILE");// este mensage se imprimer primero este o no este bien
            //la condicion
            x++;
        }while (x <= 5);

        //ejemplo de do-while con contraseña y muestre un mensaje de error
        //hasta que la contraseña sea correcta
        /*Scanner entrada= new Scanner(System.in);
        String password = "admin";
        String contrasenia;

        do{
            System.out.println("Introduce la contraseña");
            contrasenia = entrada.next();
            System.out.println("BIENVENIDO AL SISTEMA "+ password);

        }while (!contrasenia.equals(password));

        //ciclo for - para
        //Es un ciclo determinado. Regularmente utilizado cuando sabemos
        //o tenemos una idea de hasta cuando parar o ejecutar una tarea
        /*
        para (estos parametros){
            se ejecuta este bloque de codigo
        }

         (una variable de control; una condicion; un incremento o decremento)

        for (int i = 1; i <=5 ; i++) {
            System.out.println(i + " : Hola Mundo");
        }*/

        for (int i = 1; i <=5; i++) {
            System.out.println(i+ ".- "+"Hola mundo con FOREACH");
        }


    }
}
