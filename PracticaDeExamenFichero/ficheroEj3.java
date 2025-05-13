/**3. Escribe un método “EscribeFicheroNumRandom” a la que le pasas un nombre de fichero y
 un entero y te escribe tantos números aleatorios como le hayas dicho en un fichero de texto. c */
package PracticaDeExamenFichero;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ficheroEj3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre="";
        int numero = 0,  cant = 0;
        FileWriter salida;
        System.out.println("Introduce nombre de fichero");
        nombre = in.nextLine();
        System.out.println("Introduce un numero : ");
        cant = in.nextInt();

        try{
            salida = new FileWriter(nombre+".txt");
            for (int i = 0; i <= cant; i++) {
                Random random = new Random();
                numero = random.nextInt(0,cant);
                salida.write(numero+"\n");

            }
            salida.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
