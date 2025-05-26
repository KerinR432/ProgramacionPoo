/**6. Escribe El método “LeeFicheroTexto” a la que le pasas un nombre de fichero y te pone el
 contenido de fichero por pantalla. Hazlo línea a línea.*/
package PracticaDeExamenFichero;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ficheroEj6 {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String nombreF = "";
        System.out.println("Introduce nombre del fichero: ");
        nombreF = in.nextLine();
        FileReader entrada;
        try{
            String tra = "";
            int cad = 0;
            entrada = new FileReader(nombreF+".txt");
            while (cad !=-1){
                cad = entrada.read();
                tra +=(char)cad;
                System.out.println(tra);
            }

            entrada.close();
        }
        catch (FileNotFoundException x){
            System.out.println("No hay datos escritos");
        } catch (IOException e){
            System.out.println("No tienes permisos");
        }
    }
}

