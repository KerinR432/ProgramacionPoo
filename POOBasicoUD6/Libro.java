package POOBasicoUD6;

import PooExcepcionesUD10.ExceptuonBook;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroP;
    private int calificacion;

    public Libro(String titulo, String autor, int numeroP, int calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroP = numeroP;
        setCalificacion(calificacion);
    }

    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroP() {
        return numeroP;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String toString() {
        return "titulo: " + titulo + " autor: " + autor + " numPags: " + numeroP + " calif: " + calificacion+"\n";
    }

    //SETTER
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroP(int numeroP) {
        this.numeroP = numeroP;
    }

    public void setCalificacion(int calificacion) throws ExceptuonBook {
        if (calificacion <= 0 || calificacion > 10) {
            calificacion = 0;
            throw new ExceptuonBook("Error, la calificación debe de estar compredido desde 1 a 10");
        } else {
            this.calificacion = calificacion;
        }
    }
}
