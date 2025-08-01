package com.condicionales;

import java.util.Scanner;

public class Condicionales6_ALF {
    public static void main(String[] args) {

        /*6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
        clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
        es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
        entrega en un embarque considerando lo siguiente:
        * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
        es de tamaño 2.
        * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
        tamaño 2.
        Precio inicial se recibe desde teclado*/
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva");
        System.out.println("                                                                     ");
        System.out.println("CONDICIONES PARA ASIGNAR PRECIO A LA UVA");
        System.out.println("Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1");
        System.out.println("y 30 centimos si es de tamaño 2");
        System.out.println("                                             ");
        System.out.println("Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1");
        System.out.println("y 50 centimos cuando es de tamaño 2");
        byte tamaño;
        double precioInicial, centimos, preciFinal;
        String tipoUva;
        System.out.println("Introduca el precio inial de la uva");
        precioInicial = entrada.nextDouble();
        System.out.println("Ingrese el tipo de uva A ó B");
        tipoUva = entrada.nextLine();
        entrada = new Scanner(System.in);
        System.out.println("Introdusca el tamaño 1 ó 2");
        tamaño = entrada.nextByte();
        if(tipoUva.equalsIgnoreCase("A") ){
            if(tamaño == 1){
                preciFinal = precioInicial + 2;
                System.out.println("El precio inicial es de : "+ precioInicial);
                System.out.println("Es de tipo A entonces se le agregar 20 centimos ");
                System.out.println("Por lo tanto se le agregan 2 euros al precio inicial");
                System.out.println("El precio total seria de la uva es : " + preciFinal);

            }
        }*/
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
            System.out.println("Su precio sera  de: $" + PrecioF);
        }else if (Tamaño == 2 && Uva == 'B'){
            PrecioF = kilos * (PrecioI - 0.50);
            System.out.println("Su precio final sera de : $" + PrecioF);
        }
    }
}
