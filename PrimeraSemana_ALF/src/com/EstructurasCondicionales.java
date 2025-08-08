package com;

public class EstructurasCondicionales {
    public static void main(String[] args) {

        //Estructuras condicionales o estructuras de decisiones if
        //Evaluan valores booleanos
        System.out.println("Evaluamos el valor de x");
        int x = 9;
        if(x < 5){
            System.out.println("El valor es mayor");
        }else {
            System.out.println("El valor es menor");
        }

        //CONCIONES COMPUESTAS CON OPERADORES LOGICOS
        // AND, OR, DIFERENTE DE , IGUALDAD
        //AND- &&- Nos ejecuta el primer bloque (true) cuando
        // todas las condiones se cumplen
        System.out.println(("EJEMPLCO CON OPERADOR AND (&&)"));
        if(x<9 && x>10){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }
        System.out.println(("EJEMPLCO CON OPERADOR OR (||)"));
        //OPERADOR OR- ||Devuelve el bloque true cuando almenos
        //se cumple una condicon
        if(x<=9 || x>10){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }

        //NOT- ! Niega una condicion o cambia el valor de una condicion
        //de verdadera a falsa o viseversa
        System.out.println(("EJEMPLCO CON OPERADOR NOT (!)"));
        if(!(x<30)){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }

        //IGUALDAD Y COMPARACION == COMPARA DOS VALORES Y DEVUELVE UN TRUE
        //SI SE CUMPLE
        System.out.println("Ejemplo de operador de igualdad (==)");
        if(x==9){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }
        System.out.println("Ejemplo de operador de diferente de (!=)");
        //DIFERENTE DE != COMPARA DOS VALORES DE TIPO NUMERICO
        //DEVUELVE UN TRUE SI SON DIFERENTES
        if(x!=30){
            System.out.println("Cierto");
        }else {
            System.out.println("Falso");
        }

        //IF ANIDADO
        int dia = 3;
        if(dia == 1){
            System.out.println("El dia el lunes");

        } else if (dia == 2) {
            System.out.println("El dia el martes");
        } else if (dia == 3) {
            System.out.println("El dia el Miercoles");
        } else if (dia == 4) {
            System.out.println("El dia el Jueves");
        } else if (dia == 5) {
            System.out.println("El dia el Viernes");
        } else if (dia == 6){
        }System.out.println("Ingresa un valor correcto");

    }
}
