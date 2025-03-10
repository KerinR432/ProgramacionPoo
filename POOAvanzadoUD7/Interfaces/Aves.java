package POOAvanzadoUD7.Interfaces;

public class Aves {
    private String especies,vuela;

    public Aves(String especies, String vuela) {
        this.especies = especies;
        this.vuela = vuela;
    }
    //setters

    public void setEspecies(String especies) {
        this.especies = especies;
    }

    public void setVuela(String vuela) {
        this.vuela = vuela;
    }
    //getters

    public String getEspecies() {
        return especies;
    }

    public String getVuela() {
        return vuela;
    }

    @Override
    public String toString() {
        return "Aves{" +
                "especies='" + especies + '\'' +
                ", vuela='" + vuela + '\'' +
                '}';
    }
}
