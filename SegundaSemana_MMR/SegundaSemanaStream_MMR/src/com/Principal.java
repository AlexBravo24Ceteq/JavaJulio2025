package com;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        /* API Strem -Funcionalidad a partir de Java8 que nos va a permitir
        gestionar de una forma mas rapida e imperativa la informacion que tengamos
        en nuestras colecciones de datos

        Las colecciones se vuelven flujo de datos a partir del cual
        podemos solicitar la informacion que necesitemos
         */

        //Ejemplo de uso de Strem
        Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto")
                .filter(a -> a.contains("i"));

        //Ya filtrada la informacion la llevo a una lista
        List<String> name = nombres.collect(Collectors.toList());
        //List<String> name = nombres.toList();
 //       System.out.println(name);

        //declaramos lista para guardar objeto persona
        List<Persona> original = new ArrayList<Persona>();

        //Crear lista para recolectar informacion filtrada
        List<Persona> filtrada = new ArrayList<Persona>();

        //Añadir elementos a lista original
        original.add(new Persona("Jorge", "MASCULINO", 37));
        original.add(new Persona("Alicia", "FEMENINO", 25));
        original.add(new Persona("Cesar", "MASCULINO", 27));
        original.add(new Persona("Mauricio", "MASCULINO", 30));
        original.add(new Persona("Guadalupe", "FEMENINO", 25));
        original.add(new Persona("Lucina", "FEMENINO", 26));
        original.add(new Persona("Raul", "MASCULINO", 27));
        original.add(new Persona("Sergio", "MASCULINO", 38));
        original.add(new Persona("Gabriela", "FEMENINO", 22));
        original.add(new Persona("Rafael", "MASCULINO", 24));

        //Imprimir lista origial
//        System.out.println(original);

        //Recorrer lista para ver cada elemento con un ciclo for
//        for (int i = 0; i < original.size(); i++){
//            System.out.println(original.get(i));
//        }

        //Recuperar todos los elementos con un ciclo foreach
//        for (Persona i:original){
//            System.out.println(i);
//        }

        //forEach a traves de la lista
//        original.forEach(a -> System.out.println(a));

        /* si filtraramos a los elementos del genero masculino con un ciclo convencional         */
        //con un ciclo convencional
//        for (Persona i: original) {
//            if (i.getGenero().equals("MASCULINO")){
//                filtrada.add(i);
//                System.out.println(i);
//            }
//        }
        //filtrar con API Stream las personas del genero femenino
//        filtrada = original.stream()
//                .filter(a -> a.getGenero().equals("FEMENINO"))
//                .collect(Collectors.toList());/*toList();*/
//
//        filtrada.forEach( System.out::println);

        //ordenar a la spersonas por orden ascendente
//        filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//                .collect(Collectors.toList());
//
//        filtrada.forEach( System.out::println);

        //contar numero de elementos de mi lista
//        System.out.println(original.stream().count());

        //Solicitar variable boleana si uno o todos cumplen una condicion
        //anyMatch si alguno de los de la lista
        //allMatch si todos los de la lista
//        boolean alguno = original.stream().anyMatch(a -> a.getEdad() < 30);
//        System.out.println(alguno);

        //Retornar un valor a clase Optional
        /*Optional - clase que nos permite manejar valores nulos en caso
        de que no se encuentren     */
        Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
        System.out.println(menorEdad);
    }
}
