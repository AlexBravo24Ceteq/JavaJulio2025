package com;

import com.logica.Cajero;
import com.modelo.Cuenta;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        /* crear el map que representara una base de datos de objetos cuenta */
        Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

        //creamos cuentas directamente en el map
        cuentas.put(1001, new Cuenta("Alex", 10000.50, 4000, 50000, "Debito"));
        cuentas.put(1002, new Cuenta("Eduardo", 200.99, 100, 12000, "Debito"));
        cuentas.put(1003, new Cuenta("Emmanuel", 10000.50, 4000, 100000, "Debito"));
        cuentas.put(1004, new Cuenta("Karla", 3000.50, 1000, 50000, "Debito"));

        //Creamos un nuevo cajero con sus valores y acceso a la DB (cuentas)
        Cajero cajero1 = new Cajero("Polanco", 417, cuentas);

        //probar metodo consultar
        System.out.println(cajero1.consultar(1009));

        //probar retirar a Eduardo 1000, cuando tiene 100 en su cuenta
        System.out.println(cajero1.retirar(1002, 100));

        //probar retirar a cuenta que no existe
        System.out.println(cajero1.retirar(1009, 100));

        //retirrar mas de lo permitido en el cajero
        System.out.println(cajero1.retirar(1003, 9000));

        //retirar por debajo del minimo
        System.out.println(cajero1.retirar(1003, 8000));

        //retirar exitoso
        System.out.println(cajero1.retirar(1003, 800));

        //metodo depositar
        System.out.println(cajero1.depositar(1004, 9000));
        System.out.println(cajero1.depositar(1004, 6000));
    }
}
