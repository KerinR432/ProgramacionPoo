package POOAvanzadoUD7;

public class AguaMineral extends Bebidas {
    private String origen;


    public AguaMineral(String ident, String marca, int litros, double precio, String origen) {
        super(ident, marca, litros, precio);
        this.origen = origen;
    }
}
