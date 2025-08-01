package com;

public class EstructurasCondicionales {

    public static void main(String[] args) {

        // Estructuras condicionales o estructuras de decisión if
        // evaluan valores booleanos

        /*
            si (esto es verdadero){
                ejecuta este bloque de código
             } si no/ de otro modo{
                ejecuta este otro bloque
             }
         */

        int x = 9;

        System.out.println("Evaluamos el valor de x");

        if (x<=9){
            System.out.println("Cierto");
        }else{
            System.out.println("Falso");
        }

        // CONDICIONES COMPUESTAS CON OPERADORES LOGICOS
        // AND, OR, NOT, DIFERENTE DE, IGUALDAD

        // AND - && - Nos va a ejecutar el primer bloque (true) cuando
        // TODAS las condiciones se cumplan

        System.out.println("Ejemplo de operador AND");

        if (x<30  && x>9){
            System.out.println("Cierto");
        }else{
            System.out.println("Falso");
        }

        // OR - || - Devuelve el bloque true cuando se cumple al menos UNA
        // condición

        System.out.println("Ejemplo de operador OR");

        if (x<30 || x>9){
            System.out.println("Cierto");
        }else{
            System.out.println("Falso");
        }

        // NOT - ! - Niega una condición, o visto de otro modo, cambia el valor
        // de una condición de verdadera a falsa y viceversa

        System.out.println("Ejemplo de operador NOT");

        if (!(x<8)){
            System.out.println("Cierto");
        }else{
            System.out.println("Falso");
        }

        // IGUALDAD O COMPARACION - == - Compara un valor contra otro
        // y devuelve true si son iguales

        System.out.println("Ejemplo de operador IGUALDAD");

        if (x == 11){
            System.out.println("Cierto");
        }else{
            System.out.println("Falso");
        }

        // DIFERENTE DE - != - Compara un valor contra otro, pero devuelve true
        // si los valores son diferentes

        System.out.println("Ejemplo de operador NOT");

        if (x != 9){
            System.out.println("Cierto");
        }else{
            System.out.println("Falso");
        }

        // Estructura if else anidada
        // Nos permite evaluar más de un "panorama" o posibilidad
        // Y no solo si algo se cumple o no

        // Ejemplo. Supongamos que le pedimos al usuario que ingrese un valor por teclado
        // para elegir un día a la semana

        int dia = 3;

        // Procedemos a evaluar que hacer con esa opción que el usuario dio
        if (dia == 1){
            System.out.println("Lunes");
        }else if (dia == 2){
            System.out.println("Martes");
        }else if (dia == 3){
            System.out.println("Miércoles");
        }else if (dia == 4){
            System.out.println("Jueves");
        }else if (dia == 5){
            System.out.println("Viernes");
        }else{
            System.out.println("Error");
        }

        // switch case - Evalua los posibes casos a ejecutar de acuerdo al valor de una variable

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Error");
                break;
        }

    }

}