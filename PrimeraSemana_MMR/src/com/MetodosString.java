package com;

public class MetodosString {
    public static void main(String[] args) {
        //Métodos de la clase String
        /* La clase String tiene métodos o funciones que nos permitiran
        manipular cadenas de texto          */

        String fecha = "Hoy es lunes 28 de Julio de 2025";

        /* .length () - Cantidad de caracteres de una cadena
           devuelve un entero que se puede almacenar en una variable entera         */
        System.out.println("Metodo .length()");
        System.out.println(fecha.length());

        /* .charAt - nos devuelve el caracter que encuentra en la posicion
           que indicamos          */
        System.out.println("Metodo .charAt()");
        System.out.println(fecha.charAt(2));

        /*.substring - nos devuelve una subcadena de texto a partir de
        un indice especifico          */
        System.out.println("Metodo .substring()");
        System.out.println(fecha.substring(4));
        /* substring de un rango de indices - indiceIni - IndiceFin */
        System.out.println("Metodo .substring(i, f)");
        System.out.println(fecha.substring(4,10));

        //.toLowerCase - convierte cadena de texto a letras minusculas
        System.out.println("Metodo .toLowerCase()");
        System.out.println(fecha.toLowerCase());

        //.toUpperCase - convierte cadena de texto a letras mayusculas
        System.out.println("Metodo .toUpperCase()");
        System.out.println(fecha.toUpperCase());

        /*.equals - compara un objeto contra otro, en este caso un
        String contra otro String y devuelve un valor boleano         */
        System.out.println("Metodo .equals()");
        System.out.println(fecha.equals("Hoy es Lunes 28 de Julio de 2025"));

        /*.equalsIgnoreCase() - Compara 2 Strings y devuelve true si son iguales
        en contenido, ignorando el uso de mayusculas y minusculas  */
        System.out.println("Metodo .equalsIgnoreCase()");
        System.out.println(fecha.equalsIgnoreCase("Hoy es Lunes 28 de Julio de 2025"));

        /*.contais - revisa si una cadena de texto contiene un caracter
        o coincidencia de caracteres          */
        System.out.println("Metodo .contais()");
        System.out.println(fecha.contains("2025"));

        /*.replace - reemplaza un caracter con otro, o una secuencia
            de ellos con otra secuencia         */
        System.out.println("Metodo .replace()");
        System.out.println(fecha.replace("o", "$"));
        System.out.println(fecha.replace("lunes", "martes"));
        System.out.println(fecha.replace(" ", "-"));


    }
}
