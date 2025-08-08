package com.logica;

import com.modelo.Producto;
import com.servicio.IMetodos;

import java.util.Map;

public class MaquinaExpendedora implements IMetodos {

    private Map<String, Producto> productos;

    public MaquinaExpendedora (){}

    public MaquinaExpendedora(Map<String, Producto> productos) {
        this.productos = productos;
    }

    @Override
    public Producto consultar(String claveProd) {
        return productos.get(claveProd);
    }

    @Override
    public String despacharProducto(String claveProd, double monedas) {
        String salida = ""; double cambio = 0;
        Producto producto = consultar(claveProd);
        if (consultar(claveProd) != null){ //Si existe el producto
            if (monedas < producto.getCosto()){ //Si las monedas ingresadas es menor al costo del producto
                return "La cantidad ingresada no cubre el costo del producto";
            } else {
                cambio = monedas - producto.getCosto();
                if (cambio > 0) //Si tiene cambio
                    return "Tome su producto '"+producto.getNombre()+"', y su cambio de" + cambio;
                else return "Tome su producto "+producto.getNombre();
            }
        } else
            return "El producto seleccionado no existe";
    }
}
