package com;

public class Tecnologia {

    private String nombreSistema;
    private String tipovidrios;
    private String seguridad;

    public Tecnologia() {
    }

    public Tecnologia(String nombreSistema, String tipovidrios, String seguridad) {
        this.nombreSistema = nombreSistema;
        this.tipovidrios = tipovidrios;
        this.seguridad = seguridad;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public String getTipovidrios() {
        return tipovidrios;
    }

    public void setTipovidrios(String tipovidrios) {
        this.tipovidrios = tipovidrios;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    @Override
    public String toString() {
        return "Tecnologia{" +
                "nombreSistema='" + nombreSistema + '\'' +
                ", tipovidrios='" + tipovidrios + '\'' +
                ", seguridad='" + seguridad + '\'' +
                '}';
    }
}
