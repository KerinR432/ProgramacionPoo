package PracticaExamenOrdinaria;

import java.util.Scanner;

public class usoPersona {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona p1 = new Persona();
        System.out.println("Introduce un nombre");
        p1.setNombre(in.nextLine());
        System.out.println("Introduce una edad");
        p1.setEdad(in.nextInt());
        in.nextLine();
        System.out.println("Introduce un sexo");
        p1.setSexo(in.nextLine().charAt(0));
        System.out.println("Introduce un peso");
        p1.setPeso(in.nextInt());
        System.out.println("Introduce un altura");
        p1.setAltura(in.nextInt());

        System.out.println(p1);
        System.out.println( p1.calcularIMC(p1.getPeso(),p1.getAltura()));
        p1.toString();
    }
}
