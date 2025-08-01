package com;

public class TiposDeDatos {

    public static void main(String[] args) {
        // Comentarios de una sola linea
        // Shift + alt + . - aumenta el tamaño de fuente
        // Shift + alt + , - disminuye el tamaño de fuente (letra)

        /*
        Comentarios de
        multiples lineas
        El comentario va creciendo conforme damos enter o saltos de linea
         */

        // Todo lo que queremos que se ejecute debe escribirse dentro del
        // método main

        // TIPOS DE DATOS PRIMITIVOS

        // NUMÉRICOS ENTEROS

        // Ejemplo de cómo crear una variable sin valor asignado
        // Primero debemos escribir el tipo de dato y posteriormente el
        // nombre de nuestra variable

        byte b;

        // Si mas adelante yo quiero guardar un número en la variable b
        // lo puedo hacer
        b = 100;

        // También podemos crear nuestras variables con su tipo de dato
        // y con su valores guardados desde un inicio

        byte b2 = -128; // 1 byte y va de -128 a 127
        short sh = 32767; // 2 bytes y va de -32768 a 32767 positivio
        int i = 2147483647; // 4 bytes y va de -2147483648 a 2147483647
        // int es el tipo de datos más utilizado para trabajar con enteros
        long largo = 2147483649L; // 8 bytes de memoria y necesita
        // el sufijo de la letra L para admitir valores más allá de los int

        // NUMÉRICOS EN COMA FLOTANTE
        // SI FUERAN COMA FIJA, UN EJEMPLO, VALORES DE DINERO
        // SABEMOS QUE EL DECIMAL ES FIJO 1111.20

        float pulgadas = 2.54F; // 4 bytes de memoria y necesitas el sufijo
        // de la letra F para admitir el valor. Presición simple
        double pi = 3.1416; // 8 bytes de memoria pero no necesita ningun sufijo
        // presición doble

        // TIPOS DE DATOS PRIMITIVOS
        // BOOLEANOS
        // CARACTER

        boolean evalua = false; // 1 bit y facilitan el trabajo para evaluar
        // expresiones o condiciones. Solo admiten valores TRUE o FALSE

        char letra = 'A';
        char simbolo = '@';
        char valor = 64; // Aquí estamos guardando nuevamente el simblo
        // @ pero en su valor ASCII

        /*
        TIPOS DE DATO NO PRIMITIVOS
        (ESTRUCTURADOS O TIPOS DE DATO OBJETO)
        Son datos un poco más complejos, pueden presentar estructuras
        de datps, secuencias de ellos, interfaces, clases, etc
         */

        // Cadena de texto
        String nombre = "Adrian Ventura";
        String saludo = "Hola Mundo";

        // Wrapper o envoltorio
        // Nos permiten brindarles funcionalidades extra a los tipos de dato
        // primitivo
        Byte numero1 = 127;
        Short numero2 = 32767;
        Integer numero3 = 2147483647;
        Long numero4 = 21474836490909L;
        Boolean indicador = true;
        Character otraLetra = 'B';

        // ¿Qué diferencia hay con los primitivos?
        String numeroTexto = numero1.toString(); // Aquí el numero 127 se está convirtiendo en
        // cadena de texto ("127")

        // Ejemplo de como utilizar nuestras variables
        long resultado = b + sh; // (100 + 32767)

        b = 50; // Aquí reemplace el valor que había en b
        sh = 1000; // Aquí reemplace el valor que había en sh

        int resultado2 = b + sh; // (50 + 1000)

        //String resultado = "El resultado es"; no puede haber nombres
        // de variable duplicadas aunque tengan diferente tipo de dato

        // Si queremos crear una constante utilizamos la palabra final
        final byte calificacionMaxima = 10;

        // Dandole salida en consola a nuestros resultados
        System.out.println("Hola Mundo");
        System.out.println(nombre);

        System.out.println(resultado);
        System.out.println(resultado2);

        int x = 10;
        int y = 30;

        System.out.println(x+y);

        System.out.println("La suma de x + y es = " + (x + y));

        // Si agregamos un simbolo de + con una cadena de texto
        // entramos en concatenación, es decir, todo se interpreta como
        // texto y lo manda a imprimir en la consola
        System.out.println("La suma de x + y es = " + x +y);

        // Si tenemos una operacion, hay que encerrarla entre parentesis
        // para concatenarla con el texto
        System.out.println("La suma de x + y es = " + (x + y));

        // Aquí en JAVA si queremos concatenar con una cadena de texto
        // una operación no es necesario convertirla para mostrar el resultado
        // en consola
        String frase = "La suma de x + y es = " + (x + y);

        System.out.println(frase);

        System.out.println("Hola");
        System.out.println("Generacion 175");
        System.out.println("¿Cómo están?");


    }

}
