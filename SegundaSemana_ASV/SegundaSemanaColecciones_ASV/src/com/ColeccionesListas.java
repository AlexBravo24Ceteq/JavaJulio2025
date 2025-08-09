package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ColeccionesListas {
    public static void main(String[] args) {

        //Listas - Son una coleccion de datos o elementos
        //definida como una susecion de los mismos
        //Esta coleccion se implementa a traves de la interface List
        //y por medio de un array redimensionable de la clase
        //ArrayList
        //Las listas si admiten valores duplicados, es de las colecciones
        //mas utilizadas y con mejor rendimiento
        //no podemos guardar tipos de dato primitivo
        //Pero si datos de tipo objeto (String, Wrapper, etc)

        //Declarar una lista de elementos de tipo String
        List<String> lista = new ArrayList<String>();

        //Agregar elementos a nuestra lista
        lista.add("Miguel");
        lista.add("Isabel");
        lista.add("Katty");
        lista.add("Fernando");
        lista.add("Alvaro");
        lista.add("Fernando");

        //Imprimir una lista en consola
        System.out.println(lista);

        //Imprimir o recuperar el valor de un solo elemento de la lista
        System.out.println(lista.get(2));

        //Devuelva un valor booleano si el elemento existe en la lista
        System.out.println(lista.contains("Alvaro"));

        //Devuelve la posicion donde se encuentra al elemento
        //por primera vez

        System.out.println(lista.indexOf("Fernando"));


        //Devuelve la ultima posicion donde encuentra el elemento
        System.out.println(lista.lastIndexOf("Fernando"));

        //Eliminar un elemento de mi lista
        lista.remove(5);
        System.out.println(lista);

        //Añadir elementos a la lista, indicando una determinada posicion
        lista.add(2, "Sergio"); //Se agrega el elemento y desplaza las posiciones
        //No reemplaza el el elemento del indice indicado
        System.out.println(lista);

        //Reemplazar el valor de una determinada posicion
        lista.set(3, "Pablo");
        System.out.println(lista);

        //Recorrer o recuperar todos los valores de mi lista
        //e imprimirlos en una nueva linea

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }

        //Puedo almacenar varios elementos si parametrizo mi lista
        //con elementos Object o si no la parametrizo

        List coleccion = new ArrayList();
        coleccion.add("Nombre");
        coleccion.add(23);
        coleccion.add(3.1416);
        coleccion.add(true);
        coleccion.add("$");

        System.out.println(coleccion.get(2));


    }
}
