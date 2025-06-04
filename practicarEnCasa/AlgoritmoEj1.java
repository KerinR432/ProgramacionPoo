package practicarEnCasa;

import java.util.Scanner;

public class AlgoritmoEj1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        esMayor();

    }

    public static void esMayor() {
        int num1;
        int num2;
        System.out.println("Introduce un numero");
        num1 = in.nextInt();
        System.out.println("Introduce otro numero");
        num2 = in.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " es mayor");
        } else {
            System.out.println(num2 + " es mayor");
        }
    }

}
