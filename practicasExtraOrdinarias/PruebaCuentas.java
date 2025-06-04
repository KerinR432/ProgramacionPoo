package practicasExtraOrdinarias;

public class PruebaCuentas {
    public static void main(String[] args) {
        Persona p1 = new Persona("A1234567");
        Cuentas c1 = new Cuentas(1);
        Cuentas c2 =  new Cuentas(2,700);
        p1.añadirCuenta(c1);
        p1.añadirCuenta(c2);
        c1.recibirAbono(1100);
        c2.pagarRecibo(750);
        System.out.println(p1.esMoroso());
    }
}
