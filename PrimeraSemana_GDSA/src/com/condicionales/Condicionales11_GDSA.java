package com.condicionales;

import java.util.Scanner;

public class Condicionales11_GDSA {
    public static void main(String[] args) {
        /*
        11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
        Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
        la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
        ZONA UBICACIÓN COSTO/KILOGRAMO
        1 América del Norte -v24,00 euros
        2 América Central - 20, 00 euros
        3 América del Surv -  21,00 euros
        4 Europa -  10,00 euros
        5 Asia - 18,00 euros
        Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por
        cuestiones de logística y seguridad.
        Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
        de la entrega.
         */
        System.out.println("///////////////////////////////////////////////");
        System.out.println("/ PROGRAMA PARA CALCULAR COSTO DE TRASPORTE ///");
        System.out.println("///////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el peso del paquete en kilogramos: ");
        double peso = input.nextDouble();
        if (peso > 5) {
            System.out.println("El paquete no puede ser transportado el peso es superior a 5 kg.");
        } else if (peso <= 0) {
            System.out.println("ERROR: El peso debe ser mayor que 0.");
        } else {
            System.out.println("Zonas disponibles:");
            System.out.println("(1) - América del Norte");
            System.out.println("(2) - América Central");
            System.out.println("(3) - América del Sur");
            System.out.println("(4) - Europa");
            System.out.println("(5) - Asia");
            System.out.print("Introduce el número de zona (1 a 5): ");
            int zona = input.nextInt();
            double costoKilo;
            switch (zona) {
                case 1:
                    costoKilo = 24.00;
                    break;
                case 2:
                    costoKilo = 20.00;
                    break;
                case 3:
                    costoKilo = 21.00;
                    break;
                case 4:
                    costoKilo = 10.00;
                    break;
                case 5:
                    costoKilo = 18.00;
                    break;
                default:
                    System.out.println("ERROR: Zona no válida.");
                    input.close();
                    return;
            }

            double costoTotal = peso * costoKilo;
            System.out.print("El costo total del envío es: $"+costoTotal);
            System.out.println("///////////////FIN DEL PROGRAMA///////////////");
        }
    }
}
