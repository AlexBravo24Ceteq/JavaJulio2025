package com.logica;

import com.modelo.Producto;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

import java.util.Date;
import java.util.Map;

public class MaquinaExp implements IMetodos {

    private int numeroMaquina;
    private int folio = 0;
    private Map<Integer, Producto> productos;

    public MaquinaExp() {
    }

    public MaquinaExp(int numeroMaquina, Map<Integer, Producto> productos) {
        this.numeroMaquina = numeroMaquina;
        this.productos = productos;
    }

    @Override
    public Producto consulta(int producto) {
        Producto producto1 = null;
        producto1 = productos.get(producto);
        return producto1; //Aqui nos regresa el hashmap de acuerdo al que deseemos

    }

    @Override
    public Ticket despachar(int producto, double precio, int cantidadComprar) {
        Ticket ticket1 = null;

        if (consulta(producto) != null) {
            Producto producto1 = productos.get(producto);
            if (precio>=producto1.getPrecio()) {
                if (cantidadComprar<=producto1.getStock()) {
                    double precio_aux = cantidadComprar*producto1.getPrecio();
                    double cambio = precio-precio_aux;
                    System.out.println("Se ah realizado su compra con exito");
                    System.out.println("Ingreso la cantidad de: "+ precio);
                    System.out.println("Compro "+cantidadComprar+ " "+producto1.getNombreProducto()+" de "+ producto1.getPrecio()+ " C/U");
                    System.out.println("Su cambio es : "+cambio);
                    //Ticket ticket1= new Ticket(folio ++, new Date(), 144);
                    Ticket ticket = new Ticket(folio++ , new Date(), numeroMaquina);
                    return ticket;
                } else if (cantidadComprar> producto1.getStock()) {
                    System.out.println("No tenemos suficientes "+producto1.getNombreProducto()+ " en stock");
                    System.out.println();
                    System.out.println("Intente con una cantidad menor.............");

                }
            }else if (precio < producto1.getPrecio()) {

                double precio_aux = producto1.getPrecio() - precio;
                System.out.println("No se realizo la compra.........");
                System.out.println();
                System.out.println("Te falta ingresar esta cantidad: " + precio_aux);

            }

        }

        return null;

    }

}
