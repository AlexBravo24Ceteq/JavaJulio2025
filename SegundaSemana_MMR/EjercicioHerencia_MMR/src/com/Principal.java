package com;

public class Principal {
    public static void main(String[] args) {
        Animal perro = new Animal("perro", 3, "terrestre");

        Mascota shita = new Mascota("gato", 2, "terrestre", "Shita", "Monse", false);

        Mascota puppy = new Mascota("Pez", 1, "acuatico", "ElPez", "Tara", false);

        System.out.println(perro);
        System.out.println();
        System.out.println(shita);
        System.out.println();
        System.out.println(puppy);
    }
}
