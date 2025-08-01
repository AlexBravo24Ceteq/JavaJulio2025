package com;

public class MetodosString {
    public static void  main(String [] args) {

        //Métodos de la clase string
        //Esta clase tiene métodos o funciones que nos permiten manipular cadenas de texto

        String fecha = "Hoy es Lunes 28 de Julio de 2025";

        //.length () - Nos devuelve en valor entero el tamaño de nuestra cadena de texto
        //Osea que cuenta todos los caracteres incluyendo espacios y nos devuelve el valor

        System.out.println("Probando el método .lenght()");
        System.out.println(fecha.length());
        //El método . length me devuelve el valor en entero, es decir
        //Si lo necesitara para uso posterior, puedes guardar el valor en una variable int
        int conteoFecha = fecha.length(); // conteoFecha=32;

        /*
        Char es solo un caracter a la vez, pero string es una secuencia de los mismos
        El comando .charAt (x) me da el caracter posicionado en "x" iniciando desde "0"
         */
        System.out.println("Probando el método .charAt");
        System.out.println(fecha.charAt(2));

        //METODO-> .substring - nos devuelve una subcadena de texto a partir de un indice indicado
        //El mismo metodo tiene 2 formas de ejecución, indice inicial e indice final
        System.out.println("Probando método .substring()");
        System.out.println(fecha.substring(4));

        System.out.println("Probando método .substring(i,f)");
        System.out.println(fecha.substring(4,10));

        //.toLowerCase - Convierte la cadena de texto a minusculas

        System.out.println("Probando el método .toLowerCase()");
        System.out.println(fecha.toLowerCase());

        //.toUpperCase - convierte la cadena a mayusculas
        System.out.println("Probando el método .toUpperCase()");
        System.out.println(fecha.toUpperCase());

        //.equals -> compara un objeto con otro, en el caso, String contra otro String
        //y devuelve un valor true si son iguales, si no, devuelve un false

        System.out.println("Probando el método .equals()");
        System.out.println(fecha.equals("Hoy es Martes 29 de Julio de 2025"));
        System.out.println(fecha.equals("Hoy es Lunes 28 de Julio de 2025"));
        //También .equals es sensible a mayusculas y minusculas
        System.out.println(fecha.equals("Hoy Es Lunes 28 De Julio De 2025"));

        //.equalsIgnoreCase() -> compara 2 strings y devuelve true si son iguales
        //en contenido, ignorando si son mayusculas o minusculas
        System.out.println("Probando el método .equalsIgnoreCase()");
        System.out.println(fecha.equalsIgnoreCase("Hoy Es Lunes 28 De Julio De 2025"));

        //.contains -> revisa si una cadena de texto contiene un caracter o coincidencia de
        //igualmente en true o false
        System.out.println("Probando el método .contains()");
        System.out.println(fecha.contains("y"));
        System.out.println(fecha.contains("2025"));

        //.replace-> reemplaza un caracter con otro, o una secuencia de ellos con otra
        //Incluye los espacios
        System.out.println("Probando el método .replace()");
        System.out.println(fecha.replace("o","$"));
        System.out.println(fecha.replace("Lunes","Martes"));
        System.out.println(fecha.replace(" ","-"));
        System.out.println(fecha.replace(" ",""));

    }
}
