package com.condicionales;

import java.util.Scanner;

public class Condicionales10_FCAS {
    public static void  main(String[] args) {

        /*
        10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
        mes correspondiente.
        */

        System.out.println("\uD835\uDCEC===============================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==CÁLCULO DE DÍAS DE CADA MES==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        int Mes;

        do {
            System.out.println("Hola, soy capaz de decirte cuantos días tiene cada mes, intentalo");
            System.out.println("(Señala el mes con número, ej. Enero = 1, Febrero = 2 y así respectivamente)");
            Mes = entrada.nextInt();

            switch (Mes){
                case 1:
                    System.out.println("Enero tiene 31 días");
                    break;
                case 2:
                    System.out.println("Febrero tiene 28... a menos que sea bisiesto, en tal caso tiene 29");
                    break;
                case 3:
                    System.out.println("Marzo tiene 31 días");
                    break;
                case 4:
                    System.out.println("Abril tiene 30 días");
                    break;
                case 5:
                    System.out.println("Mayo tiene 31 días");
                    break;
                case 6:
                    System.out.println("Junio tiene 30 días");
                    break;
                case 7:
                    System.out.println("Julio tiene 31 días");
                    break;
                case 8:
                    System.out.println("Agosto tiene 31 días");
                    break;
                case 9:
                    System.out.println("Septiembre tiene 30 días");
                    break;
                case 10:
                    System.out.println("Octubre tiene 31 días");
                    break;
                case 11:
                    System.out.println("Noviembre tiene 30 días");
                    break;
                case 12:
                    System.out.println("Diciembre tiene 31 días");
                    break;
                default:
                    System.out.println("Repite el mes, creo que no entendí");
            }
        } while (Mes < 1 || Mes > 12); // Aquí si ocupe el case, aunque podría haber ocupado el mismo que los 2 anteriores

        System.out.println("\uD835\uDCEC==FIN DEL PROGRAMA==\uD835\uDCEC");
        System.out.println("\uD835\uDCEC====================\uD835\uDCEC");



    }
}
