package com.arrays;

import java.util.Arrays;

public class Arrays4_FCAS {
    public static void  main(String[] args) {

        //34. Dado un array de números de 5 posiciones con los siguientes valores:
        //{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
        //los valores invertidos, es decir, que el segundo array deberá tener los valores
        //{5,4,3,2,1}.

        System.out.println("\uD835\uDCEC====================================\uD835\uDCEC");
        System.out.println("\uD835\uDCEC===ARRAY DE 5 VALORES E INVERTIDO===\uD835\uDCEC");

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }

        System.out.print("Array invertido: ");
        for (int num : arr2) {
            System.out.print(num + " ");

        }
        System.out.println("====FIN DEL PROGRAMA====");
        System.out.println("\uD835\uDCEC====================================\uD835\uDCEC");
    }
}
