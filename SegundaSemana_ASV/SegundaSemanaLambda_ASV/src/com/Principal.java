package com;

public class Principal {
    public static void main(String[] args) {
        //Exoresiones o funciones Lambda
        //Son expresiones o funciones anonimas que
        //que implementan una interface
        //funcional

        //Esto nos permite definir ese metodo para
        //Su uso inmediato, sin nesecidad de crear una clase
        //que lo defina

        //Su Operador es  (->)
        //Su Sintaxis es (parametros) -> {(cuerpo de lambda)};

        //Crear una instancia de una clase anonima, que implemente nuestra
        //interface funcional

        IFuncional suma = (item1, item2) -> System.out.println("La suma es: "+(item1+item2));

        //Puedo utilizar el metodo llamado operacion,
        //a traves del objeto suma
        suma.operacion(20, 34);

        IFuncional resta = (x, y) -> System.out.println("La resta es: "+ (x-y));
        resta.operacion(20, 11);
    }
}
