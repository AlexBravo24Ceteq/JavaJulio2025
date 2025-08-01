package com;

public class Arrays {

    public static void main(String[] args) {
        // Arrays - Son una estrucutura que nos permitirá almacenar varios elementos de un mismo tipo de dato
        // en común
        // En programación puede ser que también los conozcan con el nombre de vectores
        // Ventajas: Podemos almacenar varios datos de una sola variable y acceder a ellos
        // por medio de su índice
        // Los índices de un array inician en 0
        // Desventajas: Los arrays requieren tener un tamaño declarado y estos no pueden crecer en tiempo
        // de ejecución

        // Ejemplo: Declarar un array de números enteros con su tamaño declarado

        int [] numeros = new int[7]; // Longitud de 6 números

        // Asignar valores a nuestro array
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 300;
        numeros[3] = 400;
        numeros[4] = 500;
        numeros[5] = 600;

        // Ejemplo: Quiero utilizar una determinada posición del array
        System.out.println(numeros[5]);

        // Vamos a ver que ocurre si quiero agregar un elemento más a mi array
        numeros[6] = 700;

        // Otra forma de declarar un array es iniciarlo pero ya con sus elementos guardados o asignados
        // desde un inicio
        int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(numeros2);

        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] + " ");
        }

        // Array char
        // Array double
        // Array String

        // ¿Puedo almacenar más de un tipo de dato en un array?
        // La respuesta es NO. Solo pueden haber arrays de un tipo de dato en común
        // pero podríamos "romper" o "aparentar" eso, con la clase Object
        // Es decir, tener un array de elementos double, enteros, String, etc

        // var nombre = "Nombre";
        // var numero = 100;

        Object entero = 100;
        Object nombre = "Juan";
        Object pi = 3.1416;
        Object evalua = true;

        Object [] varios = {100, "Nombres", 2.54, false, "$"};

        // Si quisieramos utilizar realmente los valores del array de tipo Object
        // por ejemplo, para sumarlos, etc, tendriamos que hacerles antes un casteo
        int numero100 = (Integer) varios[0];
        double numero254 = (Double) varios[2];
/*
        try { // Intenta lo siguiente
            int numeroNombres = (Integer) varios[1];
        } catch (Exception e){
            // Si existiera una excepcion en este caso por el casteo
            // atrapamos ese error o excepción y ejecutamos este otro bloque de código
            System.out.println("No se puede convertir de String a Entero");
        }
 */
        int numeroNombres = (Integer) varios[1];

        System.out.println();
        System.out.println(numero100+numero254);





    }
}
