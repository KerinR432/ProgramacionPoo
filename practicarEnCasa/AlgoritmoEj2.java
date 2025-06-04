package practicarEnCasa;

import java.util.Scanner;

public class AlgoritmoEj2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        menu();
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a != b && a != c && b != c) {
            if (a > b) {
                if (b > c) {
                    System.out.println(a + " Es mayor y " + c + " es menor");
                } else {
                    System.out.println(a + " es mayor y " + b + " es menor");
                }
            } else if (c > b) {
                if (a > b) {
                    System.out.println(c + " es el mayor y " + b + " es menor");
                } else {
                    System.out.println(c + " es el mayor y " + a + " es menor");
                }
            } else if (b > c) {
                if (a > c) {
                    System.out.println(b + " es mayor y " + c + " es menor");
                } else {
                    System.out.println(b + " es mayor y " + a + " es menor");
                }
            } else {
                System.out.println("No tiene que ser iguales");
            }
        }
    }

    public static void menu() {
        System.out.println("Introduce un numero...");

        System.out.println("Introduce un segundo numero...");

        System.out.println("Introduce el ultimo numero...");
    }
}
