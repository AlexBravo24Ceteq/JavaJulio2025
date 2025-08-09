package com.servicio;

import com.modelo.Producto;
import com.respuesta.Ticket;

public interface IMetodos {

    public Producto consulta(int producto);
    public Ticket despachar(int producto, double precio, int cantidadComprar);
    //public Ticket despachar();



}
