package com;

public class TiposDeDatos {

    public static void main (String [] args){
        // comentarios de una sola linea
        //shift + alt + . - aumenta el tamaño fuente
        //shift + alt , - disminuye el tamaño fuente
        /*
        Comentarios de
        multiples lineas
        lalalalalala, aumenta con los enter
         */

        //TIPOS DE DATOS PRIMITIVOS
        //NUMÉRICOS ENTEROS
        //Ejemplo de cómo crear una variable sin valor asignado
        //Primero escribimos el tipo de dato y luego
        //el nombre de la variable

        byte b;

        //Si más adelante quiero guardar un número en la variable b
        //se puede hacer

        b = 100;

        //NUMERICOS EN COMA FLOTANTE
        //SI FUERAN FIJA, COMO VALORES DE DINERO
        //SABEMOS QUE EL DECIMAL FIJO 1111.20


        double pi = 3.1416; //8 bytes de memoria pero no necesitas sufijo
        //preisición doble

        //TIPOS DE DATOS PRIMITIVOS
        //BOOLEANOS
        //CARACTER

        boolean evalua = true; //1 biy y facilita el trtabajo para evaluar
        //expresiones o condiciones. Solo admite true or false

        char letra = 'A';
        char simbolo = '@';
        char valor = 64; //aqui guardamos el simbolo
        //@ pero en su valor ASCII

        /*
        TIPOS DE DATO NO PRIMITIVO
        (ESTRUCTURADOS O TIPO DE DATO OBJETO)
        Datos más complejos, representan estructuras de datos, secuencia
        de ellos, interfaces, clases, etc.
         */

        long resultado = b ; // (100 + )
        b = 50;


        //Cadena de texto
        String nombre = "Cristopher Aguilar";
        String saludo = "Hola Mundo";


        //si queremos crear una constante utilizamos la palabra final
        final byte calificacionMaxima = 10;

        //Dando salida en consola a nuestros resultados

        System.out.print ("Hola Mundo");
        System.out.println(nombre);

        System.out.println(resultado);

        int x = 30;
        int y = 10;

        System.out.println(x+y);

        //Si agregamos un simbolo de + o cadena de texto
        //entramos en concatenación, es decir, todo se interpreta como texto
        //y lo manda a consola
        System.out.println("la suma de x+y es =" + x+y);

        //Si se tiene operación, se tiene que encerrar en parentesis
        //para concatenarla con el texto

        System.out.println("La suma de x+y es =" + (x+y));

        //En java si se requiere concatenar con cadena de texto una operación
        // no es necesario convertirla para mostrar el resultado en consola

        String frase = "la suma de x + y es =" + (x+y);
        System.out.println(frase);

        System.out.println("Hola");
        System.out.println("Se que puedes leer mi mente bart");
        System.out.println("lalaalalala");




    }

}
