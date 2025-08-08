package com.ciclos;

public class Ciclos7_FCAS {
    public static void  main(String[] args) {

        System.out.println("\uD835\uDCEC======================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==MONTO DE INVERSIÓN==\uD835\uDCEC");

        /*
         7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
         mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su dinero?
         */

        double interes = 1.02;
        double  montoF=700;
        int periodos = 0;

        for (; montoF<1500; periodos++){
            montoF= montoF * interes;
        }

        System.out.printf("El monto final es: %.2f%n", montoF);
        System.out.println("Y se consiguió en " + periodos + " meses");

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC======================\uD835\uDCEC");

    }
}
