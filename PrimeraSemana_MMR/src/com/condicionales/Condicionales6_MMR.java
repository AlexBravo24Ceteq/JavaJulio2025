package com.condicionales;

import java.util.Scanner;

public class Condicionales6_MMR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
            clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
            es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
            entrega en un embarque considerando lo siguiente:
            * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
            es de tamaño 2.
            * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
            tamaño 2.
            Precio inicial se recibe desde teclado
         */
        System.out.println("================================");
        System.out.println("==========VENTA DE UVA==========");
        System.out.println("======(Monto total de UVA)======");

        String tipoUva = "";
        int tamañoUva;
        float precioIni, precioFin = 0, kiloUva;
        System.out.println("Ingrese tipo de la uva (A - B)");
        tipoUva = entrada.nextLine();
        System.out.println("Ingrese tamaño de la uva (1 - 2)");
        tamañoUva = entrada.nextInt();
        System.out.println("Ingrese cantidad de uva entregada en Kilos");
        kiloUva = entrada.nextFloat();
        System.out.println("Ingrese precio inicial por kilo de uva");
        precioIni = entrada.nextFloat();

        if ((tipoUva.equals("A")) && (tamañoUva == 1)) {
            precioFin = (float) (precioIni + .20);
        } else if ((tipoUva.equals("A")) && (tamañoUva == 2)) {
            precioFin = (float) (precioIni + .30);
        } else if ((tipoUva.equals("B")) && (tamañoUva == 1)) {
            precioFin = (float) (precioIni - .30);
        } else if ((tipoUva.equals("B")) && (tamañoUva == 2)) {
            precioFin = (float) (precioIni - .50);
        }

        if (precioFin != 0) {
            System.out.println("El costo final de la uva es de " + precioFin);
            System.out.println("Costo total a pagar por la uva es de " + (precioFin * kiloUva));
        } else {
            System.out.println("No existe condición de pago para los datos ingresados");
        }
        System.out.println("============FIN============");
    }
}
