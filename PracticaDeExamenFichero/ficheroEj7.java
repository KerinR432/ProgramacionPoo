/**
 * 7. Escribe El método “CopiaFicheroTexto” a la que le pasas dos nombres de fichero y copias el
 * contenido del primer fichero en el segundo.
 */
package PracticaDeExamenFichero;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ficheroEj7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String nombreF = "";
        String nombreF2 = "";
        String texto1 = "";
        System.out.println("Introduce nombre del fichero: ");
        nombreF = in.nextLine();
        FileWriter salida;
        FileWriter salida2;
        FileReader entrada;
        System.out.println("Introduce tu texto: ");
        texto1 = in.nextLine();
        try {
            salida = new FileWriter(nombreF + ".txt");
            salida.write(texto1);
            salida.close();
        } catch (IOException e) {
            System.out.println("Error!!!");
        }

        //copiar
        System.out.println("El fichero donde guardaste el dato es: " + nombreF);
        System.out.println();
        System.out.println("Introduce el nombre del fichero donde lo quieres copiar:  ");
        nombreF2 = in.nextLine();
        try {
            int cad = 0;
            String texto2 = "";
            entrada = new FileReader(nombreF + ".txt");
            salida2 = new FileWriter(nombreF2 + ".txt");
            while (cad != -1) {
                cad = entrada.read();
                texto2 = "" + (char) cad;
                System.out.print(texto2);
                salida2.write(texto2);
            }
            salida2.close();
            entrada.close();
        } catch (IOException e) {
            System.out.println("Error de perimisos");
        }

    }
}
