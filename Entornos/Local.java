package Entornos;

/**
 * Clase que representa un local, que es un tipo de inmueble.
 *
 * @author Ruvik
 */
public class Local extends Inmueble {
    private int numeroVentanas;

    /**
     * Constructor de la clase Local.
     *
     * @param direccion La dirección del local.
     * @param precioBase El precio base del local.
     * @param numeroVentanas El número de ventanas del local.
     */
    public Local(String direccion, double precioBase, int numeroVentanas) {
        super(direccion, precioBase);
        this.numeroVentanas = numeroVentanas;
    }

    public int getNumeroVentanas() {
        return numeroVentanas;
    }
}

