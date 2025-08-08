package com;

public class Principal {

    public static void main(String[] args) {

        //Para poder crear nuestra Laptop, primero necesitamos
        //crear los otros objetos que formaran parte de ella

        Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
        Procesador intel = new Procesador("Intel", "i5", 4);
        Ram adata = new Ram("Adata","DDR4", 2667);

        //Ahora si ya puedo crear mi Laptop
        Laptop hp = new Laptop("HP", "440G7", "Plata",disco, intel,adata);

        System.out.println(hp);

        //Ejemplo, le aumento o cambio el disco duro a mi Laptop
        Almacenamiento samsung = new Almacenamiento("Samsung", "M.2", 1000);

        hp.setDisco(samsung);

        System.out.println(hp);

        intel.setModelo("i7");

        System.out.println(hp);

        //Que pasa si quiero crear otro procesador, para otra Laptop
        //Pero que ahora ese procesador tenga 12 nucleos
        Procesador amd = new Procesador("AMD", "Ryzen 5", 3.5);
       //Para un solo objeto no puedo cambiar el numero de nucleos, pero si para
        //todos los objetos de la clase Procesador
        //Procesador.setNucleos(12);

        System.out.println(intel);
        System.out.println(amd);

        /*
        ACTIVIDAD: Crear un objeto que tenga por lo menos 3 atributos propios y
        3 atributos que sean otros objetos, es decir, 3 objetos que compongan a uno más grande
        Ej. Un Celular, Hamburguesa (Papas, Aderezo, Catsup),
        Lo crean en la clase Principal y lo imprimen.
        Para ello crean un nuevo proyecto Java llamado EjercicioComposicion_XXXX
        crean el paquete com, la clase Principal, las 3 clases que formaran los objetos
        que componen al mas grande. La clase del objeto principal
        Y los crean en la clase Principal e imprimen el que se compone de los demás
         */

    }
}
