package POOAvanzadoUD7;

public class Moto extends AutoMovil {

    private int cilindrada;

    public Moto(String matricula, String color, int year, double precioDeCompra, int cilindrada) {
        super(matricula, color, year, precioDeCompra);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calculaPrecio() {
        return this.getPrecioDeCompra()/2;
    }
}
