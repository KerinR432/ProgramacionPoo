package POOAvanzadoUD7.Interfaces;

public class PalomaMensajera extends paloma {
    private int velocidad;

    public PalomaMensajera(String especies, String vuela, String color,int velocidad) {
        super(especies, vuela, color);
        this.velocidad=velocidad;
    }
}
