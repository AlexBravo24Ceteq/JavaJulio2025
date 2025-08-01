package com.condicionales;

import java.util.Scanner;

public class Condicionales13_FCAS {

    public static void  main(String[] args) {

        /*
        13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
        centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
        Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
        y el resto se invierte en la bolsa.
        Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
        niños y el resto se invierte en la bolsa.
        La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
        */

        System.out.println("\uD835\uDCEC=======================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==REPARTO DE DONACIÓN==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        double Donacion;
        double Salud;
        double Comedor;
        Double Bolsa;

        System.out.println("¿Cuál es el monto de la donación de este año?");
        Donacion = entrada.nextDouble();

        if (Donacion >= 10000) {
            Salud = (Donacion*0.30);
            Comedor = (Donacion*0.50);
            Bolsa = (Donacion*0.20);
            System.out.println("El ingreso de este año para el centro de salud será de: $" + Salud);
            System.out.println("El ingreso de este año para el comedor de niños será de: $" + Comedor);
            System.out.println("El ingreso de este año para la bolsa será de: $" + Bolsa);
        }else {
            Salud = (Donacion*0.25);
            Comedor = (Donacion*0.60);
            Bolsa = (Donacion*0.15);
            System.out.println("El ingreso de este año para el centro de salud será de: $" + Salud);
            System.out.println("El ingreso de este año para el comedor de niños será de: $" + Comedor);
            System.out.println("El ingreso de este año para la bolsa será de: $" + Bolsa);
        }

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC=======================\uD835\uDCEC");



    }
}
