package com.respuesta;

import java.util.Date;

public class Ticket {
    private int folio;
    private Date fechaHora;
    private int maquinaId;


    public Ticket() {
    }

    public Ticket(int folio, Date fechaHora, int maquinaId) {
        this.folio = folio;
        this.fechaHora = fechaHora;
        this.maquinaId = maquinaId;
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

    public int getMaquinaId() {
        return maquinaId;
    }

    public void setMaquinaId(int maquinaId) {
        this.maquinaId = maquinaId;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "folio=" + folio +
                ", fechaHora=" + fechaHora +
                ", maquinaId=" + maquinaId +
                '}';
    }
}
