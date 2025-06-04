package practicarEnCasa;

import java.util.Scanner;

public class AlgoritmoEJ6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        numeroParEImpar();
    }

    public static void numeroParEImpar() {
        int N = 0;
        System.out.println("Introduce un numero...");
        N = in.nextInt();
        if ((N % 2) == 0) {
            System.out.println(N + " Es el numero Par");
        } else {
            System.out.println(N + " Es un numero Impar");
        }
    }
}
