package com;

public class ArreglosOArrays {
    public static void  main(String[] args) {

        //Los array son una estructura que nos permite almacenar
        //varios elementos  de un mismo tipo de dato, en común
        // En programación son conocidos también  como vectores. Podemos almacenar
        // Ventajas.- almacenamos varios datos en una variable y se puede acceder a ellos por su indice
        //Los indices de un array inician en 0
        //Como desventajas, es que tomes un tamaño declarado,
        //estos no pueden crecer en tiempo de ejecución

        //Ej. declarar un array de núms enteros con su tamaño declarado

        int[] numeros = new int[6]; // <--- declaramos el tamaño del array, luego le asignamos valores

        numeros[0]= 100;
        numeros[1]= 200;
        numeros[2]= 300;
        numeros[3]= 400;
        numeros[4]= 500;
        numeros[5]= 600;

        //Los indices del array inician siempre en 0
        //y terminan una posición antes de la long (6-1)

        //Ej. Usaremos una posición del array, entonces lo jalamos
        //Si queremos poner otro indice sin declararlo, el programa marca error al ejecutar

        System.out.println(numeros[5]);

        //Otra forma de declarar un array es iniciarlo pero
        // con sus elementos guardados o asignados al inicio

        int [] num2= {1,2,3,4,5,6,7,8,9,10};

        System.out.println(num2); //<- si ponemos el .println nos manda donde se guarda solamente
                        // más no los datos, una opción es: (java.util.Arrays.toString(num2));


        for (int i = 0; i < num2.length; i++) {  //Este será para separar en una linea cada uno, no todo junto
            System.out.println(num2[i]);
        }

        //Los array pueden ser char (un entero  o  caracter).
        // Tipo double (para decimales)
        //String (para palabras o frases, texto vaya)
        // Se puede almacenar más de un tipo de dato en un array, osease double, string, etc?.
        // Pues como tal no, solo puede ser un array de un tipo en comun.
            // Pero con la clase Object, podria parecer eso,
            //solo que ahora no se declaran los valores en su tipo como tal.

        Object entero=100;
        Object nombre="juan";
        Object pi=3.1416;
        Object evalua= true;
        Object [] varios = {100, "nombres", 2.54 , false , '$'};




    }
}
