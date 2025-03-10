package POOAvanzadoUD7.Interfaces;

public class PalomaMensajera extends paloma {
    private int velocidad;

    public PalomaMensajera(String especies, String vuela, String color,int velocidad) {
        super(especies, vuela, color);
        this.velocidad=velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+ "PalomaMensajera{" +
                "velocidad=" + velocidad +
                '}';
    }
}
