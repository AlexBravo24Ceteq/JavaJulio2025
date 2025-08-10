package com;

import com.logica.Cajero;
import com.modelo.Cuenta;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {

        //Creando el map que represantara la BD de cuentas
        Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

        //Creamos cuentas directamente en el map // reglas de negocio
        cuentas.put(1001, new Cuenta("Alfredo", 10000.50, 1000, 50000,"Credito"));
        cuentas.put(1002, new Cuenta("Alex", 300, 100, 12000,"Credito"));
        cuentas.put(1003, new Cuenta("Emanuel", 10000.50, 4000, 50000,"Credito"));
        cuentas.put(1004, new Cuenta("Karla", 3000.50, 1000, 50000,"Credito"));


        //CREAMOS UN NUEVO CAJERO con sus valores y acceso  al aBD (nuestro map llamado cuentas)
        Cajero cajero1 = new Cajero("Polanco", 417, cuentas);

        //Pronbando el primer metodo de mi cajero llamado consultar
        System.out.println(cajero1.consultar(1001));

        //Probando el metodo retirar cuanto si retira
        System.out.println(cajero1.retirar(1001,300));
        //probando validacion si es mayo de 9000
        System.out.println(cajero1.retirar(1001,9000));
        //probando validacion de saldo min
        System.out.println(cajero1.retirar(1001,7000));
        //provando validacion de saldo insuficiente
        System.out.println(cajero1.retirar(1001,12000));
        //Cuando no existe la cuenta
        System.out.println(cajero1.retirar(1006,300));
        //Provando validacion de exediendo el monto
        System.out.println(cajero1.retirar(1001,13000));

        System.out.println("********************************************************************************************************");

        //PROBANDO VALIDACION DE DEPOSITAR
        System.out.println("Depositar "+cajero1.depositar(1001,90000));
        System.out.println();
        System.out.println("Depositar "+cajero1.depositar(1001,9000));
        System.out.println();
        System.out.println("Depositar "+cajero1.depositar(1001,1000));
        System.out.println();
        System.out.println("Depositar "+cajero1.depositar(1012,1200));
        System.out.println();
        System.out.println("Retiro "+cajero1.retirar(1001,30000));
        System.out.println("Retiro "+cajero1.retirar(1001,5000));
        System.out.println();
        System.out.println("Retiro "+cajero1.retirar(1001,9000));
        System.out.println();
        System.out.println("Retiro "+cajero1.retirar(1001,7000));

    }
}
