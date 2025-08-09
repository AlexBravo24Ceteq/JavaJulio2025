package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        //API stream - Funcionalidad a partir de Java 8
        //Que nos va a permitir gestionar de una forma mas
        //rapida e imperativaa la informacion que tengamos
        //en nuestras colecciones de datos
        //Las colecciones se vuelven un flujo de datos a partir
        //del cual podemos solicitar la informacion que necesitemos

        //Ejemplo de el uso de Stream
        Stream<String> nombres = Stream.of("Carlos", "Frida", "Abraham", "Diego").filter(item -> item.contains("i"));

        //Una vez filtramos la informacion la llevo hacia una lista
        List<String> names = nombres.collect(Collectors.toList());

        //Mostrar los resultados en consola
        //System.out.println(names);

        //Declaramos una lista para guardar a nuestros
        //Objetos Persona
        List<Persona> original = new ArrayList<Persona>();

        //Creamos una lista para recolectar la informacion filtrada
        List<Persona> filtrada = new ArrayList<Persona>();

        //Añadir elementos a mi lista original
        original.add(new Persona("Jorge", "MASCULINO", 24));
        original.add(new Persona("Julia", "FEMENINO", 19));
        original.add(new Persona("Marco", "MASCULINO", 34));
        original.add(new Persona("Montserrat", "FEMENINO", 27));
        original.add(new Persona("Erick", "MASCULINO", 20));
        original.add(new Persona("Dulce", "FEMENINO", 23));
        original.add(new Persona("Pablo", "MASCULINO", 18));
        original.add(new Persona("Luis", "MASCULINO", 28));
        original.add(new Persona("Fernanda", "FEMENINO", 22));

        //Imprimir la lista original en consola
        //System.out.println(original);

        //Recorrer nuestra lista para ver cada elemento con un ciclo for

        /*
        for (int i = 0; i < original.size(); i++) {
            System.out.println(original.get(i));

        }

         */

        //Recuperar todos los elementos con el ciclo
        //forEach
        /*
        for(Persona i:original){
            System.out.println(i);
        }

         */

        //forEach pero ahora a traves de nuestra lista
        //original.forEach(a -> System.out.println(a));

        //Si filtraramos a los elementos del genero masculino
        //con un ciclo convencional
        /*
        for (Persona i: original){
            if (i.getGenero().equals("MASCULINO")){
                filtrada.add(i);
                System.out.println(i);
            }
        }

         */
        //System.out.println();

        //Filtrar con el API Stream a las persona del genero femenino
        /*
        filtrada = original.stream(). filter(item -> item.getGenero().equals("FEMENINO")).collect(Collectors.toList());

        //filtrada.forEach(a -> System.out.println(a));

        filtrada.forEach(System.out::println);


         */

        /*
        //Ordenar a las personas por edad ascendente
        filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());

        filtrada.forEach(System.out::println);

         */

        /*
        //Contar el numero de elementos de mi lista
        long conteo = original.stream().count();
        System.out.println(conteo);

         */

        //Solicitar una variable booleana si algun elemento o todos
        //los elementos cumplen alguna condicion

        //boolean alguno = original.stream().anyMatch(a -> a.getEdad()<30);
        //boolean alguno = original.stream().allMatch(a -> a.getEdad()<30);

        //System.out.println(alguno);

        //Retornar un valor a una clase Optional
        //Optional es una clase que nos permite manejar valores nulos,
        //en caso de que no se encuentren
        Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));

        System.out.println(menorEdad);
    }
}
