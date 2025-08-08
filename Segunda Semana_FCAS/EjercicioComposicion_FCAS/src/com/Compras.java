package com;

public class Compras {

    //Propias
    private String anotación;
    private String hoja;
    private String color;

    //Compras
    private Fruta Fruta1;
    private Lacteos Lacteos1;
    private Carne Carnes;
    private Bebidas líquidos;

    public Compras(){}

    public Compras(String anotación, String hoja, String color, Fruta fruta1, Lacteos lacteos1, Carne carnes, Bebidas líquidos) {

        this.anotación = anotación;
        this.hoja = hoja;
        this.color = color;
        Fruta1 = fruta1;
        Lacteos1 = lacteos1;
        Carnes = carnes;
        this.líquidos = líquidos;
    }

    public String getAnotación() {
        return anotación;
    }

    public void setAnotación(String anotación) {
        this.anotación = anotación;
    }

    public String getHoja() {
        return hoja;
    }

    public void setHoja(String hoja) {
        this.hoja = hoja;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruta getFruta1() {
        return Fruta1;
    }

    public void setFruta1(Fruta fruta1) {
        Fruta1 = fruta1;
    }

    public Lacteos getLacteos1() {
        return Lacteos1;
    }

    public void setLacteos1(Lacteos lacteos1) {
        Lacteos1 = lacteos1;
    }

    public Carne getCarnes() {
        return Carnes;
    }

    public void setCarnes(Carne carnes) {
        Carnes = carnes;
    }

    public Bebidas getLíquidos() {
        return líquidos;
    }

    public void setLíquidos(Bebidas líquidos) {
        this.líquidos = líquidos;
    }

    @Override
    public String toString() {
        return "Compras ->" +
                "Donde anoté: " + anotación + '\n' +
                "Tipo de hoja: " + hoja + '\n' +
                "Color de pluma: " + color + '\n' +
                "Fruta: " + Fruta1 + '\n' +
                "Lacteos: " + Lacteos1 + '\n' +
                "Carnes: " + Carnes + '\n' +
                "Líquidos: " + líquidos +
                '}';
    }
}