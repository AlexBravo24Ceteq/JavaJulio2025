package com;

public class Principal {

    public static void main(String[] args) {

        //Para poder crear nuestra Lap´top, primero necesitamos
        //crear los otros objetos que formaran parte
        //de ella

        Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
        Procesador intel = new Procesador("Intel", "i5", 4);
        Ram adata = new Ram("Adata", "DDR4", 2667);

        //Ahora si puedo crear mi Laptop
        Laptop hp = new Laptop("HP", "440G7", "Plata", disco, intel, adata);

        System.out.println(hp);

        //Ejemplo, le aumento o cambio el disco duro a mi laptop
        Almacenamiento samsung = new Almacenamiento("Samsung", "M.2", 1000);
        hp.setDisco(samsung);
        System.out.println(hp);

        intel.setModelo("i17");
        System.out.println(hp);

        //Que pasa si quiero crear otro procesador, para otra
        //laptop, Pero que ahora ese procesador tenga 12 nucleos

        Procesador amd = new Procesador("AMD", "Ryzen 5", 3.5);
        //Para un solo objeto no puedo ambiar el numero de nucleos,
        //pero si paara todos los objetos d ela clase procesador
        //Procesador.setNucleos(12);
        System.out.println(intel);
        System.out.println(amd);

    }
}
