package com.logica;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

import java.util.Date;
import java.util.Map;

public class Cajero implements IMetodos {
    //AQUI NO SE NECESITAN GETTERS Y SETTERS YA QUE SOLO SE ENCARGA DE LA LOGICA
    //En el paquete com.logica se definen las clases
    //que se encargaran de resolver las operaciones (logica)

    private String sucursal;
    private  int cajeroId;
    private Map<Integer, Cuenta> cuentas;//el cajero accedera a un Map que simula la bd

    //vamos a declarar una variable auxiliar para incrementar el numero de folio
    private int folio = 0;

    public Cajero() {
    }

    public Cajero(String sucursal, int cajeroId, Map<Integer, Cuenta> cuentas) {
        this.sucursal = sucursal;
        this.cajeroId = cajeroId;
        this.cuentas = cuentas;
    }

    @Override
    public Cuenta consultar(int numCuenta) {
        //Creamos a una cuenta vacia
        Cuenta cuenta = null;
        //Buscamos la cuenta en el Map ( simula la bd) por medio del
        //numero de cuenta (Key del Map)
        cuenta = cuentas.get(numCuenta); //si existe la cuenta guardamos esa info en objeto cuenta
        return cuenta; //devolvemos la info de la cuenta
    }

    @Override
    public Ticket retirar(int numCuenta, double monto) {
        //Creamos un tiket vacio
        Ticket ticket = null;
        //necesitamos hacer validaciones para esta operacion
        //Primero necesitamos buscar la cuenta que queremos manipular
        if (consultar(numCuenta) != null) {
            //Guardamos la info de la cuenta a manipular
            Cuenta cuenta = consultar(numCuenta);
            //Validamos que el cajero nome pueda dar dinero, si excedo el limite
            //UTILIZAMOS METODO GET PARA VER CUENTO TIENE
            if (monto >= 12000) {
                System.out.println("El monto execede el maximo permitido por el cajero");
                return  ticket;
            } else if (cuenta.getSaldo()<monto) {//si mi cuetna no tiene suficiente saldo
                System.out.println("Saldo insuficiente en la cuenta");
                return ticket;
            } else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {//si el monto deja por debajo del min ala cuenta
                System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
                return ticket;
            }else {//Si el retiro es exitoso
                //Actualizamos el saldo de la cuenta
                cuenta.setSaldo(cuenta.getSaldo()-monto);
                //emitimos o creamos un tiket para devolver todos los datos de la operacion exitosa
                ticket = new Ticket(folio++,new Date(), cuenta.getNombreUsuario(),cuenta.getSaldo(),sucursal,cajeroId);
                return ticket; // devolvemos el tiket que indica que el retiro se realizo
            }
        }else {
            //Si la cuenta no existe mandamos un mensjae qu eno existe la cuenta
            System.out.println("No existe la cuenta asociada a este cliente");
            return ticket;
        }
    }
    @Override
    public Ticket depositar(int numCuenta, double monto) {

        Ticket ticket = null;
        //Buscamos la cuenta a manipular
        if (consultar(numCuenta) != null) {
            Cuenta cuenta = consultar(numCuenta);//EST linea nos da acceso ala hashMap o la BD
            //Validamos si el monto es mayor al saldo maximo
            //No se podra hacer el deposito
            if (monto>cuenta.getSaldoMax()) {
                System.out.println("El monto a depositar exceda al saldo maximo permitido por la cuetna");
                return ticket;
            } else if (monto+cuenta.getSaldo()>cuenta.getSaldoMax()) {
                System.out.println("El monto haria exceder a la cuenta en su saldo meximo permitido");
                return ticket;
            } else if (monto>10000) {
                System.out.println("No puedes realizar depositos mayores a 10,000. Pasar a ventanilla");
                return ticket;
            }else {
                //Actualizamos el saldo de la cuenta, sumandole el monto
                //METODO SET PARA AUMENTAR Y MENTER EL VALOR MAS LO QUE TENGA
                cuenta.setSaldo(cuenta.getSaldo()+monto);
                ticket = new Ticket(folio++,new Date(), cuenta.getNombreUsuario(),cuenta.getSaldo(),sucursal,cajeroId);
                return  ticket;
            }

        }else {
            System.out.println("No existe una cuenta asociada a ese cliente");
            return ticket;
        }

    }
}
