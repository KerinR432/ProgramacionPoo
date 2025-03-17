package ProyectoBarajas;

import java.util.ArrayList;

public class TestCarta {
    public static void main(String[] args) {
        ArrayList<Carta> c1 = new ArrayList<Carta>();

        c1.add(new Carta(1,0));
        c1.add(new Carta(2,4));
        System.out.println(c1);
        System.out.println(c1.NombreNumero());
        System.out.println(c1.NombrePalo());
        System.out.println(c1.NombreDeCarta());
    }
}
