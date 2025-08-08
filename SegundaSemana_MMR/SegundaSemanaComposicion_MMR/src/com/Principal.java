package com;

public class Principal {
    public static void main(String[] args) {
        /* para poder crear la laptop, primero necesitamos crear
        los objetos que forman parte de ella
         */
        Almacenamiento disco = new Almacenamiento("Adata", "SSD", 480);
        Procesador intel = new Procesador("Intel", "core i5", 4);
        Ram adata = new Ram("Adata", "DDR4", 2667);

        //caracteristicas de laptop
        Laptop dell = new Laptop("Dell", "SDF3", "Negro", disco, intel, adata);
        System.out.println();  //salto de linea para identificar
        System.out.println(dell);

        //aumento de disco a laptop
        Almacenamiento samsung = new Almacenamiento("Samsung", "M.2", 1000);

        dell.setDisco(samsung);

        System.out.println();  //salto de linea para identificar
        System.out.println(dell);

        intel.setModelo("i7");

        System.out.println();  //salto de linea para identificar
        System.out.println(dell);

        /*
        ACTIVIDAD: Crear un obeto que tenga por lo menos 3 atributos propios y 3 atributos que sean otros objetos,
        es decir, 3 objetos que compongan uno mas grande
        En nuevo proyecto: EjercicioComposicion_XXXX
         */

        /*Que pasa si se quiere crear otro procesador para otra laptop,
         pero que ese tenga 12 nucleos?
         */
        Procesador amd = new Procesador("AMD", "Ryzen 5", 3.5);
        /* Para un solo objeto no puedo cambiar el numero de nucleos, pero si
        para todos los procesadores de la clase procesador
         */
        Procesador.setNucleos(12);
        System.out.println(); //salto de linea para identificar
        System.out.println(intel);
        System.out.println(amd);
    }
}
