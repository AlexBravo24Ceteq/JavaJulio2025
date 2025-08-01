package com.condicionales;

import java.util.Scanner;

public class Condicionales6_ASV {
    public static void main(String[] args) {
        /*
        6. La asociación de vinicultores tiene como política fijar un precio
        inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además
        en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
        es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un
        productor por la uva que entrega en un embarque considerando lo siguiente:
        * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de
        tamaño 1 y 30 céntimos si es de tamaño 2.
        * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
        cuando es de tamaño 2.
        Precio inicial se recibe desde teclado
         */

        Scanner entrada = new Scanner(System.in);
        double precioInicial, precioFinal = 0;
        int tamano;
        String tipo;

        System.out.println("Indique el tipo de uva que desea: ");
        tipo = entrada.nextLine();
        System.out.println("Indique el tamaño que quiere");
        tamano = entrada.nextInt();
        System.out.println("Ingrese su precio Incicial");
        precioInicial = entrada.nextDouble();

        if(tipo.equalsIgnoreCase("A")){
            if(tamano == 1){
                precioFinal = precioInicial + 0.20;
            } else if (tamano == 2) {
                precioFinal = precioInicial +0.30;
            }
            else{
                System.out.println("tamaño no existente");
            }
        }
        else if(tipo.equalsIgnoreCase("B")) {
            if(tamano == 1){
                precioFinal = precioInicial + 0.30;
            } else if (tamano == 2) {
                precioFinal = precioInicial + 0.50;
            }
            else{
                System.out.println("tamaño no existente");
            }

        }

        else {
            System.out.println("Tipo de Uva no existente");
        }

        System.out.println("El costo de las uvas es de: "+ precioFinal);


    }
}
