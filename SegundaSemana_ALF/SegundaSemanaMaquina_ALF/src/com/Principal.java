package com;

import com.logica.MaquinaExp;
import com.modelo.Producto;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {


        //Creamos nuestro hashMap con productos
        Map<Integer, Producto> productos = new HashMap<Integer, Producto>();

        productos.put(1, new Producto("Coca-cola",21.00,20,"12-12-2027","Resfresco"));
        productos.put(2, new Producto("Sabritas",20.00,15,"12-12-2027","Frituras"));
        productos.put(3, new Producto("Pinguinos",25.00,20,"12-12-2027","Panque"));
        productos.put(4, new Producto("Panditas",15.00,2,"12-12-2027","Gomitas"));

        MaquinaExp maquinita = new MaquinaExp(144,productos);

        for (Integer i : productos.keySet()) {
            System.out.println("Clave producto : "+i+ " Descripcion: "+ productos.get(1));
        }
        System.out.println();
        System.out.println();
        System.out.println(maquinita.consulta(1));
        System.out.println(maquinita.despachar(1,23,1));


    }
}
