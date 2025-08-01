package com;

import java.util.Scanner;

public class EstructurasCiclos {
    public static void main(String[] args) {
        /* CICLOS - BUCLES -  Estructuras de iteracion
            Son estructuras que nos ayudarán a repetir sentencias o procesos
            ya sea un determinado numero de veces o indeterminado
         */

        /* Ciclo While - ciclo indeterminado
            actua mientras se cumpla una condición

            mientras (condicion){
                bloque de codigo
            }
         */
        /*
        int x = 1;
        while (x<=5){ //si condicion
            System.out.println(x+": Hola"); //ejecuta esto
            x++; //Se incrementa variable controlada
        }
        */
        /* DO WHILE
        primero realiza y despues verifica la condicion para saber su deber seguir ejecutandose
        Es util en situasiones en las que una condición pueda no cumplirse pero nos
        aseguramos que el programa se ejecute por lo menos una vez
         */
        /*
        int x = 6;
        do { //ejecuta el codigo
            System.out.println(x+": Hola"); //ejecuta esto
        } while (x<=5); //pregunta si continua ejecutandose
         */
        /*Ej. Podemos utilizar el ciclo do-while si necesitariamos enviar un msj para solictar
        contraseña, y que este mensaje se muestre, a menos que la contraseña sea correcta
         */
        Scanner entrada = new Scanner(System.in);
        /* String password = "admin";
        String contrasenia; //contraseña ingresada del usuario

        do {
            System.out.println("¿Contraseña?");
            contrasenia = entrada.next();
        } while (!contrasenia.equals(password));

        */

        /* CICLO FOR - PARA
        Es un ciclo determinado. Regularmente utilizando cuando sabemos o
        tenemos una idea de hasta cuando parar o ejecutar una tarea

            para (parametros) {
                se ejecuta bloque de codigo
            }
            (una variable de control;  una condicion; un incremento o decremento)
         */

        for (int i = 1; i <= 5; i++){
            System.out.println(i + " Hola");
        }
    }
}
