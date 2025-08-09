package com;

import com.logica.MaquinaExp;
import com.modelo.Producto;
import com.respuesta.Ticket;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {

        //Se Crea el HashMap
        Map<Integer, Producto> productos = new HashMap<Integer, Producto>();

        productos.put(34, new Producto("Chips Fuego", 21.23, 8, "Septiembre 2025", "papas fritas con chile"));
        productos.put(15, new Producto("Galletas Principe", 11.43, 4, "Septiembre 2025", "Galletas con relleno de chocolate"));
        productos.put(23, new Producto("Panditas", 10, 6, "Septiembre 2025", "papas fritas con chile"));
        productos.put(55, new Producto("Galletas Gabi", 21.23, 8, "Marzo 2026", "Galletas de canela"));
        productos.put(33, new Producto("Chips Fuego", 21.23, 8, "Septiembre 2025", "papas fritas con chile"));


        for (Integer i: productos.keySet()) {
            System.out.println("Clave: " +i+ " Descripcion: "+ productos.get(i));
            
        }
        System.out.println();
        System.out.println();

        MaquinaExp maquina1 = new MaquinaExp(15, productos);

        System.out.println(maquina1.consulta(23));
        System.out.println(maquina1.despachar(23, 40, 2));




    }
}
