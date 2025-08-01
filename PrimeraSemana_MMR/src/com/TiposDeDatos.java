package com;

import java.sql.SQLOutput;

public class TiposDeDatos {
    public static void main(String[] args) {
        //comentarios de una sola linea
        /* comentarios de
         mas lineas
         */

        //todo lo que se ejecute debe escribirse dentro del metodo main

        //TIPOS DE DATOS PRIMITIVOS
        //NUMERICOS ENTEROS
        //declaración de variable en estructura (TipoDeDato - nombreVariable)
        byte b;

        //asignación de valor a variable
        b = 100;

        //declaración e inicialización de variables
        byte b2 = -128; //1 byte y va de -128 a 127
        short sh = 32767; //2 bytes y va de -32768 a 32767
        int i = 2147483647; //4 bytes de -2147483648 - dato mas usado en empresas

        long largo = 2147483649L; /* 8 bytes de memoria y necesita
         el sufijo de la letra L para dmitir valores mas grandes que los INT */

        //NUMERICOS EN COMA FLOTANTE
        //SI FUERAN COMA FIJA, EJEMPLO, VALORES DE DINERO
        //SABEMOS QUE EL DECIMAL ES FIJO 1111.20

        float pulgadas = 2.54F; /* 4 bytes de memoria y necesitan sufijo de la F para que se admita
            presicion simple */
        double pi = 3.1416; /* 8 bytes de memoria pero no necesita ningun sufijo
            presicion doble */

        //BOLEANOS
        //CARACTER

        boolean evalua = false; /* 1 bit y facilitan el trabajo para evaluar
        expresiones o condiciones. Solo admiten valores true o false */

        char letra = 'A';
        char simbolo = '@';
        char valor = 64; /* el simbolo @ en su simbolo ASCII */

        /* TIPOS DE DATO NO PRIMITIVOS (ESTRUCTURADOS O TIPOS DE DATO OBJETO)
         Son datos  un poco más complejos, pueden representar estructuras de
         datos, secuencias de ellos, interfaces, clases, etc
         */

        //Cadenas de texto
        String nombre = "Jorge Alejandro";
        String saludo = "Hola Mundo";

        //Wrapper o envoltorio
        //Nos permiten brindarles funcionalidades extra a los tipos de datos
        //primitivo
        Byte numero1 = 127;
        Short numero2 = 32767;
        Integer  numero3 = 2147483647;
        Long numero4 = 214748367463486349L;
        Boolean indicador = true;
        Character otraLetra = 'B';

        //¿Diferencia de los primitivos?
        String numeroTexto = numero1.toString(); //aqui el numero 127 se convierte a cadena

        //Ej. Como utilizar variables
        int resultado = b + sh; //(100 + 32767)

        b = 50;  //Se reemplaza el valor de b
        sh = 1000; //Se remplaza el valor de sh

        int resultado2 = b + sh; // (50 + 1000);

        //String resultado = "El resultado es ";
        //los nombres de variable no se pueden duplicar sin importar el tipo de dato

        //para las CONSTANTES se utiliza la palabra final
        final byte calificacionMaxima = 10;


        //Dando salida en consola a nuestros resultados
        System.out.println("Hola Mundo");
        System.out.println(nombre);

        System.out.println(resultado);
        System.out.println(resultado2);

        int x = 10;
        int y = 30;

        System.out.println(x+y);
        /* si se agrega una cadena concatenada con dos numeros, su salida es una
        cadena de texto de numeros sin operacion
          --La suma de x + y es = 1030
         */
        System.out.println("La suma de x + y es = "+ x + y);

        /* Si se tiene operacion, se encierra entre parentesis para concatenar con texto
        esto con el fin de que se realice la operacion
          --La suma de x + y es = 40
        */
        System.out.println("La suma de x + y es = "+ (x + y));

        //Nota: en java no es necesaria la conversion de variables a cadena para poder concatenarse

        //System.out.println    Salida en consola con salto de linea
        //System.out.print      Salida en consola sin salto de linea
    }
}
