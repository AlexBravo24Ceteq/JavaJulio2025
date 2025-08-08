package com;

import com.logica.Cajero;
import com.modelo.Cuenta;

import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {

        //Crear el Map que representara una base de datos de objetos Cuenta

        Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

        //Creamos cuentas directamente en el Map
        cuentas.put(1001, new Cuenta("Alex", 1000.50, 100, 50000, "Debito"));
        cuentas.put(1002, new Cuenta("Eduardo", 200.99, 100, 12000, "Debito"));
        cuentas.put(1003, new Cuenta("Emmanuel", 10000.50, 4000, 100000, "Debito"));
        cuentas.put(1004, new Cuenta("Karla", 3000.50, 1000, 50000, "Debito"));

        //Creamos un nuevo cajero con sus valores y acceso a la BD (nuestro Map llamado cuentas)
        Cajero cajero1 = new Cajero("Polanco", 417,cuentas);

        //Probar el primer metodo de mi cajero que se llama consultar
        System.out.println(cajero1.consultar(1004));

        //Probar retirarle a Eduardo 1000 pesos, cuando tiene 200 en su cuenta
        System.out.println(cajero1.retirar(1002, 1000));

        //Probar retirar un monto de una cuenta que no existe
        System.out.println(cajero1.retirar(1009, 100));

        //Probar retirar 9000 o más de una cuenta
        System.out.println(cajero1.retirar(1003, 9000));

        //Probar retirar 8000 a la cuenta de Emmanuel, pero esto la dejaría por debajo de su saldo minimo
        System.out.println(cajero1.retirar(1003, 8000));

        //Realizamos un retiro exitoso

        //Probamos el método depositar
        System.out.println(cajero1.depositar(1004,9000));
        System.out.println(cajero1.depositar(1004,6000));
        System.out.println(cajero1.depositar(1004,9999));

        /*
        ACTIVIDAD: Van a crear un proyecto que simule el funcionamiento de una máquina expendedora
        de productos.
        Igual que este, van a necesitar una clase que ejecute la logica (MaquinaExp)
        Una clase que recupere info del producto (Producto)
        Un HashMap donde guardar los productos que tiene la maquina y la clave puede ser
        un String ("A1")
        Al final la maquina tendrá que despachar el producto. Necesitarian una interface
        con un método que busque el producto y si existe, despacharlo.
         */

    }

}
