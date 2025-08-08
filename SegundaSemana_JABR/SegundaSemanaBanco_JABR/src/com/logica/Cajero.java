package com.logica;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

import java.util.Date;
import java.util.Map;

public class Cajero implements IMetodos {

    //En el paquete com.logica se definen las clases que
    //se encargaran de resolver las operaciones (logica)

    private String sucursal;
    private int cajeroId;
    private Map<Integer, Cuenta> cuentas; //El cajero accedera
    //a un Map que simulara una pequeña base de datos

    //Vamos a declarar una variable auxiliar para incrementar
    //el numero de folio del Ticket
    private int folio=1;

    public Cajero(){}

    public Cajero(String sucursal, int cajeroId, Map<Integer, Cuenta> cuentas) {
        this.sucursal = sucursal;
        this.cajeroId = cajeroId;
        this.cuentas = cuentas;
    }


    @Override
    public Cuenta consultar(int numCuenta) {
        //Creamos una cuenta vacia inicialmente
        Cuenta cuenta = null;
        //Buscamos la cuenta en el Map (que simula la base de datos) por medio del
        //numero de cuenta (key del Map)
        cuenta = cuentas.get(numCuenta); //si la cuenta existe, guardamos esa
        //info en el objeto cuenta

        return cuenta; //devolvemos la info de la cuenta
    }

    @Override
    public Ticket retirar(int numCuenta, double monto) {
        //Creamos un Ticket vacio
        Ticket ticket = null;

        //Necesitamos hacer validaciones para esta operacion
        //Primero buscamos la cuenta que queremos manipular
        if (consultar(numCuenta)!=null){
            //Guardamos la info de la cuenta a manipular
            Cuenta cuenta = consultar(numCuenta);
            //Validamos que el cajero no me pueda dar dinero, si excedo su limite diario
            if(monto>=12000){
                System.out.println("El monto excede el maximo permitido por el cajero");
                return ticket;
            }else if(cuenta.getSaldo()<monto){ //si mi cuenta no tiene saldo suficiente
                System.out.println("Saldo insuficiente en la cuenta");
                return ticket;
            }else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()){ //si el monto deja por debajo del min a la cuenta
                System.out.println("El retiro dejaría por debajo del minimo a la cuenta");
                return ticket;
            }else{ //si el retiro puede realizarse
                //Actualizamos el saldo de la cuenta
                cuenta.setSaldo(cuenta.getSaldo()-monto);
                //Emitimos o creamos un Ticket para devolver con todos los datos
                ticket = new Ticket(folio++, new Date(), cuenta.getNombreUsuario(), cuenta.getSaldo(), sucursal, cajeroId);
                return ticket; //devolvemos el ticket que indica que el retiro se realizo
            }
        }else{ //Si al buscar la cuenta, esta no existe
            System.out.println("No existe la cuenta asociada a ese cliente");
            return ticket;
        }
    }

    @Override
    public Ticket depositar(int numCuenta, double monto) {
        Ticket ticket = null;
        //Buscamos la cuenta a manipular
        if(consultar(numCuenta)!= null){
            Cuenta cuenta = consultar(numCuenta);
            //Validamos, si el monto que queremos depositar es mayor al saldo Maximo de la cuenta
            //No se podrá realizar el deposito
            if(monto>cuenta.getSaldoMax()){
                System.out.println("El monto a depositar excede el saldo máximo permitido por la cuenta");
                return ticket;
            }else if (monto+cuenta.getSaldo()>cuenta.getSaldoMax()){
                System.out.println("El monto haría exceder a la cuenta el su saldo máximo permitido");
                return ticket;
            }else if (monto>=10000){
                System.out.println("No se pueden realizar depositos mayores a 10,000. Por favor pase a ventanilla");
                return ticket;
            }else{
                //Actualizamos el saldo de la cuenta, sumandole el monto
                cuenta.setSaldo(cuenta.getSaldo()+monto);
                ticket = new Ticket(folio++, new Date(), cuenta.getNombreUsuario(), cuenta.getSaldo(), sucursal, cajeroId);
                return ticket;
            }
        }else{
            System.out.println("No existe una cuenta asociada a ese cliente");
            return ticket;
        }
    }
}
