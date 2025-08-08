package com;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>°<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>CALCULADORA<<<<<<<<<<<<<<<<<<<<<<<<<<");
        Calculadora C1 = new Científica();
        System.out.println(C1);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu operación, de a dos números");
        System.out.println("Separa con espacios, gracias");

        String operación = entrada.nextLine();

        String[] partes = operación.split(" ");
        double resultado = Double.parseDouble(partes[0]);

        if (operación.contains("^")){
            String[] expoPartes = operación.split("\\^");
            double base = Double.parseDouble(expoPartes[0]);
            double exponente = Double.parseDouble(expoPartes[1]);
            resultado = C1.EXPO(base, exponente);
        } else if (operación.equals("raiz") || operación.startsWith("√")) {
            double numero = Double.parseDouble(operación.substring(1));
            resultado = C1.RAIZ(numero);
        } else {
            for (int i = 1; i < partes.length; i += 2) {
            String operador = partes[i];
            double numero = Double.parseDouble(partes[i + 1]);

            switch (operador) {
                case "+": resultado = C1.SUMAR(resultado, numero); break;
                case "-": resultado = C1.RESTA(resultado, numero); break;
                case "*": resultado = C1.MULTIPLICAR(resultado, numero); break;
                case "/": resultado = C1.DIVIDIR(resultado, numero); break;
                default:
                    System.out.println("No es valido");
                    return;
                }
            }
        }
    System.out.println(operación + " = " + resultado);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>FIN<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>°<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
