package com;

public class Principal {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>PANTALLA DE PERSONAJES<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        Personaje Libia = new Personaje("Libia", 3, 120, "Femenino");
        System.out.println(Libia);
        System.out.println("Líbia, elige ser: Mago");

        Libia = new Mago("Libia", 3, 120,"Femenino", 245,60,77);
        System.out.println(Libia);

        Guerrero Yao = new Guerrero("Yao", 4, 190, "Masculino", 80, 115, 44.5);
        System.out.println(Yao);

        Asesino Marco = new Asesino("Marco", 1, 75, "Masculino",20, 30, 20);
        System.out.println(Marco);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
