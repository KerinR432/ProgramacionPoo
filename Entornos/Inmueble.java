package Entornos;

/**
 * Clase que representa un inmueble.
 *
 * @author Ruvik
 */
public class Inmueble {
    private String direccion;
    private double precioBase;

    /**
     * Constructor de la clase Inmueble.
     *
     * @param direccion La dirección del inmueble.
     * @param precioBase El precio base del inmueble.
     */
    public Inmueble(String direccion, double precioBase) {
        this.direccion = direccion;
        this.precioBase = precioBase;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}

