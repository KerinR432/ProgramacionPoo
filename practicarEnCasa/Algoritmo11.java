package practicarEnCasa;

import java.util.Scanner;

public class Algoritmo11 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double promedioNota = 0, nota = 1;
        int cont = 0;
        while (nota!=0){
            System.out.println("Introduce una nota");
            nota = in.nextDouble();
            promedioNota +=nota;
            cont ++;
        }
        cont -= 1;
        promedioNota = promedioNota/cont;
        System.out.println("El promedio de la nota es: "+promedioNota);
    }
}
