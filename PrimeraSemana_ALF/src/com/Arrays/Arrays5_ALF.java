package com.Arrays;

public class Arrays5_ALF {
    public static void main(String[] args) {
        /*5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
        respectivos precios. Muestra en consola la lista de productos y sus precios.
        Por lo menos 5 productos o artículos.*/

        // Definir arrays para productos y precios
        System.out.println("*************TIENDITA DE REGALOS**********");
        String[] productos = {"Peluche", "Carrito", "Chocolates", "Pulseras", "Muñeca"};
        double[] precios = {25.50, 40.00, 60.75, 5.99, 12.20};

        // Imprimir la lista de productos y precios
        System.out.println("Lista de Productos y Precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - $" + precios[i]);
        }
        System.out.println("*******FIN DEL PROGRAMA**********");
    }
}
