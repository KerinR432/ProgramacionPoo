package PooExcepcionesUD10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirModoTexto2 {
    public static void main(String[] args) {
        //aquí se define el flujo de salida
        FileWriter salida2;
        FileReader entrada = null;
        try {
            //construyo el canal
            int car = 0;
            salida2 = new FileWriter("fichero2.txt");
            entrada = new FileReader("fichero.txt");
            while (car!=-1){
                car = entrada.read();
                salida2.write((char)car);
                System.out.print((char) car);
            }

            //cerrar el flujo o canal
            salida2.close();
            entrada.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
