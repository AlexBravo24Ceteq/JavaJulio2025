package com;

public class Principal {
    public static void main(String[] args) {

        Motor motorHemi = new Motor("Hemi",8,2);
        Supencion supencionAire = new Supencion("Aire",6,"muy comodo");
        Llantas LlantaMicellin = new Llantas("Michellin","Carreras",1);
        Tecnologia tecnologiaOne = new Tecnologia("IOS","Electricos","Blindado");
        Automovil hellcat = new Automovil("Hellcat Charger",2025,"Negro",motorHemi,LlantaMicellin,tecnologiaOne,supencionAire);
        System.out.println(hellcat);

    }
}
