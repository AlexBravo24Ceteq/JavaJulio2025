package com.arrays;

import java.util.Scanner;

public class Arrays5_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
            respectivos precios. Muestra en consola la lista de productos y sus precios.
            Por lo menos 5 productos o artículos.
         */
        System.out.println("=============================");
        System.out.println("=======ARRAY PRODUCTOS=======");
        System.out.println("=============================");

        String [] productos = {"Lapiz", "Colores", "Borrador", "Sacapuntas", "Cuaderno"}; //Array del tamaño de caracteres de frase
        float [] precios = {3.5F, 10.30F, 2.5F, 2.0F, 18.20F};

        for (int i = 0; i < productos.length; i++){
            System.out.println("Producto: "+productos[i]+" Costo: "+precios[i]);
        }

        System.out.println("============FIN=============");
    }
}
