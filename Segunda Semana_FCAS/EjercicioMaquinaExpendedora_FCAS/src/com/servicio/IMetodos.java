package com.servicio;

import com.respuesta.Producto;

import java.util.Map;

public interface IMetodos {

    public Producto seleccion(String numProducto, Map<String, Producto> productos);

    public Double pago(Producto producto, double monto, int cantidadVendida);

}
