package com;

public class Arrays {
    public static void main(String[] args) {
        /* Arrays - Son una estructura que nos permitirá almacenar varios
        elementos de un mismo tipo de dato en comun.
        En programacion conocidos como vectores.
        Ventajas: podemos almacenar varios datos en una variable y acceder a ellos
            por medio de su indice.
        Los indices de un array inician en 0.
        Desventajas: los arrays requieren tener un tamaño declarado y estos no crecen en
            tiempo de ejecución
         */

        //Ej. Arrays de numeros enteros
        int [] numeros = new int[6];

        //Asignar valores a arrays
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 300;
        numeros[3] = 400;
        numeros[4] = 500;
        numeros[5] = 600;

        //Ej. Utilizar Array
        System.out.println(numeros[5]);

        //Arrays con datos guardados desde el inicio
        int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};

    //    System.out.println(numeros2); //ete no, no jala

        for (int i = 0; i < numeros2.length; i++){
            System.out.print(numeros2[i] + ", ");
        }

        //¿Podemos almacenar mas de un tipo de dato en un array?
        //no se puede, solo son de un tipo de dato en comun, pero se puede "aparentar" con un object
        Object entero = 100;
        Object nombre = "Juan";
        Object pi = 3.1416;
        Object evalua = true;
        Object [] varios = {100, "Nombres", 2.54, false, '$'};

        //Si quisieramos utilizar realmente los valores del array de tipo Object hay que castear
        int numero100 = (Integer)varios[0];
        double numero254 = (Double) varios[2];

        try {
            int numeroNombres = (Integer) varios [1];
        } catch (Exception e) {
            /* Si existiera un error por el casteo en este caso se atrapa el arror y
                se ejecuta otro bloque de codigo
             */
            System.out.println("No se puede convertir");
        }

        System.out.println();
        System.out.println(numero100+numero254);

    }
}
