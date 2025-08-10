package com;

public class Principal {
    public static void main(String[] args) {

        //Para poder crear nuestra laptop
        //necesitamos crear los objetos que la acompletan

        //Creamos caracteristicas de las clases que comoponen a laptop
        Almacenamiento disco = new Almacenamiento("Kigston", "SSD",480);
        Procesador intel = new Procesador("Intel", "i5",4);
        Ram adata = new Ram("Adata","DDR4",2667);

        //Creamos nuestra lap
        Laptop hp = new Laptop("HP","44067","GOLD",disco,intel,adata);
        System.out.println(hp);

        //Aumentamos capsidad de nuestro disco duro
        Almacenamiento samsung = new Almacenamiento("SAMSUNG","M.2",1000);
        hp.setDisco(samsung);

        System.out.println(hp);

        //Que pasa si quiero crear otro procesador para otra laptop
        //que tenga 12 nucleos
        Procesador amd = new Procesador("AMD","Ryzen 5",3.5);//No se puede por constructor
        //Procesador.setNucleos(12);
        System.out.println(intel);
        System.out.println(amd);



    }
}
