package com;

public class Canciones {

    private String género;
    private String artista;
    private int colaboradores;
    private String álbum;

    public Canciones(){

    }
    public Canciones(String género, String artista, int colaboradores, String álbum) {
        this.género = género;
        this.artista = artista;
        this.colaboradores = colaboradores;
        this.álbum = álbum;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(int colaboradores) {
        this.colaboradores = colaboradores;
    }

    public String getÁlbum() {
        return álbum;
    }

    public void setÁlbum(String álbum) {
        this.álbum = álbum;
    }

    @Override
    public String toString() {
        return "Canciones{" +
                "género='" + género + '\'' +
                ", artista='" + artista + '\'' +
                ", colaboradores=" + colaboradores +
                ", álbum='" + álbum + '\'' +
                '}';
    }
}
