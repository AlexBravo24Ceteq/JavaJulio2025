package com.logica;

import com.respuesta.Producto;
import com.servicio.IMetodos;

import java.util.Map;
import java.util.Scanner;

public class Expendedora implements IMetodos {

    private int folio = 1;
    private String expendedora;
    private int cantidad;
    private int stockActualizado;
    private Map<String, Producto> productos;

    public Expendedora (){}

    public Expendedora(String expendedora, Map<String, Producto> productos) {
        this.expendedora = expendedora;
        this.productos = productos;
    }

    public String getExpendedora() {
        return expendedora;
    }

    public void setExpendedora(String expendedora) {
        this.expendedora = expendedora;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStockActualizado() {
        return stockActualizado;
    }

    public void setStockActualizado(int stockActualizado) {
        this.stockActualizado = stockActualizado;
    }

    public Map<String , Producto> getProductos() {
        return productos;
    }

    public void setProductos(Map<String, Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Expendedora{" +
                "folio=" + folio +
                ", expendedora='" + expendedora + '\'' +
                ", cantidad=" + cantidad +
                ", stockActualizado=" + stockActualizado +
                ", productos=" + productos +
                '}';
    }

    @Override
    public Producto seleccion(String numProducto, Map<String, Producto> productos) {
        Producto producto=null;
        producto = productos.get(numProducto);

        for(String product : productos.keySet()){
            if (product.equalsIgnoreCase(numProducto)){
                return producto;
            }
        }
        System.out.println("No existe este producto");;
        return producto;
    }


    @Override
    public Double pago(Producto productoSelected, double monto, int cantidadVendida) {

        double vuelto=0;
        double producto=0;
        stockActualizado = productoSelected.getStock();

        if (stockActualizado < 1){
            System.out.println("Ya no hay en stock.");
            return producto;
        }

        System.out.println("Ha ingresado: " + monto);
        if (monto < productoSelected.getCosto()){
            Scanner entrada = new Scanner(System.in);
            while(monto < productoSelected.getCosto()){
                System.out.println("Ingrese el faltante ");
                double pago = entrada.nextDouble();
                monto = pago + monto;

                System.out.println("Ha ingresado: " + monto);
            }
        }
        vuelto= monto - productoSelected.getCosto();
        productoSelected.setStock(stockActualizado - 1);
        return vuelto;
    }

}
