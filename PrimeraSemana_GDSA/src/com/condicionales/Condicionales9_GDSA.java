package com.condicionales;

import java.util.Scanner;

public class Condicionales9_GDSA {
    public static void main(String[] args) {
        /*
        9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
            introducimos otro número nos da un error.
         */
        System.out.println("///////////////////////////////////////////////");
        System.out.println("/ PROGRAMA PARA VER EL DIA DE LA SEMANA AL ////");
        System.out.println("///////////INTRODUCIR UN NUMERO////////////////");
        System.out.println("///////////////////////////////////////////////");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int numero = scanner.nextInt();
        String dia;
        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "ERROR: número incorrecto";
                break;
        }
        System.out.println("El día es: "+dia);
        System.out.println("///////////////FIN DEL PROGRAMA///////////////");

    }
}
