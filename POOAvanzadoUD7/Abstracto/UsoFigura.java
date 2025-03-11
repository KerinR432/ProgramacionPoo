package POOAvanzadoUD7.Abstracto;

import java.util.ArrayList;
import java.util.Scanner;

public class UsoFigura {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];

        figuras[0]=new Circulo("circulo1",2,new Punto("centro",0,0));
        figuras[1] = new Punto("punt1",1,0);
        figuras[2] = new Cilindro("Cilindro",2,(Circulo)figuras[0]);
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Nombre "+figuras[i].getNombre());
            System.out.println("Área: "+figuras[i].obtenerArea());
            System.out.println("Volumen: "+figuras[i].obtenerVolumen());
        }
    }
}
