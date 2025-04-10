package PooExcepcionesUD10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerModoTexto {
    public static void main(String[] args) {
        FileReader entrada;
        try {
            int car=0;
            entrada = new FileReader("fichero.txt");
            while (car!=-1){
                car= entrada.read();
                System.out.print((char) car);
            }
            entrada.close();
        } catch (FileNotFoundException e) { //<-- este es él más concreto
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) { //<-- este es él más genera
            System.out.println(e.getMessage());
        }

    }
}
