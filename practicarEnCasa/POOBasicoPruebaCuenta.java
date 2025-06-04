package practicarEnCasa;

public class POOBasicoPruebaCuenta {
    public static void main(String[] args) {
        POOBasicoCuenta c1 = new POOBasicoCuenta("A12345");
        POOBasicoCuenta c2 = new POOBasicoCuenta("A23456",100);
        c1.ingresar(110.10);
        c2.ingresar(110.10);

        c1.retirar(25.3);
        c2.retirar(25.3);

        System.out.println(c1.getCantidad());
        System.out.println(c2.getCantidad());
    }
}
