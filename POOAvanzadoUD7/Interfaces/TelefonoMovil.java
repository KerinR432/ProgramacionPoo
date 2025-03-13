package POOAvanzadoUD7.Interfaces;

public class TelefonoMovil extends Telefono implements Comunicador {
    private String modelo;

    public TelefonoMovil(String numero,String modelo) {
        super(numero);
        this.modelo=modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString()+"TelefonoMovil{" +
                "modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void enviaMensaje(String mensaje) {
        System.out.println("mi telefono es "+getNumero()+ "y el mensaje es "+mensaje);
    }
}
