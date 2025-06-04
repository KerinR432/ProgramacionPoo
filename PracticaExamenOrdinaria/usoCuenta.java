package PracticaExamenOrdinaria;

public class usoCuenta {
    public static void main(String[] args) {
        cuenta c1 = new cuenta("Kerin");
        System.out.println(c1);
        c1.Ingresar(1500);
        System.out.println("tienes: "+c1.dameCantidad());
        c1.retirar(500);
        System.out.println("tw queda: "+c1.dameCantidad());
        c1.retirar(1500);
        System.out.println(c1.dameCantidad());
        System.out.println(c1);
    }
}
