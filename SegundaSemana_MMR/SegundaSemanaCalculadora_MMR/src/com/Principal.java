package com;

import java.util.Objects;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cientifica cientifica = new Cientifica();
        int operacion; double valor1 = 0, valor2 = 0, valor3 = 0, resultado = 0;
        String siguiente = "";
        do {
            System.out.println("Selecciona tipo de operación a realizar: \n" +
                    "1. sumar\n" +
                    "2. restar\n" +
                    "3. multiplicar\n" +
                    "4. dividir\n" +
                    "5. raiz cuadrada\n" +
                    "6. elevar exponente\n" +
                    "* Toma en cuenta que pueden ser de 2 o 3 valores para opciones 1-4, \n " +
                    "  si solo deseas 2 valores el tercero ingresalo como -1");
            operacion = entrada.nextInt();

            //valores de consola
            System.out.println("ingresa primer valor");
            valor1 = entrada.nextDouble();
            if (operacion != 5) { //Se solicita solo si no es raiz cuadrada
                System.out.println("Ingresa segundo valor");
                valor2 = entrada.nextDouble();
            }
            if (operacion != 5 && operacion != 6) { //solo si no es raiz o exponencial
                System.out.println("Ingresa tercer valor");
                valor3 = entrada.nextDouble();
            }

            switch (operacion) { //evaluan operaciones
                case 1: //sumar
                    if (valor3 == -1)  //Si no se requiere tercer valor
                        resultado = cientifica.sumar(valor1, valor2);
                    else resultado = cientifica.sumar(valor1, valor2, valor3);
                    break;
                case 2: //restar
                    if (valor3 == -1) //Si no se requiere tercer valor
                        resultado = cientifica.restar(valor1, valor2);
                    else resultado = cientifica.restar(valor1, valor2, valor3);
                    break;
                case 3: //multiplicar
                    if (valor3 == -1) //Si no se requiere tercer valor
                        resultado = cientifica.multiplicar(valor1, valor2);
                    else resultado = cientifica.multiplicar(valor1, valor2, valor3);
                    break;
                case 4: //dividir
                    if (valor3 == -1) //Si no se requiere tercer valor
                        resultado = cientifica.dividir(valor1, valor2);
                    else resultado = cientifica.dividir(valor1, valor2, valor3);
                    break;
                case 5: //raiz cuadrada
                    resultado = cientifica.raizCuadrada(valor1);
                    break;
                case 6: //exponente
                    resultado = cientifica.exponente(valor1, valor2);
                    break;
                default:
                    System.out.println("Opción no disponible");
                    return;
            }

            System.out.println("el resultado es: " + resultado);

            System.out.println();
            System.out.print("¿Deseas otra operación? (S/N) ");

            siguiente = entrada.next();
        } while (Objects.equals(siguiente, "S"));
    }
}
