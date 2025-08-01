package com.ciclos;

import java.util.Scanner;

public class Ciclos12_FCAS {
    public static void  main(String[] args) {

         /*
        12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
        cuando el promedio de las edades sea superior a 25.
        */

        System.out.println("\uD835\uDCEC========================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC===PROMEDIO DE EDADES===\uD835\uDCEC");


        Scanner entrada = new Scanner(System.in);
        int edades;
        int sumEdades = 0;
        int nEdades = 0;
        double promedio = 0;

            // Intenté hacerlo con For, pero buscando encontré que for sirve más para situaciones donde
            //conoces la cantidad de iteraciones. Aún así, el codigo es exactamente el mismo
            //con la excepción del comando principal, con el for solo tomaremos la parte centra.
            //Ej. for (; promedio <= 25;) {

        while (promedio <= 25){
            System.out.println("Introduce una edad: ");
            edades = entrada.nextInt();
            sumEdades += edades;
            nEdades++;

            promedio = (double) sumEdades / nEdades;

            System.out.println("El promedio actual de las edades es: " + promedio);
        }
            System.out.println("El promedio de las edades al final es: " + promedio);
            System.out.println("La cantidad de edades es: " + nEdades);

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC========================\uD835\uDCEC");
    }
}
