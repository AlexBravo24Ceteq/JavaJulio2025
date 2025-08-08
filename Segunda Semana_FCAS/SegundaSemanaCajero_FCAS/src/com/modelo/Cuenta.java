package com.modelo;

public class Cuenta {

    //El paquete com.modelo tendrá las clases que modelen objetos de una base de datos
    //Osea objetos que manipularan info

    private String Usuario;
    private double saldo;
    private double saldoMin;
    private double saldoMax;
    private String tipoCuenta;

    public Cuenta(){}

    public Cuenta(String usuario, double saldo, double saldoMin, double saldoMax, String tipoCuenta) {
        Usuario = usuario;
        this.saldo = saldo;
        this.saldoMin = saldoMin;
        this.saldoMax = saldoMax;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoMax() {
        return saldoMax;
    }

    public void setSaldoMax(double saldoMax) {
        this.saldoMax = saldoMax;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", Usuario='" + Usuario + '\'' +
                ", saldoMin=" + saldoMin +
                ", saldoMax=" + saldoMax +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';
    }

}
