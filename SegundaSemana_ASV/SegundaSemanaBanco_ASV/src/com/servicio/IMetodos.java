package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

    //En el paquete com.servicio alojaremos la interface
    //que le indicara a la clase de la Logica las operaciones
    //que tendra que resolver

    //Vamos a crear un metodo para consultar
    //la info de una cuenta
    public Cuenta consultar(int numCuenta);

    //Vamos a crear un metodo para retirar recursos
    //de una cuenta
    public Ticket retirar (int numCuenta, double monto);

    //Creamos otro metodo similar, pero ahora para
    //depositar a la cuenta

    public Ticket depositar (int numCuenta, double monto);
}
