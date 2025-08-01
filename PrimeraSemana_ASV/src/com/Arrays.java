package com;

public class Arrays {
    public static void main(String[] args) {

        //Arrays - son una estructura que nos permitira almacenar varios
        //elementos de un mismo tipo de dato en comun
        //En Programacion se conocen tambien como Vectores.

        //Ventajas: se pueden almacenar varios datos
        //en una sola variable
        //y acceder a ellos por medio de su indice
        //Los indices de un array inician en 0

        //Desventajas: los arrays requiere tener un tamaño declarado
        // y estos no pueden crecer en tiempo de ejecucion

        //Ej. declarar un array de numeros enteros
        // con su tamaño declarado

        int [] numeros = new int[7];

        //Asignar valores a nuestro Array;
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 300;
        numeros[3] = 400;
        numeros[4] = 500;
        numeros[5] = 600;

        //Ej. quiero utilizar una determinada posicion del array
        System.out.println(numeros[3]);

        //Vamos a ver que ocurre si quiero agregar
        //un elemento a mi array

        numeros[6] = 700;

        //otra forma de declarar un array es iniciarlo
        //pero ya con sus elementos guardados o asignados
        //desde un inicio

        int [] numeros2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //System.out.println(numeros2);
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] + " ");

            //array char
            //array double
            //array String

            //Puedo almacenar mas de un tipo de dato en
            //un array?
            //La respuesta es NO, solo pueden haber arrays de un tipo
            // de dato en comun.
            //Pero podriamos "romper" o "aparentar" eso, con
            //la clase Object
            //Es decir, tener un array de elementos
            //double, enteros, String, etc.

            //var nombre = "Nombre";
            //var numero = 100;

            Object entero = 100;
            Object nombre = "Juan";
            Object pi = 3.1416;
            Object evalua = true;

            Object [] varios = {100, "Nombre", 2.54, false, "$"};

            //Si quisieramos utilizar realmente los valores del array
            //tipo Object, por ejemplo, para sumarlos, etc.
            //tendriamos que hacerles antes un casteo
            int numero100 = (Integer) varios[0];
            double numero254 = (Double) varios[2];

            /*
            try{
                int numeroNombres = (Integer) varios[1];

            } catch (Exception e){
                //Si existiera una excepcion en este caso por el casteo
                //Atrapamos ese error o excepcion y ejecutamos este otro
                //bloque de codigo
                System.out.println("No se puede convertir de String a entero");
            }

             */

            System.out.println();
            System.out.println(numero100+numero254);
            System.out.println();

        }
    }
}
