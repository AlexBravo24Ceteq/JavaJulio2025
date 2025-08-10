package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ColeccionesListas {
    public static void main(String[] args) {
        //LISTAS- Son una coleccion de los datos o elementos
        //definida como una sucesion de los mismos
        //Esta coleccion se implementa a travez de la interface List
        //y por medio de un array redimensionable de la clase ARRAYLIST
        //son las mas utilizables y con mejor rendimiento
        //NO GUARDA DATOS DE TIPO PRIMITIVO
        //PERO SI STRING WRAPPER Y ETC
        //Declarar un lista de elementos string
        //Lista - es una interface y ArraList es una clase
        List<String> lista = new ArrayList<String>();
        //EGREGAR VALORES A NUESTRA LISTA
        lista.add("Alfredo"); //Alfredo se guardo en la posicion cero o indice 0.
        lista.add("Carlos");//i-1
        lista.add("Diana");
        lista.add("Yessica");
        lista.add("Daniel");
        lista.add("Alfredo");

        //Imprimir lista en consola
        System.out.println(lista);
        //imprimir o recuperar el valor de un solo valor de la lista
        System.out.println(lista.get(0));//aqui imprime por indice con .get(i);
        //DEVUELVE UN BOOLEANO SI SI EL ELEMENTO EXISTE EN LA LISTA
        System.out.println(lista.contains("Alex"));//devuelve false xq no existe en la lista
        System.out.println(lista.contains("Alfredo"));//devuelve true
        //Devueleve la posicion donde se encuentra al elemento por 1 ra vez
        System.out.println(lista.indexOf("Alfredo"));

        //devuelve l aposicion donde lo encuentra por ultima vez
        System.out.println(lista.lastIndexOf("Alfredo"));

        //Eliminar un elemento de la lista
        lista.remove("Alfredo");
        System.out.println(lista);
        lista.remove(4);
        System.out.println(lista);

        //Añadir elementos a la lista indicando un determinada posicion
        lista.add(2,"Freddy");//Aqui desplaza la posicion 2 ala 3 y asi sucesivamente
        System.out.println(lista);
        //Para reemplazar por otro elemento
        lista.set(0,"Poncho");
        System.out.println(lista);//reeemplaza lo que este en la posisicon cero

        //para recorrer todos los valores de mi lista e imprimirlos en una nueva linea

        for (int i = 0; i < lista.size(); i++) {

            System.out.println(i+ " "+lista.get(i));

        }

        //puedo almacenar varios elementos si paramettrizo mi lista
        //con elementos Objet o si nola parametrizo
        //con esto almacenamos cualquier tipo de dato
        List collecion = new ArrayList<>();

        collecion.add("Nombre"); //tipo string
        collecion.add(23);//tipo int
        collecion.add(3.1416);//tipo double
        collecion.add(true);//tipo boolean
        collecion.add('$');//tipo caracter
        System.out.println(collecion.get(3));



    }
}
