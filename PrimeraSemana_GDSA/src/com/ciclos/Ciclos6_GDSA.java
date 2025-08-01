package com.ciclos;

public class Ciclos6_GDSA {
    public static void main(String[] args) {
        /*6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
        mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
        todo el dinero lo reinvierte?*/
        System.out.println("»»»»»»»»»»»»»» Ejercicio 6 ««««««««««««««««««««");

        double capital=1000;
        double interesMensual=0.02;
        int mes=1;
        while(mes<=12){
            capital=capital*(1+interesMensual);
            mes++;
        }
        System.out.println("Monto Anual: "+capital);


        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
