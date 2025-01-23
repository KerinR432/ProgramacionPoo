package POOBasicoUD6;

public class Cuenta {
    private String Cuenta;
    private double saldo;

    public Cuenta(String Cuenta) {
       this.Cuenta = Cuenta;
        saldo = 0;
    }

    //GETTERS

    /**
     *
     * @return esto devuelve numero cuenta
     */
    public String getNumeroCuenta() {
        return this.Cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //SETTER
    public void setAbonos(double abono) {
        saldo += abono;
    }

    public void setPagarDeuda(double deuda) {
        saldo -= deuda;
    }

    public void setTransferir(double cantidad, Cuenta Ncuenta) {
        if (cantidad > saldo) {
            cantidad = saldo;
        }
        setPagarDeuda(cantidad);
        Ncuenta.setAbonos(cantidad);

    }
    public String toString(){
        return "Numero de cuenta "+Cuenta+" Saldo: "+saldo+" ";
    }
}