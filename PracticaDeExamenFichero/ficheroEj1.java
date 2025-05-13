/**1. Escribe un método 'EscribeFicheroNumRandom10' a la que le pasas un nombre de fichero y
 te crea un fichero con ese nombre que contiene 10 números aleatorios en diferentes líneas. */
package PracticaDeExamenFichero;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ficheroEj1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
       String nombre = "";
        FileWriter salida;
        int numeros = 0;
        System.out.println("Introduce un nombre de Fichero: ");
        nombre = in.nextLine();
        try{
            salida = new FileWriter(nombre+".txt");
            for (int i = 0; i <= 10; i++) {
                Random random = new Random();
                numeros = random.nextInt(11);
                salida.write(numeros+"\n");
            }
            salida.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
