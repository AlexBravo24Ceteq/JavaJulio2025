package com;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {
    public static void main(String[] args) {

        //Listas- coleccion de datos o elementos, definida como uan sucecion de los mismos.
        // Esta se implementa por la interface List y por medio de un array redimensionable de la clase
        //ArrayList
        //Estas admiten valores dups, es de las más usadas y con mejor rendimiento. No puedes guardar datos
        //primitivos, pero si de tipo Objeto (String, Wrapper, etc).

        //Declaramos una lista de elemntos
        List<String >lista= new ArrayList<String>(); //Pregunta de entrevista -> List es una interface y
                                                        // arrayList es una clase
        //Agregaremos elementos a nuestra lista.
        lista.add("Adriana"); //Se agrega en pos 0
        lista.add("Carlos");
        lista.add("Sarahi");
        lista.add("Alberto");
        lista.add("Gabriel");
        lista.add("Alberto");


        //Si queremos imprimir la lista en consola hacemos el print

        System.out.println(lista);

        //Pero si queremos recuperar un solo elemento:

        System.out.println(lista.get(2)); //donde el "2", es el index, la pos donde esta el dato
        System.out.println(lista.get(0));

        //Devuelve un valor booleano si el elemento existe igualmente.
        System.out.println(lista.contains("Mari"));
        System.out.println(lista.contains("Carlos"));

        //Ahora para devolver la pos donde esta el elemento por primera vez hacemos:
        System.out.println(lista.indexOf("Alberto"));

        //Ahora para devolver la pos donde esta el elemento por última vez hacemos:
        System.out.println(lista.lastIndexOf("Gabriel"));

        //Tenemos el remove para eliminar
        lista.remove("Alberto"); //Hay dos opciones, nombre o el index
        System.out.println(lista);

        //Para añadir elementos a la lista es con add, pero si queremos una posición especifica
        lista.add(3, "Richi");
        System.out.println(lista);

        //Para reemplazar hacemos
        lista.set(4, "Sandra");
        System.out.println(lista);

        //Para recorrer todos los valores e imprimerlos en una nueva linea

        for (int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));

        } //Podemos almacenar varios elementos si parametrizo la lista con objetos object o si no.
        List<Object> coleccion = new ArrayList<Object>();

        coleccion.add(23);
        coleccion.add("Nombre");
        coleccion.add(3.1416);
        coleccion.add(true);
        coleccion.add('$');

        System.out.println(coleccion.get(3));

    }
}
