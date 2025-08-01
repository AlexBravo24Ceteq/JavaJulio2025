package com.condicionales;

import java.util.Scanner;

public class Condicionales11_ASV {
    public static void main(String[] args) {
        /*
        11. Una compañía de transporte internacional tiene servicio en
        algunos países de América del Norte, América Central, América del Sur,
        Europa y Asia. El costo por servicio de transporte se basa en el peso
        del paquete y la zona a la que va dirigida. Lo anterior se muestra en
        la siguiente tabla:

        ZONA UBICACIÓN            COSTO/KILOGRAMO
      América del Norte             24,00 euros
     América Central                20, 00 euros
     América del Sur                21,00 euros
     Europa                         10,00 euros
     Asia                           18,00 euros

    Parte de su política implica que los paquetes con un peso superior a 5kg no
    son transportados, por cuestiones de logística y seguridad. Realiza un algoritmo
    para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
    de la entrega.

         */

        Scanner entrada = new Scanner(System.in);

        int numDestino;
        double precio, peso;
        String zona;

        System.out.println("Catalogo de Precios por Destino");
        System.out.println("1.- América del Norte: 24,00 EUROS");
        System.out.println("2.- América Central:    20,00 EUROS");
        System.out.println("3.- América del sur:     21,00 EUROS");
        System.out.println("4.- Europa:               10,00 EUROS");
        System.out.println("5.- ASIA:                  18,00 EUROS");

        do{
            System.out.println("Ingrese el numero de la zona a enviar: ");
            numDestino = entrada.nextInt();

            switch (numDestino) {
                case 1:
                    System.out.println("Destino: América del Norte");
                    System.out.println("Ingrese el peso de su pedido: ");
                    peso = entrada.nextDouble();

                    if(peso > 5){
                        System.out.println("Peso Excedido, no Puede ser enviado");
                    }
                    else{
                        precio = peso * 2400;
                        System.out.println("El precio del Paquete es de "+ precio + " Euros");
                        System.out.println("Tu paquete ha sido enviado");
                    }
                    break;
                case 2:
                    System.out.println("Destino: América Central");
                    System.out.println("Ingrese el peso de su pedido: ");
                    peso = entrada.nextDouble();

                    if(peso > 5){
                        System.out.println("Peso Excedido, no Puede ser enviado");
                    }
                    else{
                        precio = peso * 2000;
                        System.out.println("El precio del Paquete es de "+ precio + " Euros");
                        System.out.println("Tu paquete ha sido enviado");
                    }
                    break;
                case 3:
                    System.out.println("Destino: América del Sur");
                    System.out.println("Ingrese el peso de su pedido: ");
                    peso = entrada.nextDouble();

                    if(peso > 5){
                        System.out.println("Peso Excedido, no Puede ser enviado");
                    }
                    else{
                        precio = peso * 2100;
                        System.out.println("El precio del Paquete es de "+ precio + " Euros");
                        System.out.println("Tu paquete ha sido enviado");
                    }
                    break;
                case 4:
                    System.out.println("Destino: Europa");
                    System.out.println("Ingrese el peso de su pedido: ");
                    peso = entrada.nextDouble();

                    if(peso > 5){
                        System.out.println("Peso Excedido, no Puede ser enviado");
                    }
                    else{
                        precio = peso * 1000;
                        System.out.println("El precio del Paquete es de "+ precio + " Euros");
                        System.out.println("Tu paquete ha sido enviado");
                    }
                    break;
                case 5:
                    System.out.println("Destino: Asia");
                    System.out.println("Ingrese el peso de su pedido: ");
                    peso = entrada.nextDouble();

                    if(peso > 5){
                        System.out.println("Peso Excedido, no Puede ser enviado");
                    }
                    else{
                        precio = peso * 1800;
                        System.out.println("El precio del Paquete es de "+ precio + " Euros");
                        System.out.println("Tu paquete ha sido enviado");
                    }
                    break;
                default:
                    System.out.println("Destino No existente");
                    break;

            }


        }while(numDestino > 5);


    }
}
