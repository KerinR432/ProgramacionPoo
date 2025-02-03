package POOBasicoUD6;

public class UsoRaices {
    public static void main(String[] args) {
        Raices raiz1 = new Raices(1,-6,9);
        System.out.println(raiz1.getDiscriminante());
        System.out.println(raiz1.tieneRaices());
        System.out.println(raiz1.tieneRaiz());
        System.out.println(raiz1.calcular());
    }
}
