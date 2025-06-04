/**Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces
 aparece el carácter en la cadena. */
package practicaParaExamenUD5;

import java.util.Scanner;

public class Bl1Ej3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //inicializar variables
        String texto = "";
        char letra = ' ';
        int contador = 0;
        System.out.println("Introduce una frase: ");
        texto = in.nextLine();
        System.out.println("Introduce la letra que deseas contar: ");
        letra = in.nextLine().charAt(0);

        for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i)==letra){
                    contador++;
                }
        }
        System.out.println("En tu texto tu querias buscar la letra "+letra+" las veces que han aprecido es " +
                contador);
    }
}
