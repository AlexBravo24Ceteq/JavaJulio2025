package com;

public class EstructurasCondicionales {
    public static void main(String[] args) {
        /* Estructuras condicionales o esructuras de decision if
            * evaluan valores boleanos
        */
        /*
            si (verdadero) {
                ejecuta este bloque de codigo
            } si no / de otro modo {
                ejecuta este otro bloque
            }
        */
        int x = 9;

        System.out.println("Evaluamos x");
        if (x<=9) {
            System.out.println("Cierto");
        } else {
            System.out.println("falso");
        }

        //CONDICIONES COMPUESTAS CON OPERADORES LOGICOS
        //AND, OR, NOT, DIFERENTE DE, IGUALDAD
        /* AND - && - Nos va a ejecutar el primer bloque (true) cuando
            TODAS las condiciones se cumplan
         */
        System.out.println("Operador AND");
        if (x<30 && x>=9){
            System.out.println("Cierto");
        } else {
            System.out.println("Falso");
        }

        /*OR - || - Devuelve el bloque true cuando se cumple al menos
            UNA condicion
         */
        System.out.println("Operador OR");
        if (x<30 || x>9){
            System.out.println("Cierto");
        } else {
            System.out.println("Falso");
        }

        /*NOT - Niega una condicion, o visto de otro modo, cambia el valor
            de una condicion de verdadera a falsa y viceversa
         */
        System.out.println("Operador NOT");
        if (!(x<8)){
            System.out.println("Cierto");
        } else {
            System.out.println("Falso");
        }

        /* IGUALDAD O COMPARACION - == - Compara un valor contra otro
            y devuelve true si son iguales
         */
        System.out.println("Operador IGUALDAD");
        if (x == 11){
            System.out.println("Cierto");
        } else {
            System.out.println("Falso");
        }

        /* DIFERENTE DE - != - Compara un valor contra otro pero devuelve
            true si los valores son diferentes
         */
        System.out.println("Operador DIEFERENTE DE");
        if (x != 11){
            System.out.println("Cierto");
        } else {
            System.out.println("Falso");
        }

        //ESTRUCTURA IF ELSE ANIDADA
        //Evaluar mas de una posibilidad
        /*Ej. Supongamos que le pedimos al usuario que ingrese un valor por teclado
            para elegir un dia de la semana   */
        int dia = 3;
        //evaluar el dia asignado
        if (dia == 1){
            System.out.println("Lunes");
        } else if (dia == 2) {
            System.out.println("Martes");
        } else if (dia == 3) {
            System.out.println("Miercoles");
        } else if (dia == 4) {
            System.out.println("Jueves");
        } else if (dia == 2) {
            System.out.println("Viernes");
        } else {
            System.out.println("Error");
        }

        //switch case - evalua los posibles casos a ejecutar de acuerdo al valor de una variable
        switch (dia){
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
            default:
                System.out.println("Error");
                break;
        }
    }
}
