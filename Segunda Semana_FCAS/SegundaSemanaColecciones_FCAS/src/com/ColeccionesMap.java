package com;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {
    public static void main(String[] args) {
        //La interfaz Map, asocia o almacena los datos en pares (clave - valor de almacen), como una tabla
        //No se pueden repetir/duplicar. Osea es un identificador unico para cada elemento almacenado

        //Declaración de un map y un HashMap para almacenar Integer y String (Wrappers)

        Map<Integer, String> usuarios = new HashMap<Integer, String>();
        //Agregamos elementos al HashMap
        usuarios.put(1, "Anahí");
        usuarios.put(3, "Karla");
        usuarios.put(6, "Pedro");
        usuarios.put(4, "Lidia");

        //Imprimimos
        System.out.println(usuarios);
        //Imprimimos un solo valor con clave
        System.out.println(usuarios.get(3));

        //Eliminamos elemento
        usuarios.remove(6);
        System.out.println(usuarios);

        //Imprimir solo llaves
        System.out.println(usuarios.keySet());

        //Imprimimos en consola valores contenidos en HashMap
        System.out.println(usuarios.values());

        //Imprimimos cada llave con ciclo for each
        for (Integer i: usuarios.keySet()) {
            System.out.println(i);
        }

        //Imprimimos cada valor con ciclo for each
        for (String i: usuarios.values()) {
            System.out.println(i);
        }

        //Imprimir llaves y valores
        for (Integer i: usuarios.keySet()) {
            System.out.println("Llave: " + i + " Valor: " + usuarios.get(i));
        }

    }
}
