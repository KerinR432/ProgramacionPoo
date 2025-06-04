package practicarEnCasa;

import java.util.Scanner;

public class UsoPersona {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        char sexo = ' ';
        double peso = 0,altura = 0;

        System.out.println("Introduce tu nombre...");
        nombre = in.nextLine();
        System.out.println("Introduce tu edad...");
        edad = in.nextInt();
        System.out.println("Introduce tu sexo...");
        in.nextLine();
        sexo = in.nextLine().charAt(0);
        System.out.println("Introduce altura...");
        altura = in.nextDouble();
        System.out.println("Introduce peso...");
        peso= in.nextDouble();

        POOBasicoPersona p1 = new POOBasicoPersona(nombre,edad,sexo,altura,peso);
        POOBasicoPersona p2 = new POOBasicoPersona(nombre,edad,sexo);
        POOBasicoPersona p3 = new POOBasicoPersona();

        p2.setPeso(peso);
        p2.setAltura(altura);
        p3.setAltura(altura);
        p3.setPeso(peso);

        System.out.println(p1.CalcularIMC());
        System.out.println(p2.CalcularIMC());
        System.out.println(p3.CalcularIMC());

        System.out.println(p1.esMayorDeEdad());
        System.out.println(p2.esMayorDeEdad());
        System.out.println(p3.esMayorDeEdad());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
