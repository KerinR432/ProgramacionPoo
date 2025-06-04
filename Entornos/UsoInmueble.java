package Entornos;

/**
 * Clase principal para usar las clases de inmuebles.
 *
 * @author Ruvik
 */
public class UsoInmueble {
    public static void main(String[] args) {
        Piso piso = new Piso("Calle Falsa 123", 150000, 3);
        Local local = new Local("Avenida Siempre Viva 456", 200000, 5);
        System.out.println("Entornos.Piso: " + piso.getDireccion() + ", Precio: " + piso.getPrecioBase() + ", Entornos.Piso: " + piso.getPisoConcreto());
        System.out.println("Entornos.Local: " + local.getDireccion() + ", Precio: " + local.getPrecioBase() + ", Ventanas: " + local.getNumeroVentanas());
    }
}