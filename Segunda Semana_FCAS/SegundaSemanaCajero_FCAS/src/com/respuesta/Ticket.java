package com.respuesta;

import java.util.Date;

public class Ticket {

    private int folio;
    private Date fechaHora;
    private String usuario;
    private double saldoActualizado;
    private int cajeroId;
    private String sucursal;

    public Ticket(int cajeroId, Date fechaHora, int folio, double saldoActualizado, String sucursal, String usuario) {
        this.cajeroId = cajeroId;
        this.fechaHora = fechaHora;
        this.folio = folio;
        this.saldoActualizado = saldoActualizado;
        this.sucursal = sucursal;
        this.usuario = usuario;
    }

    public int getCajeroId() {
        return cajeroId;
    }

    public void setCajeroId(int cajeroId) {
        this.cajeroId = cajeroId;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public double getSaldoActualizado() {
        return saldoActualizado;
    }

    public void setSaldoActualizado(double saldoActualizado) {
        this.saldoActualizado = saldoActualizado;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "cajeroId=" + cajeroId +
                ", folio=" + folio +
                ", fechaHora=" + fechaHora +
                ", usuario='" + usuario + '\'' +
                ", saldoActualizado=" + saldoActualizado +
                ", sucursal='" + sucursal + '\'' +
                '}';
    }
}
