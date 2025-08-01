package com;

public class EstructurasCondicionales {
    public static void main(String[] args) {
        int x=9;
        /*
        NOT - niega una condicion
        cambia el valor de la condicion de verdadera a falso y viceversa
         */
        System.out.println("Ejemplo de operador Not");
        if (!(x<8)){
            System.out.println("Cierto");
        }else{
            System.out.println("Falso");
        }
        /*
        igualdad o comparacion  == - compara un valor contra otro
        y devuelve si tru si son iguales
         */
        System.out.println("Ejemplo de operador ==");
        if (x==12){
            System.out.println("Cierto");
        }else{
            System.out.println("Falso");
        }
        /*
        diferente de != compara un valor de otro y devuelve true si los valores
        son diferentes
         */

        System.out.println("Ejemplo de operador !=");
        if (x!=12){
            System.out.println("Cierto");
        }else{
            System.out.println("Falso");
        }
        /*
        Estrucura if else anidado
        permite evaluar mas de un "panorama" o posibilidad
         y no solo si se cumple o no

         Ejemplo supongamos que el usuario ingrese un valor por teclado
         para elegir un dia de la semana
         */

        int dia =2 ;
        //procedemos a evaluar que hacer con esta opcion que el usuario dio.
        if (dia==1){
            System.out.println("Lunes");
        } else if (dia==2) {
            System.out.println("Martes");
        } else if (dia==3) {
            System.out.println("Miercoles");
        } else if (dia==4) {
            System.out.println("Jueves");
        }else if (dia==5){
            System.out.println("Viernes");
        }else {
            System.out.println("Error");
        }

        /*
        switch case evalua los posibles casosa a ejecutar
        deacuerdo al valor de una variable
         */

        switch (dia) {
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
                System.out.println("viernes");
                break;
            default :
                System.out.println("Error");
                break;

        }

    }
}
