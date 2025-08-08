package com.logica;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

import java.util.Date;
import java.util.Map;

public class Cajero implements IMetodos {
    /* en el paquete com.logica se definen las clases que se
    encargaran de resolver las operaciones
     */

    private String sucursal;
    private int cajeroId;
    private Map<Integer, Cuenta> cuentas; //el cajero acceera al map simulando la base de datos

    /* variable auxiliar para incrementar el numero de folio del Ticket */
    private int folio = 1;

    public Cajero(){}

    public Cajero(String sucursal, int cajeroId, Map<Integer, Cuenta> cuentas) {
        this.sucursal = sucursal;
        this.cajeroId = cajeroId;
        this.cuentas = cuentas;
    }

    @Override
    public Cuenta consultar(int numCuenta) {
        //creamos cuenta
        Cuenta cuenta = null;
        /* Buscamos la cuenta en el Map (que simula la base de datos) por medio de la cuenta   */
        cuenta = cuentas.get(numCuenta);
        return cuenta;
    }

    @Override
    public Ticket retirar(int numCuenta, double monto) {
        Ticket ticket = null;
        //Necesitamos hacer validaciones para esta operacion
        //rpimero buscar la cuenta a manipular
        if (consultar(numCuenta) != null){
            //Guardar info de cuenta a manipular
            Cuenta cuenta = consultar(numCuenta);
            //Validamos que el cajero no pueda dar dinero en su limite diario
            if (monto >= 9000){
                System.out.println("El monto excede el maximo permitido del cajero");
                return ticket;
            } else if(cuenta.getSaldo()<monto){ //Si no tengo saldo suficiente
                System.out.println("Saldo insuficiente en la cuenta");
                return ticket;
            } else if (cuenta.getSaldo()-monto < cuenta.getSaldoMin()){
                System.out.println("El retiro dejaria por debajo del minimo nuestra cuenta");
                return ticket;
            } else {
                //Actualizamos el monto de la cuenta
                cuenta.setSaldo(cuenta.getSaldo()-monto);
                //Creamos el ticket
                ticket =  new Ticket(folio++, new Date(), cuenta.getNombreUsuario(), cuenta.getSaldo(), sucursal, cajeroId);
                return ticket;
            }
        } else {
            System.out.println("No existe la cuenta asociada a ese cliente");
            return ticket;
        }
    }

    @Override
    public Ticket depositar(int numCuenta, double monto) {
        Ticket ticket = null;
        //buscamos cuenta a manipular
        if (consultar((numCuenta))!=null){
            Cuenta cuenta = consultar(numCuenta);
            //Validar monto a depositar con respecto a saldo Maximo
            if (monto> cuenta.getSaldoMax()){
                System.out.println("El monto a depositar excede el saldo maximo permitido por la cuenta");
                return ticket;
            } else if (monto+cuenta.getSaldo()>cuenta.getSaldoMax()){
                System.out.println("El monto haría exceder a la cuenta en su saldo máximo permitido");
                return ticket;
            } else if (monto >= 10000){
                System.out.println("No se puede realizar depositos mayores a 10000, pase a ventanilla");
                return ticket;
            } else {
                //se actualiza el saldo
                cuenta.setSaldo(cuenta.getSaldo()+monto);
                //Creamos el ticket
                ticket =  new Ticket(folio++, new Date(), cuenta.getNombreUsuario(), cuenta.getSaldo(), sucursal, cajeroId);
                return ticket;
            }
        } else {
            System.out.println("No existe cuenta asociada al cliente");
            return ticket;
        }
    }
}
