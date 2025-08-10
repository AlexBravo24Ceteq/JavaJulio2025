package com.respuesta;

import java.util.Date;

public class Ticket {

    private int folio;
    private Date fechaHora;
    private int numeroMaquina;

    public Ticket() {
    }

    public Ticket(int folio, Date fechaHora, int numeroMaquina) {
        this.folio = folio;
        this.fechaHora = fechaHora;
        this.numeroMaquina = numeroMaquina;
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

    public int getNumeroMaquina() {
        return numeroMaquina;
    }

    public void setNumeroMaquina(int numeroMaquina) {
        this.numeroMaquina = numeroMaquina;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "folio=" + folio +
                ", fechaHora=" + fechaHora +
                ", numeroMaquina=" + numeroMaquina +
                '}';
    }
}
