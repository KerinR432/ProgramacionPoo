package POOAvanzadoUD7;

public class Inmuebles {
    private String direccion;
    private int metrosCuadrados;
    private double precioBase;
    private String estadoInmueble;
    private int edadImueble;

    //constructor
    public Inmuebles(String direccion, int metrosCuadrados, double precioBase, String estadoInmueble, int edadImueble) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.precioBase = precioBase;
        this.estadoInmueble = estadoInmueble;
        this.edadImueble = edadImueble;
    }

    public void precioCalculado() {
        if (edadImueble < 15) {
            precioBase = precioBase - ((precioBase * 1) / 100);
        } else if (edadImueble > 15) {
            precioBase = precioBase - ((precioBase * 2) / 100);
        }
    }

    //getters
    public String getDireccion() {
        return direccion;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getEstadoInmueble() {
        return estadoInmueble;
    }

    public int getEdadImueble() {
        return edadImueble;
    }
    //setters

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void setEstadoInmueble(String estadoInmueble) {
        this.estadoInmueble = estadoInmueble;
    }
    //toString

    @Override
    public String toString() {
        return "Inmuebles" +
                "direccion: '" + direccion + '\'' +
                ", metrosCuadrados: " + metrosCuadrados + " m²" +
                ", precioBase: " + precioBase + " € " +
                ", estadoInmueble=: " + estadoInmueble + '\'' +
                ", edadImueble: " + edadImueble + " Años ";
    }
}
