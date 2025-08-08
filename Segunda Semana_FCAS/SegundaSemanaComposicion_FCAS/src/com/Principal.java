package com;

public class Principal {
    public static void main(String[] args){

        Almacenamiento disco = new Almacenamiento("Kingston)", "SSD", 480);
        Procesador intel = new Procesador("Intel", "i5", 4);
        RAM adata = new RAM("Adata", "DDR4", 2667);

        //Ahora si toca crear la Laptop

        Laptop hp = new Laptop("HP", "440G7", "Plata", disco, intel, adata);

        System.out.println(hp);

        //Ej. cambio de algo
        Almacenamiento Samsung = new Almacenamiento("Samsung", "M.2", 1080);
        hp.setDisco(Samsung);
        System.out.println(hp);

/*
ACTIVIDAD. Crear un objeto que tenga por lo menos 3 atributos propios
y 3 atributos que sean otros objetos, osea 3 objetos que compongan uno más grande
Ej. un celular, un auto, una hamburguesa, etc. Una vez creado
a principal e imprimir. Esto en un nuevo proyecto llamado
EjercicioComposición_FCAS, paquete com, principal, las 3 clases que
formaran objetos para el grande. Clase de objeto principal y luego crearlos e imprimir
el que se compone.
 */


    }

}
