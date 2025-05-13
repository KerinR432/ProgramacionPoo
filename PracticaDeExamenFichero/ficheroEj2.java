/**2. Escribe un método “SumaFicheroInt10” a la que le pasas un fichero con 10 líneas (que
 debe contener enteros en diferentes líneas, como el del ejercicio anterior) y te devuelve la
 suma de todos los números contenidos en el fichero.*/
package PracticaDeExamenFichero;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ficheroEj2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre = "";
        FileWriter salida;
        int numeros = 0, rsdo=0;
        System.out.println("Introduce un nombre de Fichero: ");
        nombre = in.nextLine();
        try{
            salida = new FileWriter(nombre+".txt");
            for (int i = 0; i <= 10; i++) {
                Random random = new Random();
                numeros = random.nextInt(11);
                salida.write(numeros+"\n");
                rsdo+=numeros;
            }
            salida.write("\n"+rsdo);
            salida.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
