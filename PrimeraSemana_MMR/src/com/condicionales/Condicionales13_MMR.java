package com.condicionales;

import java.util.Scanner;

public class Condicionales13_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
            centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
            Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
            y el resto se invierte en la bolsa.
            Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
            niños y el resto se invierte en la bolsa.
            La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
         */
        System.out.println("==============================");
        System.out.println("=====INSTITUCIÓN BENÉFICA=====");
        System.out.println("==(distribución de donación)==");

        float donacion, centroSalud, comedorN, bolsa;
        System.out.println("Ingresa donación");
        donacion = entrada.nextFloat();

        if (donacion >= 10000){
            centroSalud = (float)(donacion*.30); //30%
            comedorN = (float)(donacion*.50); //50%
            bolsa = (float)(donacion*.20); //20%
        } else {
            centroSalud = (float)(donacion*.25); //30%
            comedorN = (float)(donacion*.60); //50%
            bolsa = (float)(donacion*.15); //20%
        }

        System.out.println("La donación será distribuida de la siguiente manera:");
        System.out.println("centro de salud:"+centroSalud);
        System.out.println("comedor de niños:"+comedorN);
        System.out.println("bolsa:"+bolsa);

        System.out.println("============FIN============");
    }
}
