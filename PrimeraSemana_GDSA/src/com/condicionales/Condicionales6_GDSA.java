package com.condicionales;

import java.util.Scanner;

public class Condicionales6_GDSA {
    public static void main(String[] args) {
        /*
        6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
            clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
            es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
            entrega en un embarque considerando lo siguiente:
            * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
            es de tamaño 2.
            * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
            tamaño 2.
            Precio inicial se recibe desde teclado
         */
        System.out.println("///////////////////////////////////////////////");
        System.out.println("/PROGRAMA PARA CALCULAR EL PAGO A VINICULTORES/");
        System.out.println("/// POR CLASIFICACION DE TAMAÑO Y TIPO ////////");
        System.out.println("//////////////////////////////////////////////");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tipo de uva (A o B): ");
        String tip = input.nextLine().toUpperCase();
        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
        int tam = input.nextInt();
        System.out.print("Ingrese el precio inicial por kilo: ");
        double precioInicial = input.nextDouble();
        System.out.print("Ingrese la cantidad de kilos del embarque: ");
        double kg = input.nextDouble();
        double ajustador = 0;
        if (tip.equals("A")) {
            if (tam == 1) {
                ajustador = 0.20;
            } else if (tam == 2) {
                ajustador = 0.30;
            } else {
                System.out.println("Tamaño inválido.");
            }
        } else if (tip.equals("B")) {
            if (tam == 1) {
                ajustador = -0.30;
            } else if (tam == 2) {
                ajustador = -0.50;
            } else {
                System.out.println("Tamaño inválido.");
            }
        } else {
            System.out.println("Tipo de uva inválido.");
        }
        double precioFinalPorKg = precioInicial + ajustador;
        double totalAPagar = precioFinalPorKg * kg;
        System.out.println("El vinicultor recibirá: $ "+totalAPagar);

        System.out.println("///////////////FIN DEL PROGRAMA///////////////");
    }
}
