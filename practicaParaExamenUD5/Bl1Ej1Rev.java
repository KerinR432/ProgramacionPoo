package practicaParaExamenUD5;

import java.util.Scanner;

public class Bl1Ej1Rev {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            // Mensaje de bienvenida
            System.out.println("===================================");
            System.out.println("¡Bienvenido al programa de caracteres!");
            System.out.println("===================================");

            // Solicitar al usuario que introduzca una cadena
            System.out.print("Por favor, introduce un texto: ");
            String texto = in.nextLine();

            // Comprobar si la cadena está vacía
            if (texto.isEmpty()) {
                System.out.println("No has introducido ningún texto. Por favor, intenta de nuevo.");
            } else {
                // Imprimir cada carácter de la cadena
                System.out.println("\nLos caracteres de la cadena son:");
                for (int i = 0; i < texto.length(); i++) {
                    System.out.println("Carácter " + (i + 1) + ": " + texto.charAt(i));
                }
            }

            // Mensaje de despedida
            System.out.println("\n¡Gracias por usar el programa!");
            System.out.println("===================================");

            in.close(); // Cerrar el escáner para evitar fugas de recursos
    }
}

