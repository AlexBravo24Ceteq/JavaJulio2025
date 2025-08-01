package com;

public class MetodosString {
    public static void main(String[] args) {
        //metodos de la clase String
        /*
        metodos de la clase string
        la clase string tiene metodos o funciones que nos permitiran manipular cadenas de texto
         */
        String fecha="Hoy es Lunes 28 de Julio de 2025";

        //.length () - Nos devuelve el valor entero del tamaño de nuestra
        //cadena de texto, es decir, cuenta todos los caracteres incluyendo espacios y nos devuelve ese valor
        System.out.println("probando el metodo .length()");
        System.out.println(fecha.length());
        /*
        el metodo .length() me devielve el valor entero, es decir
        si lo necesitara para uso posterior, puedo guardar ese valor
        en una variable de tipo int
         */
        int conteoFecha=fecha.length();//conteoFecha=32;

        /*
        charAt nos devuelve el caracter en la posicion que querramos
         */
        System.out.println("Probando el metodho .charAt() "+fecha.charAt(2));
        /*
        Metodo .substring() nos devuelbe una subcadena de texto apartir de un indice
        especificado.
         */
        System.out.println("Probando el metodo substring() ");
        System.out.println(fecha.substring(4));

        //probando medoto substring() con indice inicial e indice final
        System.out.println("Probando substring() con indices : "+fecha.substring(7,12));

        //toLowerCase convierte la cadena en minusculas
        System.out.println("Probando metodo .toLowerCase() : "+fecha.toLowerCase());
        //toUpperCase() convierte la cadena a mayusculas
        System.out.println("Probando metodo .toUpperCase() : "+fecha.toUpperCase());
        /*
        metodo .equals() compara una cadena de texto con otra y verifica si son iguales
        si si devuelve true si no es false
         */
        System.out.println("Probando metodo .equals() "+fecha.equals("Hoy es Lunes 28 De Julio De 2025"));

        /*
       .equalsIgnoreCase() compara la cadena de texto con otra y verifica si son iguales
       ignorando mayusculas de mayusculas.
         */
        System.out.println("Probandometodo .equalsIgnoreCase() "+fecha.equalsIgnoreCase("Hoy es Lunes 28 De Julio De 2025"));
        /*
        .contains() revisa si una cadena de texto
        contiene un caracter  o coincidencia de caracteres
        devuelve true o false
         */
        System.out.println("Probando .contains() " + fecha.contains("2025"));

        /*
        metodo replace() remplasa un caracter con otro, o secuencia
        de ellos en otra secuencia
         */
        System.out.println("probando medoto replace() "+fecha.replace('o','$'));
        System.out.println("Probando Metodo replace() "+fecha.replace("Lunes","Martes"));
        System.out.println("Probando Metodo replace() "+fecha.replace(" ","-"));
        System.out.println("Probando Metodo replace() "+fecha.replace(" ",""));


    }
}
