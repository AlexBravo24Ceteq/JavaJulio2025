package com.ciclos;

public class Ciclos6_FCAS {
    public static void  main(String[] args) {

        /*
         6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
         mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
         todo el dinero lo reinvierte?
         */

        //inver * Math.pow(1 + interes,periodos); //Esta es la formula más sencilla y rápida.
        //pero aun así se puede usar el for

        System.out.println("\uD835\uDCEC======================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==MONTO DE INVERSIÓN==\uD835\uDCEC");

        double interes = 1.02;
        double  montoF=1000;
        for (int periodos = 0; periodos < 12 ; periodos++){
            montoF= montoF * interes;
                    }
        System.out.printf("El monto final después del año es: %.2f%n", montoF);

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC======================\uD835\uDCEC");

    }
}
