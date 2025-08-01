package com;

public class MetodosString {

    public static void main(String[] args) {

        //Metodos de la clase string , la clase string tiene metodos
        //o funciones que nos permite manipular cadenas de texto
        String joce = "Jocelin";
        String fecha = "Hoy es lunes 28 de julio de 2025";
        System.out.println("Probando el metodo length()");
        System.out.println("la posicion 3 de: "+joce+ " es "+ joce.charAt(3));
        System.out.println(fecha.length());
        System.out.println("El numero de caracteres de joce es: "+joce.length());
        //legth te dice cuantas letras tiene una cadena

        //charAt.- nos devuelve el caracter deseado de acuerdo a su posicion

        System.out.println("Probando el metodo charAt");
        System.out.println("La letra en nuestra cadena fecha en la posicion 2 es: "+fecha.charAt(2));

        //Metodo subString nos devuelve una subcadena de texto
        //apartir de un indice especifico

        System.out.println("Probando el metodo subString()");
        System.out.println("Texto original");
        System.out.println(fecha);
        System.out.println("Texto con subString");
        System.out.println(fecha.substring(4));

        //.subString- indice inicial e indice final
        System.out.println("Probando el metodo subString con indice (i,f)");
        System.out.println(fecha.substring(2,5));//el indice es igual ala posicion

        //toLowerCase- covierte toda a una cadena de texto a letras miniculas

        System.out.println("Probando metodo toLowerCase");
        System.out.println(fecha.toLowerCase());
        System.out.println("Imprimiendo en minusculas: "+ joce.toLowerCase());


        //toUpperCase- Convierte la cadena de texto en letras mayusculas
        System.out.println("Probando metodo toUpperCase");
        System.out.println(fecha.toUpperCase());
        System.out.println("Imprimiendo en minusculas: "+ joce.toUpperCase());



        //.equals.- compara un objeto con otro, en este caso un String con otro
        //y devueleve un valor true si son iguales si no un flase

        System.out.println("Probando el metodo .equals()");
        System.out.println(fecha.equals(("Hoy es martes 29 de julio de 2025")));

        //.equalsIgnoreCase().- compara dos string , devuelve true si son iguales
        //ignora las letras sin son mayusculas y minisculas y false si tines caracteres diferentes

        System.out.println("Probando metodo .equalsIgnoreCase");
        System.out.println(fecha.equalsIgnoreCase("Hoy Es lUnes 28 de Julio de 2025"));

        //.contains.- revisa una cadena de texto si contiene un caracter
        //o considencia de caracteres

        System.out.println("Probando metodo .contains()");
        System.out.println(fecha.contains("2025"));

        //.replace- reemplaza un caracter con otro, o una secuencia con otra

        System.out.println("Probando metodo .replace()");
        System.out.println(fecha.replace("e", "%"));
        System.out.println(fecha.replace("lunes","martes"));
        System.out.println(fecha.replace(" ", "_"));

        String valor1 = "yOcelIn";
        String valor2 = "Jocelin";
        if(valor2.equalsIgnoreCase(valor1)){
            System.out.println("Son iguales ");

        }else{
            System.out.println("No son iguales ");
        }

    }
}
