package com.condicionales;

import java.util.Scanner;

public class Condicionales11_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* 11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
        Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
        la zona a la que va dirigida.

        ZONA UBICACIÓN          COSTO/KILOGRAMO
        1 América del Norte     24,00 euros
        2 América Central       20, 00 euros
        3 América del Sur       21,00 euros
        4 Europa                10,00 euros
        5 Asia                  18,00 euros

        Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por
        cuestiones de logística y seguridad.
        Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
        de la entrega.
         */
        System.out.println("==============================");
        System.out.println("=====TRANSPORTE MERCANCIA=====");
        System.out.println("============(costo)============");

        float peso, costo;
        int ubicacion;
        System.out.println("Ingresa peso del paquete");
        peso = entrada.nextFloat();

        if (peso > 5)
            System.out.println("ERROR: el paquete sobrepasa los límites establecidos");
        else {
            System.out.println("Ingrese destino:"); //solicita ubicacion
            System.out.println("1-América del Norte"); /* Describe ubicaciones disponibles */
            System.out.println("2-América Central");
            System.out.println("3-América del Sur");
            System.out.println("4-Europa");
            System.out.println("5-Asia");
            ubicacion = entrada.nextInt(); // se lee la ubicacion tecleada

            switch (ubicacion){
                case 1:
                    costo = (24 * peso);
                    break;
                case 2:
                    costo = (20 * peso);
                    break;
                case 3:
                    costo = (21 * peso);
                    break;
                case 4:
                    costo = (10 * peso);
                    break;
                case 5:
                    costo = (18 * peso);
                    break;
                default:
                    System.out.println("ERROR: Ubicación no disponible");
                    return;
            }
            System.out.println("El costo de envio del paquete es de "+costo+" euros");
        }

        System.out.println("============FIN============");
    }
}
