package com;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {
    public static void main(String[] args) {
        /* La interface Map asocia o almacena los datos en pares (clave - valor a alamecanr)
        Las claves no pueden duplicarse

        Es decir, la clave es un identificador unico para cada elemento

        Declaracion de un Map y la clase HashMap para almacenar claves integer y elementos
        tipo String         */

        Map<Integer, String> usuarios = new HashMap<Integer, String>();
        //Agregar elemento a HashMap
        usuarios.put(1, "Angel");
        usuarios.put(3, "Karla");
        usuarios.put(2, "Pedro");

        //Imprimir HashMap en consola
        System.out.println(usuarios);

        //Imprimir un solo valor almacenado en determinada clave
        System.out.println(usuarios.get(2));

        //Eliminar elemento
        usuarios.remove(3);
        System.out.println(usuarios);

        //imprimir en cosola las llaves del hashmap
        System.out.println(usuarios.keySet());

        //imprimir en consola los valores en mi hashMap
        System.out.println(usuarios.values());

        //Imprimir las llaves en un ciclo
        //for each
        for (Integer i: usuarios.keySet()){ //llaves
            System.out.println(i);
        }
        for (String i: usuarios.values()){  //valores
            System.out.println(i);
        }
        //imprimir llaves y valores
        for (Integer i: usuarios.keySet()){
            System.out.println("Llave: " + i + " Valor "+ usuarios.get(i));
        }


    }
}
