package com.condicionales;

import java.util.Scanner;

public class Condicionales13_GDSA {
    public static void main(String[] args) {
        /*
        13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
        centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
        Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
        y el resto se invierte en la bolsa.
        Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
        niños y el resto se invierte en la bolsa.
        La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
         */
        System.out.println("///////////////////////////////////////////////");
        System.out.println("/PROGRAMA PARA CALCULAR EL REPARTO DE LAS /////");
        System.out.println("///////////////////DONACIONES//////////////////");
        System.out.println("///////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el monto de la donación anual : ");
        double donado = input.nextDouble();
        double salud, comedor, bolsa;
        if (donado >= 10000) {
            salud = donado * 0.30;
            comedor = donado * 0.50;
        } else {
            salud = donado * 0.25;
            comedor = donado * 0.60;
        }
        bolsa = donado - (salud + comedor);
        System.out.println("Centro de salud: $"+ salud);
        System.out.println("Comedor de niños: $"+ comedor);
        System.out.println("Inversión en la bolsa: $"+ bolsa);
        System.out.println("///////////////FIN DEL PROGRAMA///////////////");
    }
}
