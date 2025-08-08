package com.Arrays;

public class Arrays2_ALF {
    public static void main(String[] args) {
        /*2. Crea un array de números de 100 posiciones, que contendrá los números del
        1 al 100. Obtén la suma de todos ellos y la media.*/
        int[] numeros = new int[100];
        int sum = 0;
        // Llenar el array con los números del 1 al 100
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Calcular la suma
        for (int num : numeros) {
            sum += num;
        }

        // Calcular la media
        double media = (double) sum / numeros.length;

        // Imprimir resultados
        System.out.println("Suma: " + sum);
        System.out.println("Media: " + media);
    }
}
