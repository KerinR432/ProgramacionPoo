package POOAvanzadoUD7;

public class Pisos extends Inmuebles {
    private int pisoConcreto;
    private int numerosDePisos;

    public Pisos(String direccion, int metrosCuadrados, double precioBase, String estadoInmueble, int edadImueble, int pisoConcreto, int numerosDePisos) {
        super(direccion, metrosCuadrados, precioBase, estadoInmueble, edadImueble);
        this.pisoConcreto = pisoConcreto;
        this.numerosDePisos = numerosDePisos;
    }

    public double getPrecioBase() {
        double precioFinal=super.getPrecioBase();
        if (getMetrosCuadrados() > 50) {
            return precioFinal += (super.getPrecioBase()*0.01);
        }
        if (super.getEdadImueble() < 15) {
            precioFinal =- (super.getPrecioBase() * 0.01);
        } else if (super.getEdadImueble() > 15) {
            precioFinal =- (super.getPrecioBase() * 0.02);
        }
        if (numerosDePisos > 3) {
            return precioFinal += ((super.getPrecioBase() * 3) / 100);
        }
        return getPrecioBase();
    }
    //toString

    @Override
    public String toString() {
        return super.toString() + "Pisos " +
                "pisoConcreto: " + pisoConcreto +
                ", numerosDePisos: " + numerosDePisos + " el precio Final es: "+
                getPrecioBase() + " € ";
    }
}
