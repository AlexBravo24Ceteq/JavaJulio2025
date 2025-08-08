package com;

public class Arrays {
    public static void main(String[] args) {
        /*
        arrays son una estructura que nos permitira almacenar varios elementos de un mismo
        tipo de dato en comun en programacion  puede ser tambien conocido por vectores
        ventajas: varios datos en una sola variable y acceder a ellos en por medio de su indice
        los indices inician de 0
        desventajas: los array requieren tener un tamaño declarado
        no pueden crecer en tiempo de ejecucion

        ej. declarar un array de numeros enteros con su tamaño declarado
         */
        int  numeros [] =new int [7];

        //Asignar valores al array
        numeros[0]=100;
        numeros[1]=200;
        numeros[2]=300;
        numeros[3]=400;
        numeros[4]=500;
        numeros[5]=600;
        //utilizar una determinada posicion del array
        System.out.println("Numero: "+numeros[3]);
        //que pasa si se agrega una posicion mas
        numeros[6]=700;

        //otra forma es declararlos ya con los valores
        int [] numeros2= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numeros2);
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i]+" ");
        }
        //array de tipo char, doubble o String

        //guardar todos los tipos en objeto en un array no se puede guardar mas que un tipo de elemento
        //Al Usar Objetct se guarda como objeto hay que cambiarlo
        Object [] varios={"Gerardo","Solis",100,'a',2};
        String var=varios[0].toString();
        System.out.println("var");


    }
}
