package practicasExtraOrdinarias;

public class Cuentas {
    private int numeroCuenta;
    private double saldo;

    public Cuentas (int nCuenta){
        this.numeroCuenta = nCuenta;
        this.saldo = 0;
    }

    public Cuentas (int nCuenta,double saldo){
        this.numeroCuenta = nCuenta;
        this.saldo = saldo;
    }
    public double consultarSaldo(){
        return saldo;
    }
    public void pagarRecibo(double pago){
        saldo = saldo - pago;
    }
    public void recibirAbono (double abono){
        saldo = saldo + abono;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
