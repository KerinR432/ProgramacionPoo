package PooExcepcionesUD10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mayorEdad {
    public static void main(String[] args) {
        FileReader entrada;
        String nombre = "";
        String [] nombres = new String[5];
        try {
            entrada = new FileReader("Nombres.txt");
            int cad = 0;
            while (cad!=-1){
                cad = entrada.read();
                    nombre +=(char)cad;

            }
            for(String nombre2 : nombres){
                System.out.println(nombre2);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Esta vacio");
        } catch (IOException e) {
            System.out.println("No tienes permisos");
        }
    }
}
