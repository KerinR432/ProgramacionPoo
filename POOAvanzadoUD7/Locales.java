package POOAvanzadoUD7;

public class Locales extends Inmuebles {
    private int numeroVentanas;

    public Locales(String direccion, int metrosCuadrados, double precioBase, String estadoInmueble, int edadImueble, int numeroVentanas) {
        super(direccion, metrosCuadrados, precioBase, estadoInmueble, edadImueble);
        this.numeroVentanas = numeroVentanas;
    }

    public double getPrecioBase() {
        double precioFinal=super.getPrecioBase();
        if (getMetrosCuadrados() > 50) {
            return precioFinal += (super.getPrecioBase()*0.01);
        }
        if (numeroVentanas <= 1) {
            return precioFinal -= (super.getPrecioBase() *0.02);
        }
        if (numeroVentanas > 4) {
            return precioFinal += (super.getPrecioBase() *0.02);
        }
        if (super.getEdadImueble() < 15) {
            precioFinal =- (super.getPrecioBase() * 0.01);
        } else if (super.getEdadImueble() > 15) {
            precioFinal =- (super.getPrecioBase() * 0.02);
        }
        return super.getPrecioBase();
    }
    //toSting

    @Override
    public String toString() {
        return super.toString() + " Locales " +
                " numeroVentanas: " + numeroVentanas+" Precio Final "+getPrecioBase()+" Euros ";
    }
}
