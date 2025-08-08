package com.arrays;

public class Arrays5_GDSA {
    public static void main(String[] args) {
        /*
        5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
            respectivos precios. Muestra en consola la lista de productos y sus precios.
            Por lo menos 5 productos o artículos.
         */
        System.out.println("»»»»»»»»»»»»»» Ejercicio 5 ««««««««««««««««««««");


        String[] productos = {"Impresora HP", "Mouse Acteck", "Teclado Motorola", "Monitor Asus", "Impresora epson"};

        double[] precios = {8550.99, 219.95, 335.49, 3220.00, 3500.75};

        System.out.println("Lista de productos y sus precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - $" + precios[i]);



    }
        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }

}
