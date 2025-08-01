package com;

public class MetodosString {
    public static void main(String[] args) {
        //Metods de la clase String
        //La clase String tiene metodos o funciones que nos
        //Permitiran manipular cadenas de texto

        String fecha = "Hoy es Lunes 28 de Julio de 2025";
        //.length() - Nos devuelve el valor entero el tamaño
        // de nuestra cadena de texto, es decir, cuenta todos los caracteres
        //incluyendo espacios y nos devuelve ese valor
        System.out.println("Probando el metodo .lenfth()");
        System.out.println(fecha.length());
        //El metodo .length me devuelve el valor en entero, es decir
        //si lo necesitara para un uso posterior, puedo guardar ese valor
        // en un variable de tipo int
        int conteopFecha = fecha.length();//conteoFecha = 32

        //.charAt - nos devuelve el cararer que se encuentra en
        //la posicion que indicamos
        System.out.println("Probando el metodo .charAt()");
        System.out.println(fecha.charAt(2));

        //.substring - nos devuelve una subcadena de texto
        // a partir de un indice especificado
        System.out.println("Probando el metodo .substring()");
        System.out.println(fecha.substring(4));

        //.substring - indice inicial e indice final
        System.out.println("Probando el metodo .substring(i, f)");
        System.out.println(fecha.substring(4,20));

        //toLowerCase - convierte la cadena de texto a letras minsuculas
        System.out.println("Probando el metodo .toLowerCase()");
        System.out.println(fecha.toLowerCase());

        //toUpperCase - convierte la cadena de texto a letras mayusculas
        System.out.println("Probando el metodo .toUpperCase()");
        System.out.println(fecha.toUpperCase());

        //.equals - compara un objeto contra otro, en este caso
        //un String contra otro String y devuelve un valor true si
        //sin iguales, si no lo son, devuelve un valor false
        System.out.println("Probando el metodo .equals()");
        System.out.println(fecha.equals("Hoy es Lunes 28 de Julio de 2025"));

        //.equalsIgnoreCase() - compara 2 strings y devuelve true si
        //son iguales en contenido, ignorando el uso de mayusculas y
        //minusculas

        System.out.println("Probando el metodo .equalsIgnoreCase()");
        System.out.println(fecha.equalsIgnoreCase("HOY ES LUNES 28 DE JULIO DE 2025"));

        //.contains - revisa si una cadena de texto contiene
        //un caracter o coincidencia de caracteres
        System.out.println("Probando el metodo .contains()");
        System.out.println(fecha.contains("2025"));

        //replace - reemplaza un caracter con otro
        // o una secuencia de ellos con otra secuencia
        System.out.println("Probando el metodo .replace()");

        System.out.println(fecha.replace("o", "$"));
        System.out.println(fecha.replace("Lunes", "martes"));
        System.out.println(fecha.replace(" ", "_"));
        System.out.println(fecha.replace(" ", ""));



    }
}
