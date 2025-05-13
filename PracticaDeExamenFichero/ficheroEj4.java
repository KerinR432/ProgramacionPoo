/**4. Escribe un método “SumaFicheroInt” a la que le pasas un nombre de fichero y te devuelve
 un entero resultante de sumar todos los números contenidos en el fichero (que puede tener
 tantas líneas como haga falta). */
package PracticaDeExamenFichero;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ficheroEj4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre="";
        int numero = 0,  cant = 0,rsdo=0;
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
                rsdo+=numero;

            }
            salida.write("\n"+"La cantidad total: "+rsdo);
            salida.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
