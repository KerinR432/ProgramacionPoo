package practicaParaExamenUD5;

import java.util.Scanner;

public class BlEj4Rev {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String texto = obtenerTexto("Introduce una frase: ");
        int contadorPalabras = contarPalabras(texto);

        System.out.printf("La frase tiene %d palabras.%n", contadorPalabras);

        scanner.close();
    }
    private static String obtenerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    private static int contarPalabras(String texto) {
        if (texto.trim().isEmpty()) {
            return 0; // Si la cadena está vacía o solo tiene espacios, no hay palabras.
        }

        String[] palabras = texto.trim().split("\\s+"); // Divide la cadena en palabras usando espacios como delimitadores.
        return palabras.length; // Devuelve el número de palabras.
    }
}
