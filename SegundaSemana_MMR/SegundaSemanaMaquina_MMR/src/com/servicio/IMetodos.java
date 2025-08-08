package com.servicio;

import com.modelo.Producto;

public interface IMetodos {
    //metodo para consultar productos
    public Producto consultar (String claveProd);

    //metodo para despachar producto
    public String despacharProducto (String claveProd, double monedas);
}
