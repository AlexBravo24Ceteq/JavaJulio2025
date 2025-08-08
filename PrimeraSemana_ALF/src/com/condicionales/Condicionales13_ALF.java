package com.condicionales;

import java.util.Scanner;

public class Condicionales13_ALF {
    public static void main(String[] args) {

        /*13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
        centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
        Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
        y el resto se invierte en la bolsa.
        Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
        niños y el resto se invierte en la bolsa.
        La institución desea saber cuánto de dinero destinará a cada rubro anualmente.*/

        Scanner entrada = new Scanner(System.in);
        double donacion,porce20, porce30, porce50, porce25, porce60,porce15 ;
        System.out.println("Institución desea saber cuánto de dinero destinará a cada rubro anualmente.");
        System.out.println("***************************************************************************");
        System.out.println("Ingrese la cantidad de la donacion:");
        donacion = entrada.nextDouble();
        if(donacion >= 10000){
            porce30 = donacion * 0.30;
            porce50 = donacion * 0.50;
            porce20 = donacion * 0.20;
            System.out.println("LA CANTIDAD DE LA DONACION ES DE: "+ donacion+ " POR LO TANTO:");
            System.out.println("CORRESPONDE EL 30% AL CENTRO DE SALUD IGUAL A: "+ "$"+porce30);
            System.out.println("CORRESPONDE EL 50% AL COMEDOR DE NIÑOS IGUAL A: "+ "$"+porce50);
            System.out.println("CORRESPONDE EL 20% A LA BOLSA IGUAL A: "+"$"+porce20);

        } else if (donacion<=9999) {
            porce25 = donacion * 0.25;
            porce60 = donacion * 0.60;
            porce15 = donacion * 0.15;
            System.out.println("LA CANTIDAD DE LA DONACION ES DE: "+ donacion+ " POR LO TANTO:");
            System.out.println("CORRESPONDE EL 25% AL CENTRO DE SALUD IGUAL A: "+ "$"+porce25);
            System.out.println("CORRESPONDE EL 60% AL COMEDOR DE NIÑOS IGUAL A: "+ "$"+porce60);
            System.out.println("CORRESPONDE EL 15% A LA BOLSA IGUAL A: "+"$"+porce15);

        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
