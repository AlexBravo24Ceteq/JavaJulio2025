package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {
    public static void main(String[] args) {
        /* Listas - Son coleccion de datos o elementos
        definida como una sucesion de los mismo.
        Esta coleccion se implemente a través de la interface List y
        por medio de un array redimencionable de la clase ArrayList

        Si admiten valores duplicados, es de las colecciones mas
        utilizadas y con mejor rendimiento.
        No podemos guardar tipos de dato primitivo pero si datos de tipo
        Objeto (String, Wrapp, etc)
         */

        //Declarar lista
        List<String> lista = new ArrayList<String>();

        //agregar elementos a lista
        lista.add("Adriana");
        lista.add("Carlos");
        lista.add("Sarahi");
        lista.add("Alberto");
        lista.add("Gabriela");
        lista.add("Alberto");

        //imprimir lista en consola
        System.out.println(lista);
        //recuperar un solo nombre
        System.out.println(lista.get(2));

        //devuelve si existe un valor de la lista
        System.out.println(lista.contains("Gabriela"));

        //donde se encuentra el elemento por primera vez
        System.out.println(lista.indexOf("Alberto"));

        //donde se encuentra el elemento por ultima vez
        System.out.println(lista.lastIndexOf("Alberto"));

        //eliminar elemento de la lista
        //lista.remove("Alberto");
        lista.remove(5);
        System.out.println(lista);

        //añadir elementos a la lista, indicando determinado posicion
        lista.add(2, "Celso");
        System.out.println(lista);

        //reemplazar valor de determinada posicion
        lista.set(3, "Sandy");
        System.out.println(lista);

        /*recorrer o recuperar todos los valores de mi lista
        e imprimirlos en una nueva lista          */
        for (int i= 0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }

        /* puedo almacenar varios elementos si parametrizo mi lista
        con elementos Object o si no la parametrizo          */
        List coleccion = new ArrayList();

        coleccion.add("Nombre");
        coleccion.add(23);
        coleccion.add(3.1416);
        coleccion.add(true);
        coleccion.add('$');

        System.out.println(coleccion.get(2));
    }
}
