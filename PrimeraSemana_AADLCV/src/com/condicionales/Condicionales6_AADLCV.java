package com.condicionales;

import java.util.Scanner;

public class Condicionales6_AADLCV {

    public static void main(String[] args) {

        /* 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
              clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
              es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
              entrega en un embarque considerando lo siguiente:
              Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
              es de tamaño 2.
              Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
              Precio inicial se recibe desde teclado.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el tipo de uva (A o B): ");
        String tipo = entrada.nextLine().toUpperCase();

        System.out.println("Ingrese el tamaño de la uva (1 o 2): ");
        int tamaño = entrada.nextInt();

        System.out.println("Ingrese los kilos de uva entregados: ");
        double kilos = entrada.nextDouble();

        double ajuste = 0.0;

        if (tipo.equals("A")) {
            if (tamaño == 1) {
                ajuste = 0.20;
            } else if (tamaño == 2) {
                ajuste = 0.30;
            }
        } else if (tipo.equals("B")) {
            if (tamaño == 1) {
                ajuste = -0.30;
            } else if (tamaño == 2) {
                ajuste = -0.50;
            }
        } else {
            System.out.println("Tipo de uva no válido.");
            entrada.close();
            return;
        }

        double precioFinalPorKilo = precioInicial + ajuste;
        double total = precioFinalPorKilo * kilos;

        System.out.println("El productor recibirá: $" + total);

    }
}
