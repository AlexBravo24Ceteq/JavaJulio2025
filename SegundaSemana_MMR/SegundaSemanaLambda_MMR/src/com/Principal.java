package com;

import javax.sound.midi.Soundbank;

public class Principal {
    public static void main(String[] args) {
        /* Expresiones o funciones Lambda, son expresiones o funciones anonimas que
        implementan una interface funcional

        Esto nos permite definir ese metodo para su uso inmediato sin necesidad de creear
        una clase que lo defina

        Su operador es (->) y su sintaxis es (parametros) -> (cuerpo de lambda)
         */

        /*Crear instancia de una clase anonima, que implemente nuestra interface funcional */
        IFuncional suma = (a ,b ) -> System.out.println("La suma es: "+(a+b));

        //puedo utilizat el metodo llamado operacion a traves del objeto suma
        suma.operacion(19, 2);

        IFuncional resta = (x, y) -> System.out.println("La resta es: " +(x-y));
        resta.operacion(10,7 );
    }
}
