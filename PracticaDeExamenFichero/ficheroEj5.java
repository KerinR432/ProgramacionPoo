/**5. Escribe un método “EscribeFicheroTexto” a la que le pasas un nombre de fichero. El método
 ira pidiendo al usuario que escriba líneas de texto, que se irán guardando en el fichero, hasta
 que introduzca una línea en blanco (“”). */
package PracticaDeExamenFichero;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ficheroEj5 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String nombreF = "",texto = "";
        System.out.println("Introduce un nombre de fichero: ");
        nombreF = in.nextLine();
        //declarar escritura
        try {
            FileWriter entrada = new FileWriter(nombreF +".txt");

            System.out.println("Introduce un texto");
            while (texto != " "){
                texto=in.nextLine();
                entrada.write(texto);
            }
        }catch (IOException e){
            System.out.println("Error no tienes permisos");
        }
    }
}
