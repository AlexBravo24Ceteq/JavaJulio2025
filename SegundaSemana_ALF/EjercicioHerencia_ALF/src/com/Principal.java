package com;

public class Principal {
    public static void main(String[] args) {

        Animal salvaje = new Animal("Richard", 4,"Leon");
        Perro solovino = new Perro("Solovino",3,"Labrador",true,true,true);
        Gato michi = new Gato("MICHITO",4,"American wirehair","Muy limpio","Si","Muy inteligente");

        System.out.println(salvaje);
        System.out.println(solovino);
        System.out.println(michi);
    }
}
