package practicarEnCasa;

public class POOBasicoCuenta {
    private String titular;
    private double cantidad;
    public POOBasicoCuenta(String titular)
    {
        this.titular = titular;
    }
    public POOBasicoCuenta(String titular,double cantidad){
        this.titular=titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.cantidad +=cantidad;
        }
    }
    public void retirar(double cantidad){
        if (cantidad> this.cantidad){
            this.cantidad = 0;
        }else{
            this.cantidad-=cantidad;
        }
    }
}
