package com;

import com.logica.MaquinaExpendedora;
import com.modelo.Producto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Se crea el map de productos
        Map<String, Producto> productos = new HashMap<String, Producto>();

        //Se crean los productos
        productos.put("A1", new Producto("Barritas fresa", 10.5));
        productos.put("B5", new Producto("Margaritas", 20.5));
        productos.put("A3", new Producto("Jumex Naranja", 12.0));
        productos.put("C4", new Producto("Takis guacamole", 18));
        productos.put("B2", new Producto("Galletas Arcoiris", 16));

        //Maquina expendedora con los valores necesarios
        MaquinaExpendedora maquina1 = new MaquinaExpendedora(productos);
        String producto; double moneda = 0, sumaMonedas = 0;
        System.out.println("Seleccione un producto");
        producto = entrada.nextLine();
        if (maquina1.consultar(producto) == null) { //Si no existe el producto
            System.out.println("El producto seleccionado no existe");
            return;
        }
        System.out.println("Ingrese monedas, una vez haya terminado seleccione -1");
        do {
            moneda = entrada.nextDouble();
            if (moneda > 0)
                sumaMonedas = sumaMonedas + moneda;
        } while (moneda != -1);

        System.out.println(maquina1.despacharProducto(producto, sumaMonedas));
    }
}
