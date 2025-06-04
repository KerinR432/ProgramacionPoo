/**Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras
 separadas por espacios), realiza un programa que cuente cuantas palabras tiene. */
package practicaParaExamenUD5;

import java.util.Scanner;

public class BlEj4 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String texto = "";
        int cont = 0;

        System.out.println("Introduce una palarba");
        texto = in.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i)==' '){
                cont++;
            }
        }
        System.out.println("Tu palabra tiene: "+cont);
    }
}
