package POOAvanzadoUD7.Interfaces;

public class PalomaMensajera extends paloma implements Comunicador {
    private double velocidad;

    public PalomaMensajera(String especies, boolean vuela, String color,double velocidad) {
        super("Mensjaera", true, "gris");
        this.velocidad=velocidad;
    }

    public double getVelocidad() {
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

    @Override
    public void enviaMensaje(String mensaje) {
        System.out.println("Soy una Paloma "+Comunicador.CTE+ "y llevo el mensaje "+mensaje);
    }
}
