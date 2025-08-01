package com;

public class MetodosString {

    public static void main(String[] args) {

        // Métodos de la clase String
        // La clase String tiene métodos o funciones que nos
        // permitirán manipular cadenas de texto

        String fecha = "Hoy es Lunes 28 de Julio de 2025";

        // .length () - Nos devuelve en valor entero el tamaño de nuestra
        // cadena de texto, es decir, cuenta todos los carácteres incluyendo
        // espacios y nos devuelve ese valor
        System.out.println("Probando el método .length()");
        System.out.println(fecha.length());
        // El métoddo .length me devuelve el valor en entero, es decir,
        // si lo necesitara para un uso posterior, puedo guardar ese valor
        // en una variable de tipo int
        int conteoFecha = fecha.length();  // conteoFecha=32;

        // .charAT - Nos devuelve el caracter que se encuentra en la
        // posición que indicamos
        System.out.println("Probando el método .charAt()");
        System.out.println(fecha.charAt(2));

        // .substring - nos devuelve una subcadena de texto
        // apartir de un indice especificado
        System.out.println("Probando el método .substring()");
        System.out.println(fecha.substring(4));

        // .substring - indice incial e indice final
        System.out.println("Probando el método .substring(i, f)");
        System.out.println(fecha.substring(4,10));

        // .toLowerCase - convierte la cadena de texto a letras minisculas
        System.out.println("Probando el método .toLowerCase()");
        System.out.println(fecha.toLowerCase());

        // .toUpperCase - Convierte la cadena de texto a letras mayusculas
        System.out.println("Probando el método .toUpperCase()");
        System.out.println(fecha.toUpperCase());

        // .equals - compara un objeto contra otro, en este caso
        // un String contra otro String y devuelve un valor true si
        // son igual, si no lo son, devuelve un valor false
        System.out.println("Probando el método .equals()");
        System.out.println(fecha.equals("Hoy Es Lunes 28 De Julio De 2025"));

        // .equalsIgnoreCase() - compara 2 strings y devuelve true si
        // son iguales en contenido, ignorando el uso de mayusculas y
        // minusculas
        System.out.println("Probando el método .equalsIgnoreCase()");
        System.out.println(fecha.equalsIgnoreCase("Hoy Es Lunes 28 De Julio De 2025"));

        // .contains - revisa si una cadena de texto contiene un caracter
        // o coincidencia de caracteres
        System.out.println("Probando el método .contains()");
        System.out.println(fecha.contains("2025"));

        // .replace - reemplaza un caracter con otro, o una secuencia
        // de ellos con otra secuencia
        System.out.println("Probando el método .replace()");
        System.out.println(fecha.replace("o", "$"));
        System.out.println(fecha.replace("Lunes", "Martes"));
        System.out.println(fecha.replace(" ", "-"));
        System.out.println(fecha.replace(" ", ""));



    }

}
