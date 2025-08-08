package com.condicionales;

import java.util.Scanner;

public class Condicionales11_FCAS {
    public static void  main(String[] args) {

        /*
        11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
        Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
        la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
        ZONA UBICACIÓN COSTO/KILOGRAMO
        1 América del Norte 24,00 euros
        2 América Central 20, 00 euros
        3 América del Sur 21,00 euros
        4 Europa 10,00 euros
        5 Asia 18,00 euros
        Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por
        cuestiones de logística y seguridad.
        Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
        de la entrega.
        */

        System.out.println("\uD835\uDCEC===============================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC==SERVICIO DE TRANSPORTE==\uD835\uDCEC");

        Scanner entrada = new Scanner(System.in);
        double Kilos;
        int Lugar;
        Double Costo;

        System.out.println("Ingrese el peso de su paquete");
        Kilos = entrada.nextDouble();

        if (Kilos > 5) {
            System.out.println("Lo lamento, su paquete excede el pesaje máximo, vuelva pronto.");
            System.out.println("====FIN DEL PROGRAMA====");
            System.out.println("\uD835\uDCEC==================================\uD835\uDCEC");
        }else{

        System.out.println("Ingrese su continente de origen, momentaneamente no hacemos envios a Africa, gracias");
        System.out.println("(America del Norte = 1, America Centra = 2, America del Sur = 3, Europa = 4, Asia = 5)");
        Lugar = entrada.nextInt();

        if (Kilos <= 5 && Lugar == 1) {
            Costo = Kilos * 24.00;
        System.out.println("Su envio costará: $ " + Costo);
        }else if (Kilos <= 5 && Lugar == 2) {
            Costo = Kilos * 20.00;
        System.out.println("Su envio costará: $ " + Costo);
        }else if (Kilos <= 5 && Lugar == 3) {
            Costo = Kilos * 21.00;
        System.out.println("Su envio costará: $ " + Costo);
        }else if (Kilos <= 5 && Lugar == 4) {
            Costo = Kilos * 10.00;
        System.out.println("Su envio costará: $ " + Costo);
        }else if (Kilos <= 5 && Lugar == 5) {
            Costo = Kilos * 18.00;
        System.out.println("Su envio costará: $ " + Costo);
        }

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC==================================\uD835\uDCEC");
        }
    }
}
