package com.Arrays;

public class Arrays4_ALF {
    public static void main(String[] args) {
        /*4. Dado un array de números de 5 posiciones con los siguientes valores:
        {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
        los valores invertidos, es decir, que el segundo array deberá tener los valores
        {5,4,3,2,1}.*/
        int[] ArrayOriginal = {1, 2, 3, 4, 5};
        int[] ArrayCopia = new int[ArrayOriginal.length];

        for (int i = 0; i < ArrayOriginal.length; i++) {
            ArrayCopia[i] = ArrayOriginal[ArrayOriginal.length - 1 - i];
        }

        // Imprimir el array invertido para verificar
        System.out.print("Array original: ");
        for (int num : ArrayOriginal) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Array invertido: ");
        for (int num : ArrayCopia) {
            System.out.print(num + " ");
        }
    }
}
