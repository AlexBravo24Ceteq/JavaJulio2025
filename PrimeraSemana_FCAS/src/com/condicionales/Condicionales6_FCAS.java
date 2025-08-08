package com.condicionales;

import java.util.Scanner;

public class Condicionales6_FCAS {
    public static void  main(String[] args) {
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
        System.out.println("==============================");
        System.out.println("==PROGRAMA DE PRECIO DE UVAS==");

        Scanner entrada = new Scanner(System.in);
        int PrecioI;
        char Uva;
        double UvaA;
        double UvaB;
        int Tamaño;
        double Tamaño1;
        double Tamaño2;
        int kilos;
        double PrecioF;

        System.out.println("Indica el precio inicial del kilo de Uva");
        PrecioI = entrada.nextInt();
        System.out.println("¿Cuantos kilos quiere?");
        kilos = entrada.nextInt();
        System.out.println("¿Qué tipo de uva va a querer para su kilo, A o B?");
        Uva = entrada.next().toUpperCase().charAt(0);
        System.out.println("¿Qué tamaño necesita?, esta el tamaño 1 o el 2");
        Tamaño = entrada.nextInt();

        if (Tamaño == 1 && Uva == 'A'){
            PrecioF = kilos * (PrecioI + 0.20);
            System.out.println("Su precio va a ser de: $" + PrecioF);
        }else if (Tamaño == 2 && Uva == 'A'){
            PrecioF = kilos * (PrecioI + 0.30);
            System.out.println("Su precio va a ser de: $" + PrecioF);
        }else if (Tamaño == 1 && Uva == 'B'){
            PrecioF = kilos * (PrecioI - 0.30);
            System.out.println("Su precio va a ser de: $" + PrecioF);
        }else if (Tamaño == 2 && Uva == 'B'){
            PrecioF = kilos * (PrecioI - 0.50);
            System.out.println("Su precio va a ser de: $" + PrecioF);
        }

        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("==============================");





    }
}
