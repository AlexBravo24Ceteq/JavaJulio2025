package com.modelo;

public class Cuenta {
    //El paquete com.modelo en este ejercicio contendra
    //las clases que modelen objetos de una "Base de datos"
    //Es decir, objetos de los cuales queremos manipular informacion

    private String nombreUsuario;
    private double saldo;
    private double saldoMin;
    private double saldoMax;
    private String tipoCuenta;

    public Cuenta() {
    }

    public Cuenta(String nombreUsuario, double saldo, double saldoMin, double saldoMax, String tipoCuenta) {
        this.nombreUsuario = nombreUsuario;
        this.saldo = saldo;
        this.saldoMin = saldoMin;
        this.saldoMax = saldoMax;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    public double getSaldoMax() {
        return saldoMax;
    }

    public void setSaldoMax(double saldoMax) {
        this.saldoMax = saldoMax;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", saldo=" + saldo +
                ", saldoMin=" + saldoMin +
                ", saldoMax=" + saldoMax +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';
    }



}
