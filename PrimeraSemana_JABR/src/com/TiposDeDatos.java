package com;

public class TiposDeDatos {

    public static void main(String[] args) {
        // Comentarios de una sola linea
        //shift + alt + . - aumenta el tamaño de fuente
        //shift + alt + , - disminuye el tamaño de fuente (letra)

        /*
        Comentarios de
        multiples lineas
        El comentario va creciendo conforme damos enter o saltos de linea
         */

        //Todo lo que queremos que se ejecute debe escribirse dentro del
        //método main

        //TIPOS DE DATOS PRIMITIVOS

        //NUMÉRICOS ENTEROS

        //Ejemplo de cómo crear una variable sin valor asignado
        //Primero debemos escribir el tipo de dato y posteriormente el
        //nombre de nuestra variable

        byte b;

        //Si más adelante yo quiero guardar un número en la variable b
        //lo puedo hacer
        b = 100;

        //También podemos crear nuestras variables con su tipo de dato
        //y con sus valores guardados desde un inicio

        byte b2 = -128; //1 byte y va de -128 a 127
        short sh = 32767; //2 bytes y va de -32768 a 32767 positivo
        int i = 2147483647; //4 bytes y va de -2147483648 a 2147483647
        // int es el tipo de dato más utilizado para trabajar con enteros
        long largo = 2147483649L; //8 bytes de memoria y necesita
        //el sufijo de la letra L para admitir valores más alla de los int

        //NUMERICOS EN COMA FLOTANTE
        //SI FUERAN COMA FIJA, UN EJEMPLO, VALORES DE DINERO
        // SABEMOS QUE EL DECIMAL ES FIJO 1111.20

        float pulgadas = 2.5412882348293480928490F; //4 bytes de memoria y necesitan el sufijo
        //de la letra F para admitir el valor. Presicion simple
        double pi = 3.1416; //8 bytes de memoria pero no necesita ningun sufijo
        // presicion doble

        //TIPOS DE DATO PRIMITIVOS
        //BOOLEANOS
        //CARACTER

        boolean evalua = false; //1 bit y facilitan el trabajo para evaluar
        //expresiones o condiciones. Solo admiten valores true o false

        char letra = 'A';
        char simbolo = '@';
        char valor = 64; //aqui estamos guardando nuevamente el simbolo
        //@ pero en su valor ASCII

        /*
        TIPOS DE DATO NO PRIMITIVOS
        (ESTRUCTURADOS O TIPOS DE DATO OBJETO)
        Son datos un poco más complejos, pueden representar estructuras
        de datos, secuencias de ellos, interfaces, clases, etc
         */

        //Cadena de texto
        String nombre = "Jorge Alejandro";
        String saludo = "Hola Mundo";

        //Wrapper o envoltorio
        //Nos permiten brindarles funcionalidades extra a los tipos de dato
        //primitivo
        Byte numero1 = 127;
        Short numero2 = 32767;
        Integer numero3 = 2147483647;
        Long numero4 = 21474836490909L;
        Boolean indicador = true;
        Character otraLetra = 'B';

        //¿Qué diferencia hay con los primitivos?
      String numeroTexto = numero1.toString(); //aqui el numero 127 se esta convirtiendo en
        //cadena de texto ("127")

        //Ej. de como utilizar nuestra variables
        long resultado = b + sh; // (100 + 32767)
        System.out.println(b);
        b = 50; // aqui reemplace el valor que habia en b
        sh = 1000; //aqui reemplace el valor que habia en sh

        int resultado2 = b + sh; // (50 + 1000)

        //String resultado = "El resultado es "; no puede haber nombres
        //de variable duplicadas aunque tengan diferente tipo de dato

        //si queremos crear una constante utilizamos la palabra final
        final byte calificacionMaxima = 10;

        //Dandole salida en consola a nuestros resultados
        System.out.println("Hola Mundo");
        System.out.println(nombre);

        System.out.println(resultado);
        System.out.println(resultado2);

        int x = 10;
        int y = 30;

        System.out.println(x+y);

        //Si agregamos un simbolo de + con una cadena de texto
        //entramos en concatenación, es decir, todo se interpreta como
        //texto y lo manda a imprimir en la consola
        System.out.println("La suma de x + y es = " + x + y);

        //Si tenemos una operacion, hay que encerrarla entre parentesis
        //para concatenarla con el texto
        System.out.println("La suma de x + y es = " + (x + y));

        //Aqui en Java si queremos concatenar con una cadena de texto
        //una operacion no es necesario convertirla para mostrar el resultado
        //en consola

        String frase = "La suma de x + y es = " + (x+y);

        System.out.println(frase);

        System.out.println("Hola");
        System.out.println(" Generacion 175");
        System.out.println("¿Cómo estan?");


    }


}
