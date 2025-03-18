package POOAvanzadoUD7.Interfaces;

public class Telefono {
    private String numero;

    public Telefono(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+ "Telefono{" +
                "numero='" + numero + '\'' +
                '}';
    }
}
