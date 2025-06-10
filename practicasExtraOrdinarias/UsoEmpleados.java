package practicasExtraOrdinarias;

public class UsoEmpleados {
    public static void main(String[] args) {
        Repartidor em1 = new Repartidor("Frank",18,150,"zona 3");
        Repartidor em2 = new Repartidor("Mauricio",60,1500,"zona 3");
        Repartidor em3 = new Repartidor("Maquiel",58,1100,"zona 1");
        Comercio em4 = new Comercio("Frank",18,150,50);
        Comercio em5 = new Comercio("Mauricio",60,1500,500);
        Comercio em6 = new Comercio("Maquiel",58,1100,190);

        System.out.println(em1);
        System.out.println(em1.Salario());
        System.out.println(em2);
        System.out.println(em2.Salario());
        System.out.println(em3);
        System.out.println(em3.Salario());
        System.out.println(em4);
        System.out.println(em4.Salario());
        System.out.println(em5);
        System.out.println(em5.Salario());
        System.out.println(em6);
        System.out.println(em6.Salario());

    }
}
