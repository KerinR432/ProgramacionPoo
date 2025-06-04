package Entornos;

/**
 * Clase que representa un piso, que es un tipo de inmueble.
 *
 * @author Ruvik
 */
public class Piso extends Inmueble {
    private int pisoConcreto;

    /**
     * Constructor de la clase Piso.
     *
     * @param direccion La dirección del piso.
     * @param precioBase El precio base del piso.
     * @param pisoConcreto El número del piso concreto.
     */
    public Piso(String direccion, double precioBase, int pisoConcreto) {
        super(direccion, precioBase);
        this.pisoConcreto = pisoConcreto;
    }

    public int getPisoConcreto() {
        return pisoConcreto;
    }
}

