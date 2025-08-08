package com;

public class Principal {
    public static void main(String[] args) {
        Encargado ana = new Encargado("Ana", "DeApellido", 25);
        Ubicacion direccion = new Ubicacion("LaCalle", "Colonia", "Veracruz");
        Edificio construccion = new Edificio("azul", "ladrillo", 2);

        Libreria libreria = new Libreria("LaLibreria", 5, ana, direccion, construccion);

        System.out.println(libreria);
    }
}
