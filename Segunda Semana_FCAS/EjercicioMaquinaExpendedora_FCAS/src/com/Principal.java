package com;

import com.logica.Expendedora;
import com.respuesta.Producto;
import jdk.jshell.spi.ExecutionControl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Map para los productos

        Map<String, Producto> productos= new HashMap<String , Producto>();
        productos.put("A1",new Producto("CocaCola", 20, 20 ));
        productos.put("A2",new Producto("Sprite", 17.50, 20 ));
        productos.put("A3",new Producto("Fanta", 17.50, 20 ));
        productos.put("A4",new Producto("Pepsi", 20, 20 ));
        productos.put("A5",new Producto("Manzanita", 18, 20 ));
        productos.put("B1",new Producto("Sabritas Clasicas", 25, 10 ));
        productos.put("B2",new Producto("Doritos", 22, 10 ));
        productos.put("B3",new Producto("Chetos", 18, 10 ));
        productos.put("B4",new Producto("Churrumais", 17, 10 ));
        productos.put("B5",new Producto("Bolsa Picafresas", 15, 15 ));

        Expendedora exp1 = new Expendedora("Expendedora 1", productos);
        //---------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------
        StringBuilder inventario = new StringBuilder();

        for (Map.Entry<String, Producto> entry: productos.entrySet()){
            inventario.append("Clave: ").append(entry.getKey())
                    .append(" | Producto: ").append(entry.getValue())
                    .append("\n");
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>°<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>MÁQUINA EXPENDEDORA<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        System.out.println(inventario.toString()); //En los demás programas de codigo si lee el syso.

        //---------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------

        System.out.println("Ingrese el codigo de su producto: ");
        String numProductos = entrada.nextLine();

        //Selección
        Producto productSelected = exp1.seleccion(numProductos,productos);
        System.out.println("Seleccionaste: " + productSelected);

        //Pago
        System.out.println("Ingrese su pago: $");
        double efectivo = entrada.nextDouble();
        double vuelto = exp1.pago(productSelected, efectivo,1);

        System.out.println("Tu cambio es: $" + vuelto + "|| Stock restante: " + productSelected.getStock());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>°<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>°<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


    }
}
