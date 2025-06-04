package practicarEnCasa;

import POOBasicoUD6.Password;

import java.util.Scanner;

public class POOBasicoUsoPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Tamaño del array");
        int tamaño = in.nextInt();
        POOBasicoPassword [] contraseñas = new POOBasicoPassword[tamaño];
        boolean [] esFuerte = new boolean[tamaño];
        System.out.println("Introduce la longitud de tu contraseña");
        int log = in.nextInt();
        for (int i = 0; i <= contraseñas.length; i++) {
            contraseñas[i] = new POOBasicoPassword(log);
            esFuerte[i] = contraseñas[i].esFuerte();
            System.out.println(contraseñas[i].getContraseña());
            System.out.println(esFuerte[i]);

        }
    }
}
