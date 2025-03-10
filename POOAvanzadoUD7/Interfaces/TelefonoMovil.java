package POOAvanzadoUD7.Interfaces;

public class TelefonoMovil extends Telefono {
    private String modelo;

    public TelefonoMovil(String numero,String modelo) {
        super(numero);
        this.modelo=modelo;
    }
}
