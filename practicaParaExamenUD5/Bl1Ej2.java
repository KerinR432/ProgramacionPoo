/**Realizar un programa que comprueba si una cadena leída por teclado comienza por una
 subcadena introducida por teclado. */
package practicaParaExamenUD5;

import java.util.Scanner;

public class Bl1Ej2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una linea de texto");
        String texto = in.nextLine();
        System.out.println("Introduce otra linea de texto: ");
        String texto2 = in.nextLine();

        String[] texto3 = texto.split(" ");

        for (int i = 0; i <texto3.length ; i++) {
            if (texto3[i].contains(texto2)){
                System.out.println("Si se parece.");
            }else{
                System.out.println("no aparece");
            }
        }

    }
}
