package POOAvanzadoUD7;

public class Coche extends AutoMovil{
    private int puertas,reudas;

    public Coche(String matricula, String color, int year, double precioDeCompra, int puertas, int reudas) {
        super(matricula, color, year, precioDeCompra);
        this.puertas = puertas;
        this.reudas = reudas;
    }

    @Override
    public double calculaPrecio() {
        if (this.getYear()>2015) {
            return this.getPrecioDeCompra();
        }else{
            return this.getPrecioDeCompra()/2;
        }
    }
}
