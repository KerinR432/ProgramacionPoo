package practicaParaExamenUD5;

import java.util.Scanner;

public class Bl1Ej3Rev {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String texto = obtenerTexto("Introduce una frase: ");
        char letra = obtenerCaracter("Introduce la letra que deseas contar: ");

        int contador = contarOcurrencias(texto, letra);

        System.out.printf("En tu texto, la letra '%c' aparece %d veces.%n", letra, contador);

        scanner.close();
    }

    private static String obtenerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    private static char obtenerCaracter(String mensaje) {
        String input;
        do {
            System.out.print(mensaje);
            input = scanner.nextLine();
            if (input.length() != 1) {
                System.out.println("Por favor, introduce solo un carácter.");
            }
        } while (input.length() != 1);
        return input.charAt(0);
    }

    private static int contarOcurrencias(String texto, char letra) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
}

