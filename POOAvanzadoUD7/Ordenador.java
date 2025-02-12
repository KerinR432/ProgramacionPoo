package POOAvanzadoUD7;

public class Ordenador {
    private String nSerie, procesador, memoria, tamPantalla;

    public Ordenador(String nSerie, String procesador, String memoria, String tamPantalla) {
        this.nSerie = nSerie;
        this.procesador = procesador;
        this.memoria = memoria;
        this.tamPantalla = tamPantalla;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getTamPantalla() {
        return tamPantalla;
    }

    public void setTamPantalla(String tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    @Override
    public String toString() {
        return "Ordenador " +
                "nSerie= '" + nSerie + '\'' +
                ", procesador= '" + procesador + '\'' +
                ", memoria= '" + memoria + '\'' +
                ", tamPantalla= '" + tamPantalla + '\'';
    }
}
