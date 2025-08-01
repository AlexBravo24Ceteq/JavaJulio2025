package com.condicionales;

import java.util.Scanner;

public class Condicionales2_AADLCV {

    public static void main(String[] args) {

        // 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.

        System.out.println("=========================================================");
        System.out.println("=== PROGRAMA PARA EVALUAR SI UN NUMERO ES PAR O IMPAR ===");
        System.out.println("=========================================================");

        // Para ingresar el número necesitamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Mandamos un mensaje en consola para poder solicitar el número
        System.out.println("Ingresa un número");
        int numero = entrada.nextInt();

        // Usamos el operador módulo para saber si es par o impar, se utiliza 2 para dividir el número y 0
        // para que no haya residuo
        if (numero % 2 == 0){
            System.out.println("El número es PAR");
        }else{
            System.out.println("El número es IMPAR");
        }

        System.out.println("========== FIN DEL PROGRAMA ===========");

    }
}
