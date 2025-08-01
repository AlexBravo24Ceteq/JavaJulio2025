package com.ciclos;

public class Ciclos7_GDSA {
    public static void main(String[] args) {
        /*
        7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
        mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
        dinero?
         */
        System.out.println("»»»»»»»»»»»»»» Ejercicio 7 ««««««««««««««««««««");

        double capital=700;
        double interesMensual=0.02;
        int mes=0;
        while(capital<=1500){
            capital=capital*(1+interesMensual);
            mes++;
        }
        System.out.println("su objetivo de $1500 lo alcanza en los meses: "+mes);


        System.out.println("»»»»»»»»»»»»»» FIN ««««««««««««««««««««");
    }
}
