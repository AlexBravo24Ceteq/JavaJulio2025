package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

    //En el paquete con.serivicio alojaremos la interface
    //que indicara ala clase de logica las opereaciones
    //que se tendran que resolver
     //crear un metodo para consultar la info
    //de la cuenta
    public Cuenta consultar (int numCuenta);

    //vamos a crar un metodo para retirar recursos de una cuenta
    public Ticket retirar(int numCuenta, double monto);

    //crear otro metodo similar pero para depositar ala cuenta
    public Ticket depositar(int numCuenta, double monto);
}
