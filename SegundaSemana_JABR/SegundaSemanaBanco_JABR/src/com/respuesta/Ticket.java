package com.respuesta;

import java.util.Date;

public class Ticket {

    //En el paquete com.respuesta modelaremos los objetos que nos
    //ayudarán a responder si las acciones de la clase de la lógica
    //fueron exitosas

    private int folio;
    private Date fechaHora;
    private String usuario;
    private double saldoActualizado;
    private String sucursal;
    private int cajeroId;

    public Ticket(){}

    public Ticket(int folio, Date fechaHora, String usuario, double saldoActualizado, String sucursal, int cajeroId) {
        this.folio = folio;
        this.fechaHora = fechaHora;
        this.usuario = usuario;
        this.saldoActualizado = saldoActualizado;
        this.sucursal = sucursal;
        this.cajeroId = cajeroId;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public int getCajeroId() {
        return cajeroId;
    }

    public void setCajeroId(int cajeroId) {
        this.cajeroId = cajeroId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "folio=" + folio +
                ", fechaHora=" + fechaHora +
                ", usuario='" + usuario + '\'' +
                ", saldoActualizado=" + saldoActualizado +
                ", sucursal='" + sucursal + '\'' +
                ", cajeroId=" + cajeroId +
                '}';
    }
}
