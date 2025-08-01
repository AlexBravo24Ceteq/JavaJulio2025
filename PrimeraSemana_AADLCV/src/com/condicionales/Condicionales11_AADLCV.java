package com.condicionales;

import java.util.Scanner;

public class Condicionales11_AADLCV {

    /* 11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
    Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
    la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el peso del paquete en kilogramos: ");
        double peso = entrada.nextDouble();

        if (peso > 5) {
            System.out.println("El paquete no puede ser transportado (excede los 5 kg).");
        } else {
            System.out.println("Zonas disponibles:");
            System.out.println("1 - América del Norte");
            System.out.println("2 - América Central");
            System.out.println("3 - América del Sur");
            System.out.println("4 - Europa");
            System.out.println("5 - Asia");

            System.out.print("Introduce el número de zona de destino (1 a 5): ");
            int zona = entrada.nextInt();

            double costoPorKilo = 0;
            boolean zonaValida = true;

            switch (zona) {
                case 1:
                    costoPorKilo = 24.00;
                    break;
                case 2:
                    costoPorKilo = 20.00;
                    break;
                case 3:
                    costoPorKilo = 21.00;
                    break;
                case 4:
                    costoPorKilo = 10.00;
                    break;
                case 5:
                    costoPorKilo = 18.00;
                    break;
                default:
                    zonaValida = false;
                    System.out.println("ERROR: Zona no válida.");
            }

            if (zonaValida) {
                double costoTotal = peso * costoPorKilo;
                System.out.println("El costo del envío es: " + String.format("%.2f", costoTotal) + " euros.");
            }
        }
    }
}
