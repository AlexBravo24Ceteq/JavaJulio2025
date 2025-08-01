package com;

public class TiposDeDatos {
    public static void main(String[] args) {
        //Comentarios de una sola linea
        //Shift + alt +. Aumentar el tamaño de la fuente
        //Shift + alt +, Disminuye el tamaño de la fuente

        /*

        Comentarios de
        multiples lineas
        el comentario va creciendo conforme damos enter o  saltos de linea


         */

        //Todo lo que queremos que se ejecute debe escribirse
        //dentro del metodo Main

        //Tipos de datos primitivos
        //Numericos enteros
        //Ejemplo de como crear una variable sin valor asignado
        //Primero debemos escribir el tipo de dato y posteriormente
        //el nombre de nuestra de nuestra variable

        byte b;

        //si mas adelante yo quiero guardar un numero en la variable b
        //lo puedo hacer
        b = 100;

        //Tambien podemos crear nuestras variables con su tipo de dato
        //y con sus valores guardarlos desde un inicio

        byte b2 = 118; //1 byte y va de -128 a 127
        short sh = 32767; //2 bytes y va  -32768 a 32767 positivo
        int i = 2147483647; //4 bytes y va de -2147483648 a 2147483647
        //int es el tipo de dato mas utilizado para trabajar con enteros
        long largo = 2147483649L; // 8bytes de memoria y necesita
        //el sufijo de la letra L para admitir valos mas alla de los int

        //NUMERICOS EN COMA FLOTANTE
        // SI FUERAN COMA FIJA, UN EJEMPLO, VALORES DE DINERO
        //SABEMOS QUE EL DECIMAL ES FIJO 1111.20

        float pulgadas = 2.54F; //4 bytes de memoria y nesecitan el sufijo
        // de la letra F para admitir el valor
        double pi = 3.1416; //8 bytes de memoria pero no nesecita ningun sufijo

        //Tipos de dato Primitivos
        //Booleanos
        //Caracter
        boolean evalua = true; //1 bit y facilitan el trabajo para evaluar
        //expresiones o condiciones. Solo Admiten valores true o false

        char letra = 'A';
        char simbolo = '@';
        char valor = 64;
        //@ pero en su valor ASCII

        /*
        Tipo de dato No primitivos
        (Estructurados o tipos de dato objeto)
        Son datos un poco mas complejos, pueden representar estructuras
        de datos, secuencias de ellos, interfaces, clases, etc
         */

        //Cadena de texto
        String nombre = "Jorge Alejandro";
        String saludo = "Hola Mundo";

        //Wrapper o envoltorio
        //Nos permiten brindarles funcionalidades extra a los tipos de dato
        //primitivo
        Byte numero1 = -128;
        short numero2 = 32767;
        Integer numero3 = 2147483647;
        Long numero4 = 21474836490909L;
        Boolean indicador = true;
        Character otraLetra = 'B';

        //Que diferencia hay con los Primitivos?
        numero1.toString();//Aqui el numero 127 se esta convirtiendo a
        //cadena de texto ("127")

        //Ej. de como uilizar nuestras variables
        int resultado = b + sh; // (100+32767)
        System.out.println(b);
        b = 50;// aqui reemplace el varo que habia en b
        sh = 1000;// aqui reemplace el valor que habia en sh

        int resultado2 = b + sh; //(50 + 1000)

        //String resultado = "El resultado es";
        //No puede haber nombres de variable duplicadas aunque tengan diferente tipo de dato

        //Si queremos crear una constante utilizamos la palabra final
        final byte calificacionMaxima = 10;
        //Dandole salida en consola a nuestros resultados

        System.out.println("Hola Mundo");
        System.out.println(nombre);
        System.out.println(resultado);
        System.out.println(resultado2);

        int x = 10;
        int y = 30;
        System.out.println(x+y);
        //Si agregamos un simbolo +con una cadena de texto
        //entramos en concatenacion, es decir, todo se interpreta como
        //texto y lo manda a imprimir en la consola
        System.out.println("La suma de x + y es = " + x + y);

        //Si tenemos una operacion, hay que encerrarla entre
        //Parentesis
        //Para concatenar el texto

        System.out.println("La suma de x + y es = " + (x+y));

        //Aqui en java si queremos concatenar con una cadena de texto
        //una operacion no es necesario convertirla para mostrar el resultado
        //en consola
        Integer salida = x+y;
        String frase = "La suma de x + y es = "+ (x+y);
        System.out.println(frase);

        System.out.print("Hola ");
        System.out.print("Generacion 175 ");
        System.out.print("Como Estan?");



    }
}
