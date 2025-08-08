package com;

public class Principal {
    public static void main(String[] args){

        Fruta Fruta = new Fruta("Melon", 3, 64);
        Lacteos Lacteos = new Lacteos("leche", "alpura", "vaca", 49);
        Carne Carnes = new Carne("Res", "New York", 1, 580);
        Bebidas líquidos = new Bebidas("Jugo", "Jumex", "Litro", 48);

        //---

        Compras Wallmart = new Compras("Libreta", "cuadriculada", "azul", Fruta, Lacteos, Carnes, líquidos);

        System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<");
        System.out.println(Wallmart);
        System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<");

    }
}
