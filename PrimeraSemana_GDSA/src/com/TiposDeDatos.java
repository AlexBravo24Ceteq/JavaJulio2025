package com;

public class TiposDeDatos {

    public static void main(String[] args) {
        //comentarios de una sola linea
        //shift+alt+. aunenta tamaño de fuente
        //shift+alt+, disminuye tamaño de fuente
        /*
        comentarios de multiples lineas
        :)
         */
        // TIPOS DE DATOS PRIMITIVOS
        // NUMERICOS ENTEROS
        //declaracion de variable vacia
        byte b;
        //uso mas adelante de la bariable declarada
        b = 100;
        //declaracion de variable con valor inicial
        byte b2=-128; //1 byte y va de -128 a 127
        short sh=32767;// 2 bytes y va de -32768 a 32767 positivo
        int i = 2147483647;//4 bytes y va de -2147483648 a 2147483647
        // int es el tipo de dato mas usado para trabajar enteros
        long largo= 2147483649L; // 8 bytes de memoria y necesita subfijo L
        //para admitir valores mas alla de los int.

        // NUMEROICOS EN COMA FLOTANTE
        // SI FUERAN COMA FIJA, UN EJEMPLO,VALORES DE DINERO
        //SABEMOS QUE EL DECIMAL ES FIJO 1111.20
        //OMA FLOTANTE POR QUE EL DECIMAL SE DESPLAZA
        float pulgadas=2.56518513514F;//igual que long lleva un subfijo f o F
        //4 bytes de memoria su precision es de 6 a 7 digitos, presicion simple
        double pi = 3.1416;//8 bytes de memoria pero no necesita ningun subfijo
        //su precision es de 15 digitos presicion doble

        //DATOS PRIMITIVOS
        //BOLEANOS
        //CARACTER
        boolean evalua= true; //1 bit y facilitan el trabajo para evaluar expresiones
        //o condiciones solo admiten valores true o false.
        char letra = 'A';
        char simbolo = '@';
        char valor=64;//valor de la tabla assci solo guarda 1 caracter
        /*
        TIPOS DE DATO NO PRIMITIVOS
        (ESTRUCTURADOS O TIPOS DE DATO OBJETO
        son datos un poco mas complejos, pueden representar estructuras de datos, sentencias de ellos, interfaces
        etc.
         */
        //cadenas de texto
        String Nombre= "Gerardo Daniel Solis Aguilar";
        String saludo = "Hola Mundo";

        //Wrapper o Envoltorio
        /*
        permiten brindar funcionabilidad extra a los tipos de datos primitivos
         */
        Byte numero1= 127;
        Short numero2=32767;
        Integer numero3=214756545;
        Long numero4=2145555284845196L;
        Boolean indicador=true;
        Character otraletra='B';

        //que diferencia hay ?
        String numeroTexto = numero1.toString();//se esta convirtiendo en cadena de texto
        //cadena de texto seria ("127")
        int resultado= b+sh;//(100+32767)
        System.out.println(resultado);
        b = 50;
        sh=1000;
        int resultado2=b+sh;//(50+1000)

        // String resultado="Hola"; no puede haber variables declaradas con el mismo nombre
        //para crear constantes
        final byte calificacionMaxima=10;

        //dandole salida en consola a nuestros resultados
        System.out.println("Hola Mundo");
        System.out.println(Nombre);
        System.out.println(resultado);
        System.out.println(resultado2);

        int x = 10;
        int y = 30;
        System.out.println(x+y);
        System.out.println("la suma de x + y es = "+x+y);//concatena todo e interpreta como texto.
        System.out.println("la suma de x + y es = "+(x+y));//si hay operacion se engloba entre parentesis
        //para concatenar con texto y realize la operacion.

        /*
        aqui en hava si queremos concatenar con una cadena de texto con
        una opereacion no es necesario convertirla para mostrar el resultado en consola
         */
        String frase = "la suma de x+y es = " + (x+y);
        System.out.println(frase);
        System.out.print("hola");
        System.out.print(" Generacion 175");
        System.out.print(" ¿Como Estan?");


    }
}
