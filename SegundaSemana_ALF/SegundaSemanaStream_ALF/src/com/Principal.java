package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {

        //Api stream es una funcionalidad apartir de java 8
        //que nos va a permitir gestionar de una forma mas
        //rapida e imperativa la infromacion que tengamos
        //en nuestras colecciones de datos
        //las colecciones se vuelve un flujo de datos apartir
        //del el cual podemos solicitar la info que necesitenmso
        Stream<String> nombres = Stream.of("Carlos","Frida","Alex","Alberto")
        .filter(item -> item.contains("a"));

        //Una vez filtramos la info la llevamos a una lista
        List<String> names = nombres.collect(Collectors.toList());
        //Mostrar resultados en la consola
        //System.out.println(names);

        //Declaramos una lista para guardar nuestros objetos persona

        List<Persona> original = new ArrayList<Persona>();
        //Creamos una lista para recolectar la informacion filtrada

        List<Persona> filtrada = new ArrayList<Persona>();

        //Añadir a nuestra lista original
        original.add(new Persona("Alfredo","MASCULINO",25));
        original.add(new Persona("Berenice","FEMENINO",26));
        original.add(new Persona("Victor","MASCULINO",24));
        original.add(new Persona("Gabriel","MASCULINO",25));
        original.add(new Persona("Bryan","MASCULINO",23));
        original.add(new Persona("Margarita","FEMENINO",23));
        original.add(new Persona("Veronica","FEMENINO",29));
        original.add(new Persona("Ximena","FEMENINO",27));
        original.add(new Persona("Guadalupe","FEMENINO",13));
        original.add(new Persona("PABLO","MASCULINO",22));

        //Imprimir la lista original
        System.out.println(original);
        
        //Con ciclo for
        for (int i = 0; i < original.size(); i++) {
            System.out.println(original.get(i));
            
        }
        //ESTOS DOS DON IGUALES
        System.out.println();
        System.out.println();
        //Recuerpar con ciclo for each
        for(Persona i:original){
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        //FOR EACH PERO AHORA A TRAVEZ DE NUESTRA LISTA
        original.forEach(a-> System.out.println(a));

        System.out.println();

        //si filtramos  alos elementos del genro masculino un ciclo convencional
        for (Persona i: original){
            if (i.getGenero().equals("MASCULINO")) {
                filtrada.add(i);
                System.out.println(i);
            }
        }
        //Filtrar con API stream alas personas del genro femenino
        System.out.println();
        System.out.println();
        filtrada = original.stream().filter(item -> item.getGenero().equals("FEMENINO"))
                .collect(Collectors.toList());
        filtrada.forEach(a -> System.out.println(a));

        System.out.println();
        System.out.println();
        //MISMO CASO SOLO CAMBIA LA FORMA DE IMPRIMIR
        filtrada = original.stream().filter(item -> item.getGenero().equals("FEMENINO"))
                .collect(Collectors.toList());//con funciones lambda
        filtrada.forEach(System.out::println);
        System.out.println();
        //Ordenar a las personas por edades ascendentes
        //EMPIEZA DE MENOR A MAYOR CON ESTE CODDIGO
        filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
                .collect(Collectors.toList());
        filtrada.forEach(System.out::println);

        //PARA CONTAR EL NUMERO DE LA LISTA
        long conteo = original.stream().count();
        System.out.println(conteo);

        //Solicitar una variable booleana si algun elemento o todos
        //cumplen una condicion con allMatch SI SE CUMPLE QUE TODOS TIENEN MENOS DE 30
        boolean alguno = original.stream().allMatch(a -> a.getEdad()<30);
        System.out.println(alguno);
        System.out.println();
        //Retornar un valor a una clase optional
        //optional es una clase que nos permite manejar valores nulos
        //en caso de que no se encuentren
        Optional<Persona> menorEdad = original.stream()
                .min(Comparator.comparing(Persona::getEdad));

        System.out.println(menorEdad);

    }
}
