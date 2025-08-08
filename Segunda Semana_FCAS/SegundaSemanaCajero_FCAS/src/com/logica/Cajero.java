package com.logica;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

import java.util.Date;
import java.util.Map;

public class Cajero implements IMetodos {

    //En este paquete se definen clases que resolverán operaciones

    private String sucursal;
    private int cajeroId;
    private Map<Integer, Cuenta>cuentas;

    //Ahora el cajero accedera a un map que simula una pequeña base de datos
    //Luego declaramos una variable aux para incrementar el numero de folio de ticket

    private int folio=1;

    public Cajero(){}

    public Cajero(String sucursal, int cajeroId, Map<Integer, Cuenta> cuentas) {
        this.sucursal = sucursal;
        this.cajeroId = cajeroId;
        this.cuentas = cuentas;
    }

    @Override
    public Cuenta consultar(int numCuenta) {
        //Creamos una cuenta vacia
        Cuenta cuenta=null;
        //La buscamos en el Map por medio del num de cuenta (que es el key del Map)
        cuenta = cuentas.get(numCuenta); //Si existe guardamos esa info en el objeto
        return cuenta; //Devolverá la info de la cuenta
    }

    @Override
    public Ticket retirar(int numCuenta, double monto) {
        //Ticket vacio
        Ticket ticket = null;
        //Debemos hacer validaciones, primero buscamos la cuenta que queremos
        if (consultar(numCuenta)!=null){
            Cuenta cuenta = consultar(numCuenta);
            //Validamos que el cajero no me pueda dar dinero si excedo su limite diario
            if (monto>=9000){
                System.out.println("El monto excede el máximo permitido por cajero");
                return ticket;
            } else if (cuenta.getSaldo()<monto) { //Si la cuenta no tiene saldo suficiente
                System.out.println("Saldo insuficiente en tu cuenta");
                return ticket;                
            } else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) { //Si el monto deja debajo del min
                System.out.println("El retiro dejaría la cuenta por debajo del mínimo");
                return ticket;
            }else{ //Si si se puede realizar actualizamos saldo
                cuenta.setSaldo(cuenta.getSaldo()-monto);
                ticket = new Ticket(cajeroId, new Date(), folio++, cuenta.getSaldo(), sucursal, cuenta.getUsuario());
                return ticket;
            }
        }else { //Si no existe la cuenta
            System.out.println("La cuenta no esta asociada a ningun cliente");
            return ticket;
        }
    }

    @Override
    public Ticket depositar(int numCuenta, double monto) {
        //Ticket vacio
        Ticket ticket = null;
        //Debemos hacer validaciones, primero buscamos la cuenta que queremos
        if (consultar(numCuenta)!=null){
            Cuenta cuenta=consultar(numCuenta);
            if (monto>cuenta.getSaldoMax()){
            System.out.println("No puedes depositar más que tu saldo máximo permitido en la cuenta");
            return ticket;
            } else if (monto + cuenta.getSaldo() > cuenta.getSaldoMax()) {
                System.out.println("Tu saldo excedería el saldo máximo permitido con ese deposito");
                return ticket;
            } else if (monto > 10000) {
                System.out.println("El monto excede el máximo permitido por el cajero");
                return ticket;
            } else {
                cuenta.setSaldo(cuenta.getSaldo()+monto);
                ticket = new Ticket(cajeroId, new Date(), folio++, cuenta.getSaldo(), sucursal, cuenta.getUsuario());
                return ticket;
            }
        }else {
            System.out.println("La cuenta no esta asociada a ningun cliente");
            return ticket;
        }
    }


}
