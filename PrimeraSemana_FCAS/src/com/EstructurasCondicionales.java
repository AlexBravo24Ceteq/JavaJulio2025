package com;

import com.sun.source.tree.IfTree;

public class EstructurasCondicionales {

    public static void  main(String[] args) {

        //También llamadas estructuras de decisión if
        //Evaluan valores booleanos

        /*
        Si (esto es verdadero){
            ejecuta este bloque de codigo
           } Si no/ de otro modo{
            ejecuta este bloque
           }
        */

        int x = 9;

        System.out.println("Evaluamos si x es menor a 10");

        if (x<10){
            System.out.println("Verdadero");
        }

        //En el caso de que el valor que pongas a comparación de x, sea lo contrario
        //Y no tengas otro comando, se quedará sin hacer nada

        System.out.println("Evaluamos el valor de x");
        if (x<5){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        System.out.println("Evaluamos el valor de x");
        if (x<=9){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        //Hay condiciones compuestas con otros operadores lógicos
        //AND, OR, NOT, DIFERENTE DE, IGUALDAD

        //AND -> && -> Ejecuta el primer bloque (true) cuando todas las condiciones
        //se cumplen

        System.out.println("Ejemplo de operador AND");
        if (x<=9 && x>10){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        //OR -> || (junto al 1) -> Devuelve el bloque true cuando se cumple como mínimo
        //una condición

        System.out.println("Ejemplo de operador OR");
        if (x<30 || x>9){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        //NOT-> ! -> Niega una condición o visto de otro modo, cambia el valor de una condición
        //de verdadera a falsa y viceversa

        System.out.println("Ejemplo de operador NOT");
        if (!(x<30)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        //IGUALDAD O COMPARACIÓN -> == -> Compara un valor contra otro y devuelve true
        //Si son iguales

        System.out.println("Ejemplo de operador IGUALDAD");

        if (x == 11){
            System.out.println("Afirmativo");
        }else{
            System.out.println("Falso");
        }

        //DIFERENTE DE -> != -> Compara dos valores, pero devuelve true si son diferentes

        System.out.println("Ejemplo de operador DIFERENTE DE");

        if (x != 15 ){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        //Estructura if else anidada
        //Evalua más de un "panorama" o posibilidad, no solo si se cumple algo o no
        //Ej. Suponemos que pedimos al usuario que ingrese un valor para elegir un día

        int día = 3;

        //Evaluamos que hacer con la opcion que el usuario da
        if (día == 1){
            System.out.println("Lunes");
        }else if (día == 2){
            System.out.println("Martes");
        }else if (día == 3){
            System.out.println("Miercoles");
        }else if (día == 4){
            System.out.println("Jueves");
        }else if (día == 5){
            System.out.println("Viernes");
        }else{
            System.out.println("Error");
        }

        //switch case -> evalua los posibles casos aejecutar de acuerdo al valor de
        //una variable

        switch (día){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Error");
        }





    }
}
