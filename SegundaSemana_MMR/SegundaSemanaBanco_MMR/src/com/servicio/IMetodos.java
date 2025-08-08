package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
    /* En el paquete com.servicio alojaremos la interface que le indicará a la
    clase de la logica las operaciones que tendra que resolver
     */
    //metodo para consultar la info de una cuenta
    public Cuenta consultar (int numCuenta);

    //metodo para retirar recursos
    public Ticket retirar (int numCuenta, double monto);

    //metodo para depositar a la cuenta
    public Ticket depositar (int numCuenta, double monto);
}
