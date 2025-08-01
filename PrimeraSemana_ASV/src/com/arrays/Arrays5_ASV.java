package com.arrays;

import java.util.Scanner;

public class Arrays5_ASV {
    public static void main(String[] args) {
        /*
        5. Crea dos arrays, uno para mostrar n productos y otro para
        mostrar sus respectivos precios. Muestra en consola la lista
        de productos y sus precios. Por lo menos 5 productos o artículos.

         */
        Scanner entrada = new Scanner(System.in);

        String [] productos = {"Leche", "Sopa", "Helado", "Cafe", "Jamon"};
        Double [] precios = {23.4, 43.4, 67.5, 105.6, 23.7};

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]+ ": $" + precios[i]);

        }
    }
}
