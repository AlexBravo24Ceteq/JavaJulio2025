package com;

public class TiposDeDatos {

    public static void main(String[] args) {

        //Comentarios de una sola linea
        //shft + alt + fn +.- aumenta el tamaño de fuente
        //shft + alt +  fn + ,- aumenta el tamaño de fuente
        /*
        * Comentarios de multiples lineas
        * */
        //TIPOS DE DATOS PRIMITIVOS

        //EJEMPLO CREAR UNA VARIABLE SIN VALOR ASIGNADO
        //ESCRIBIMOS EL TIPO DE DATOS Y DESPUES EL NOMBRE DE LA VARIABLE

        byte b;
        //Aqui ya le asignamos un valor
        b = 100;

        //y creamo suna variable con valor asignado

        byte b2 = -128; //1 byte va de -128 a 127
        short sh = 32767 ; // 2 bytes va de -32767 a 32767
        int i = 2147483647; // de 4 bytes
        //El tipo de dato int es el mas utlizado para valores enteros
        long lg = 2147483649L; // de 8 bytes y utiliza el sufijo de la letra L

        float pulgada = 2.54F; // 4 bytes y utliza el sufijo F
        double db = 3.1416; //8 bytes y le hasta 15 digitos del punto decimal

        boolean bl = true;
        boolean bl2 = false;// 1 byte facilitan el trabajo para evaluar las expresiones o condiciones
        //solo admiten valores true o flase

        char letra = 'A';//
        char simbolo = '@';
        char valor = 64; //aqui se guarda nuevamente el valor de @ pero en su valor ASCCI

        //TIPOS DE DATOS NO PRIMITIVOSS

        //GUARGAN DATOS DE TIPOS CARACTERES Y DE TIPO CADENA DE TEXTO
        String nombre = "ALFREDO";
        String saludo = "Hola mundo";

        //Wrapper o envoltorio
        //Permiten brindarles funcionalidades  extra a los tipos de datos primitivos

        final int calificasionMaxima = 10;
        //con final declaramos una constante

        System.out.println();




    }
}
