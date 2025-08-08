package com;

import com.logica.Cajero;
import com.modelo.Cuenta;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {

        //Creamos el Map que representará la base de datos de Cuenta
        Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

        //Creamos cuentas en el Map
        cuentas.put(1001, new Cuenta("Ricardo", 10000.50, 4000, 50000, "Debito"));
        cuentas.put(1002, new Cuenta("Sebastian", 150.50, 100, 15000, "Debito"));
        cuentas.put(1003, new Cuenta("Emanuel", 15000.50, 4000, 200000, "Debito"));

        //Creamos el cajero nuevo
        Cajero cajero1 = new Cajero("Polanco", 417, cuentas);

        //Probamos el método del cajero consultar

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>°<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>BANCO<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        System.out.println(cajero1.consultar(1003));
        System.out.println(cajero1.consultar(1009));

        //Probamos el método de retiro
        System.out.println(cajero1.retirar(1002, 1000));

        //Probamos retirar de una cuenta no existente
        System.out.println(cajero1.retirar(1009, 100));

        //Probamos retirar 9000 o más
        System.out.println(cajero1.retirar(1003, 9000));

        //Probamos retirar 8000 pero la deja por debajo del min
        System.out.println(cajero1.retirar(1001, 8000));

        //Retiro exitoso
        System.out.println(cajero1.retirar(1001, 800));


        //DEPOSITOS
            //Exceso de saldo máximo en deposito
        System.out.println(cajero1.depositar(1002, 20000));
            //Exceso de saldo máximo al sumar
        System.out.println(cajero1.depositar(1002, 14990));
            //Exceso por cajero
        System.out.println(cajero1.depositar(1003, 15000));
        //Deposito exitoso
        System.out.println(cajero1.depositar(1001, 9500));
        System.out.println(cajero1.depositar(1001, 5500));

        for(Cuenta i: cuentas.values()){
            System.out.println(i);
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>°<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>°<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        /*ACTIVIDAD. Crear un proyecto que simule una maquina expendedora.
        Igual que este se requiere una clase que ejecute logica (MaquinaExp)
        Una clase que recupere info del producto (Producto)
        HashMap que guarde los productos de la maquina, puede ser clave String ("A1")
        Al final la maquina despacha el producto, una interface con un método
        que busque el producto y si existe lo arroje.
        Puede o no enviar ticket.
         */



    }

}
