package practicaParaExamenUD5;

import java.util.Scanner;

public class Bl1Ej2Rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = obtenerTexto(scanner, "Introduce una línea de texto: ");
        String subcadena = obtenerTexto(scanner, "Introduce la subcadena a buscar: ");

        if (comienzaCon(texto, subcadena)) {
            System.out.println("La cadena comienza con la subcadena.");
        } else {
            System.out.println("La cadena no comienza con la subcadena.");
        }

        scanner.close();
    }
    private static String obtenerTexto(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    private static boolean comienzaCon(String texto, String subcadena) {
        return texto.toLowerCase().startsWith(subcadena.toLowerCase());
    }
}
