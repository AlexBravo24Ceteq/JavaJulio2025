package com;

public class Principal {
    public static void main(String[] args) {

        //Expreciones o funciones lambda
        //Son expresiones o funciones anonimas que implementa el metodo d euna interface funcional
        //Esto nos permite definir definir este metodo para su uso
        //inmediato sin necesidad de crear
        //una clase que lo defina
        //su operador es (->)
        //su sintaxis es (parametros) -> {(cuerpo de lambda)};
        //Crear una instancia de una clase anonima que implemente nuestra interface funcional
        IFuncional suma = (x,y)-> System.out.println("La suma es: " + (x+y));
        //Mando a llamar mi interface y le puedo cambiar el nombre de las variables declaras
        //en la interface se lla a y b y aqui se llaman x e y

        //Puedo utilizar el metodo aqui
        suma.operacion(29,3);
        //Se pueden implementar nuevas operaciones con las mismas varialbe

        IFuncional resta = (x,y) -> System.out.println("La resta es: "+ (x-y));

        resta.operacion(20,18); // aqui ya se ingresan los vaolres para la operacionr

    }
}
