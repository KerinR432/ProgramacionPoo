package POOBasicoUD6;

import java.util.Scanner;

public class EjecutablePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Password passworg1 = new Password();
        int Longitud = 0;
        String[ ] Passwords = new String[Longitud];
        System.out.println("introduce la Longitud...");
        Longitud = scanner.nextInt();
        System.out.println(passworg1.getPasword());
        Password password2 = new Password(Longitud);
        System.out.println(password2.getPasword());
        System.out.println(passworg1.esFuerte());
        System.out.println(password2.esFuerte());
    }
}
