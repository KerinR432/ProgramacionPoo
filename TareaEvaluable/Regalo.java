package TareaEvaluable;

public class Regalo {
    private String nombreRegalo;
    private double precio;
    private String descripcionR;

    public Regalo() {
        this.nombreRegalo = " ";
        this.precio = 0;
        this.descripcionR = " ";
    }


    //getters

    public String getNombreRegalo() {
        return nombreRegalo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcionR() {
        return descripcionR;
    }

    //setter

    public void setNombreRegalo(String nombreRegalo) {
        this.nombreRegalo = nombreRegalo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcionR(String descripcionR) {
        this.descripcionR = descripcionR;
    }

    //toString
    public String toString() {
        return " El Regalo de Sanvalentin es: " + nombreRegalo + "\n" + " con un precio de: " + precio + " € "
                + "\n" + " Aqui una breve descripción: " + descripcionR;
    }
}
