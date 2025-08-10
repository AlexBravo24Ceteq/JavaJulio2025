package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {
    public static void main(String[] args) {

        //La interfaz map asocia o almacena los datos
        //en pares ( clave-valor a almacenar)
        //Las claves no puedes duplicarse
        //la clave actua como un identificador unico para cada elemento (id)

        //Declaracion de Map y HashMap

        Map<Integer,String> usuarios = new HashMap<Integer,String>();
         //AGREGAMOS ELEMENTO A NUESTRO HASHMAP
        usuarios.put(1,"Alfredo");
        usuarios.put(2,"Karla");
        usuarios.put(3,"Manzon");
        usuarios.put(4,"Lupillo");
        System.out.println(usuarios);
        //Imprimir en una nueva lista
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios);

        }
        //IMprimir el valor de una determinada clave
        System.out.println(usuarios.get(3));

        //Eliminar una elemento de nuestro hash map

        usuarios.remove(3);
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios);
        }
        //MANDAR A IMPRIMIR EN CONSOLA SOLO LAS LLAVES DE MI HASHMAP
        System.out.println(usuarios.keySet());

        //Imprimir los valores de mi hahsmap

        System.out.println(usuarios.values());
        
        //Mandar a imprimir con un foreach

        for (Integer i : usuarios.keySet()) {
            System.out.println(i);


        }
        for (String i : usuarios.values()) {
            System.out.println(i);

        }
        //Para inprimir valores y claves en una sola lina sera igual a
        for (Integer i : usuarios.keySet()) {
            System.out.println("Lave : "+i+ " valor: "+ usuarios.get(1));
        }

    }
}
