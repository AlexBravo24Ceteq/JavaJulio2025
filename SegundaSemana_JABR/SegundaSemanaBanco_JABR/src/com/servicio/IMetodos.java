package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

    //En el paquete com.servicio alojaremos la interface
    //que le indicará a la clase de la lógica las operaciones
    //que tendrá que resolver

    //Vamos a crear un método para consultar la info
    //de una cuenta

    public Cuenta consultar (int numCuenta);

    //Vamos a crear un método para retirar recursos
    //de una cuenta
    public Ticket retirar (int numCuenta, double monto);

    //Creamos otro método similar, pero ahora para
    //depositar a la cuenta
    public Ticket depositar (int numCuenta, double monto);
}
