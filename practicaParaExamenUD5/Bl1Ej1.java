/**Escribir por pantalla cada carácter de una cadena introducida por teclado.
 */
package practicaParaExamenUD5;

import java.util.Scanner;

public class Bl1Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String texto = in.nextLine();
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }

    }
}
