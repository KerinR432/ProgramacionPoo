package PooExcepcionesUD10;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirModoTexto {
    public static void main(String[] args) {
        //aqui se define el flujo de salida
        FileWriter salida;
        try {
            //construyo el canal
            salida = new FileWriter("fichero.txt");
            for (int i = 1; i <= 10; i++) {
                salida.write(i+"\n");
            }
            //cerrar el flujo o canal
            salida.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
