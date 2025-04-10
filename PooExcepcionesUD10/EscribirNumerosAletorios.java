package PooExcepcionesUD10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class EscribirNumerosAletorios {
    public static void main(String[] args) {
        FileWriter numAle;

        try {
            numAle = new FileWriter("NumerosAle.txt");
            for (int i = 0; i < 10; i++) {
                Random random = new Random();
                String n = ""+random.nextInt(100);
                numAle.write(n+"\n");
            }
            numAle.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
