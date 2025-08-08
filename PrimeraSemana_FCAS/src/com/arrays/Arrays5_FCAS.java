package com.arrays;

public class Arrays5_FCAS {
    public static void  main(String[] args) {

        //5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
        //respectivos precios. Muestra en consola la lista de productos y sus precios.
        //Por lo menos 5 productos o artículos.

        System.out.println("\uD835\uDCEC==================================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC===ARRAY DE PRODUCTOS Y PRECIOS===\uD835\uDCEC");


        String[] productos = {"Pan", "Leche", "Kg de Huevos", "Queso", "Café"};
        double[] precios = {15.0, 22.5, 30.0, 65, 44.0};

        System.out.println("Lista de productos y precios: ");

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " -> $" + precios[i]);
        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC==================================\uD835\uDCEC");
    }
}
