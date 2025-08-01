package com.condicionales;

import java.util.Scanner;

public class Condicionales13_ASV {

    public static void main(String[] args) {

        /*
        13. Una institución benéfica recibe anualmente una donación proveniente de Europa
        y lo reparte entre un centro de salud, un comedor de niños y una parte lo invierte
        en la bolsa de acuerdo a lo siguiente:
        Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al
        comedor de niños y el resto se invierte en la bolsa.
        Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al
        comedor de niños y el resto se invierte en la bolsa.
        La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
         */

        Scanner entrada = new Scanner(System.in);


        double donacion, donacionCentroSalud, donacionComedor, bolsa, totalDonacion;




        System.out.println("Ingrese el Monto de Donacion: ");
        donacion = entrada.nextInt();



        if(donacion > 1000){

            donacionCentroSalud = donacion * 0.30;
            donacionComedor = donacion * 0.5;






        }
        else{
            donacionCentroSalud = donacion * 0.25;
            donacionComedor = donacion * 0.60;



        }

        totalDonacion = donacionCentroSalud + donacionComedor;
        bolsa =donacion - totalDonacion;

        System.out.println("Donacion Centro de Salud: "+ donacionCentroSalud);
        System.out.println("Donacion Comedor de niños: "+ donacionComedor);
        System.out.println("Bolsa: "+ bolsa);



    }
}
