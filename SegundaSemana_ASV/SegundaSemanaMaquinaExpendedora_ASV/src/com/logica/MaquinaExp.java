package com.logica;

import com.modelo.Producto;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

import java.util.Date;
import java.util.Map;

public class MaquinaExp implements IMetodos {
    private int maquinaId;
    private int folio = 0;
    private Map<Integer, Producto> productos;

    public MaquinaExp() {


    }

    public MaquinaExp(Integer maquinaId, Map<Integer, Producto> productos) {
        this.maquinaId = maquinaId;
        this.productos = productos;
    }


    @Override
    public Producto consulta(int producto) {
        Producto producto1 = null;
        producto1 = productos.get(producto);
        return producto1;
    }

    @Override
    public Ticket despachar(int producto, double precio, int cantidadComprar) {
        Ticket ticket1 = null;

        if (consulta(producto) != null){
            Producto producto1 = productos.get(producto);
            if (precio >= producto1.getPrecioProducto()){
                if (cantidadComprar <= producto1.getStockProducto()){
                    double contadorPrecio = cantidadComprar*producto1.getPrecioProducto();
                    double cambio = precio - contadorPrecio;
                    System.out.println("Compra exitosa");
                    System.out.println("Ingreso la cantidad de: "+ precio);
                    System.out.println("Compro "+ cantidadComprar+" "+producto1.getPrecioProducto()+" cada uno");
                    System.out.println("Su cambio es de: "+ cambio);

                    Ticket ticke1 = new Ticket(folio++, new Date(), 144);
                    return ticke1;

                }

            }
            else if (precio < producto1.getPrecioProducto()){
                double contadorPrecio = producto1.getPrecioProducto() - precio;
                System.out.println("Te falta ingresar esta cantidad: " + contadorPrecio );

            }
            //System.out.println("Falta dinero");


        }
        return null;
    }
}
