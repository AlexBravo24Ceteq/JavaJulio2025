package com;

public class Ubicacion {
    private String calle;
    private String colonia;
    private String estado;

    public Ubicacion(){}

    public Ubicacion(String calle, String colonia, String estado) {
        this.calle = calle;
        this.colonia = colonia;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "calle='" + calle + '\'' +
                ", colonia='" + colonia + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
