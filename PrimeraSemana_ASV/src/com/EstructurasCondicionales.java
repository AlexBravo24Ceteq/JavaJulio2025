package com;

public class EstructurasCondicionales {
    public static void main(String[] args) {
        //Estructuras condicionales o estructuras de desicion if
        //evaluan valores booleanos

        /*
        SI (esto es verdadero)
            ejecura este bloque de codigo
            } si no/ de otro modo
              ejecuta este otro bloque
              }
         */

        int x = 9;
        System.out.println("Evaluamos el valor de x");

        if(x <= 9){
            System.out.println("Cierto");
        }
        else{
            System.out.println("Falso");
        }

        //Condiciones compuestas con operadores Logicos
        //And, Or, NOT, Diferente de, IGUALDAD

        // AND - && Nos va a ejecutar el primer bloque (true) cuando
        //todas las condiciones se cumplan

        System.out.println("Ejemplo de Operador AND");
        if(x <= 30 && x > 8){
            System.out.println("Cierto");
        }
        else {
            System.out.println("Falso");
        }
        //OR - || Devuelve el bloque true cuando se cumple
        //al menos una condicion

        System.out.println("Ejemplo de Operador OR");
        if(x <= 30 || x > 8){
            System.out.println("Cierto");
        }
        else {
            System.out.println("Falso");
        }

        //NOT Niega una condicion , o visto de otro modo
        //cambia el valor de una condicion de verdadera a falsa
        // y viceversa

        System.out.println("Ejemplo de Operador NOT");
        if(!(x>12)){
            System.out.println("Cierto");
        }
        else {
            System.out.println("Falso");
        }

        //Igualdad o comparacion - ==
        //Compara un valor contra otro
        //Devuelve true si son iguales

        System.out.println("Ejemplo de Operador IGUALDAD");
        if(x == 12){
            System.out.println("Cierto");
        }
        else {
            System.out.println("Falso");
        }

        //Operador Diferente de - !=
        //Compara un valor contra otro, pero devuelve true
        //Si los valores son diferentes

        System.out.println("Ejemplo de Operador DIFERENTE DE");
        if(x != 15){
            System.out.println("Cierto");
        }
        else {
            System.out.println("Falso");
        }

        //Estructura if else anidada
        //Nos permite evaluar mas de un "Panorama" o posibilidad
        //y no solo si algo se cumple o no

        //EJ. Supongamos que le pedimos al usuario que ingrese un valor por teclado
        //Para elegir un dia de la semana

        int dia = 5;

        //Procedemos a evaluar que hacer con esa opcion que el usuario dio

        if(dia == 1){
            System.out.println("Lunes");

        } else if (dia == 2) {
            System.out.println("Martes");

        } else if (dia == 3) {
            System.out.println("Miercoles");

        } else if (dia == 4) {
            System.out.println("Jueves");

        } else if (dia == 5) {
            System.out.println("Viernes");

        }

        else {
            System.out.println("Error");
        }

        //Switch case - evalua los posibles casos a ejecutar de acuerdo
        //al valor de una variable
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
                System.out.println("Viernes");
            break;

            default:
                System.out.println("Error");
            break;



        }


    }
}
