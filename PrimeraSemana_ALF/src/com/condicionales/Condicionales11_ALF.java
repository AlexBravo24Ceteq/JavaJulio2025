package com.condicionales;

import java.util.Scanner;

public class Condicionales11_ALF {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        do{

            System.out.println("SERVICIO DE TRANSPORTES INTERNACIONALES");
            System.out.println("                                         ");
            System.out.println("MENU DE ZONA/UBICACION Y COSTO/KILOGRAMO");
            System.out.println("1.- AMERICAR DEL NORTE ........ 24,00 EUROS");
            System.out.println("2.- AMERICA CENTRAL    ........ 20,00 EUROS");
            System.out.println("3.- AMERICA DEL SUR     ........ 21,00 EUROS");
            System.out.println("4.- EUROPA             ........ 10,00 EUROS");
            System.out.println("5.- ASIA               ........ 18,00 EUROS");

            System.out.println("Ingresa el numero ala zona que quieres enviar tu producto");
            numero = entrada.nextInt();
            switch (numero) {
                case 1:
                    double kilos, precio;
                    System.out.println("ELEGISTE LA ZONA AMERICA DEL NORTE");
                    System.out.println("Ingresa la cantidad de kilos a enviar ");
                    kilos = entrada.nextDouble();
                    if(kilos > 5){
                        System.out.println("No puedes enviar esa cantidad por seguridad y logistica");
                    }else {
                        precio = kilos * 2400;
                        System.out.println("El precio de paquete sera de: "+precio +" euros");
                        System.out.println("Tu paquete de: "+ kilos +"kg ha sido enviado exitosamente");
                    }
                    break;
                case 2:
                    System.out.println("ELEGISTE LA ZONA AMERICA CENTRAL");
                    System.out.println("Ingresa la cantidad de kilos a enviar ");
                    kilos = entrada.nextDouble();
                    if(kilos > 5){
                        System.out.println("No puedes enviar esa cantidad por seguridad y logistica");
                    }else {
                        precio = kilos * 2000;
                        System.out.println("El precio de paquete sera de: "+precio +" euros");
                        System.out.println("Tu paquete de: "+ kilos +"kg ha sido enviado exitosamente");
                    }
                    break;
                case 3:
                    System.out.println("ELEGISTE LA ZONA AMERICA DEL SUR ");
                    System.out.println("Ingresa la cantidad de kilos a enviar ");
                    kilos = entrada.nextDouble();
                    if(kilos > 5){
                        System.out.println("No puedes enviar esa cantidad por seguridad y logistica");
                    }else {
                        precio = kilos * 2100;
                        System.out.println("El precio de paquete sera de: "+precio +" euros");
                        System.out.println("Tu paquete de: "+ kilos +"kg ha sido enviado exitosamente");
                    }
                    break;
                case 4:
                    System.out.println("ELEGISTE DE EUROPA");
                    System.out.println("Ingresa la cantidad de kilos a enviar ");
                    kilos = entrada.nextDouble();
                    if(kilos > 5){
                        System.out.println("No puedes enviar esa cantidad por seguridad y logistica");
                    }else {
                        precio = kilos * 10000;
                        System.out.println("El precio de paquete sera de: "+precio +" euros");
                        System.out.println("Tu paquete de: "+ kilos +"kg ha sido enviado exitosamente");
                    }
                    break;
                case 5:
                    System.out.println("ELEGISTE LA ZONA DE ASIA");
                    System.out.println("Ingresa la cantidad de kilos a enviar ");
                    kilos = entrada.nextDouble();
                    if(kilos > 5){
                        System.out.println("No puedes enviar esa cantidad por seguridad y logistica");
                    }else {
                        precio = kilos * 18000;
                        System.out.println("El precio de paquete sera de: "+precio +" euros");
                        System.out.println("Tu paquete de: "+ kilos +"kg ha sido enviado exitosamente");
                    }
                    break;
                default:
                    System.out.println("Ingresaste un valor incorrecto ):");
                    break;
            }

        }while (numero > 5);
    }
}
