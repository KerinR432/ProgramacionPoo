package POOAvanzadoUD7.Interfaces;

public class Aves {
    private String especies;
    private boolean vuela;

    public Aves(String especies, boolean vuela) {
        this.especies = especies;
        this.vuela = vuela;
    }
    //setters

    public void setEspecies(String especies) {
        this.especies = especies;
    }

    //getters

    public String getEspecies() {
        return especies;
    }

    @Override
    public String toString() {
        return "Aves{" +
                "especies='" + especies + '\'' +
                ", vuela='" + vuela + '\'' +
                '}';
    }
}
