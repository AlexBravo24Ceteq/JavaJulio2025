package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

    //Aqui alojaremos la interface que le indicara a
    //lógica, las operaciones que resolverá

    //Metodo para consultar la info de una cuenta

    public Cuenta consultar(int numCuenta);

    //Metodo para retirar recursos de una cuenta

    public Ticket retirar(int numCuenta, double monto);

    //Otro similar pero para depositar

    public Ticket depositar(int numCuenta, double monto);





}
