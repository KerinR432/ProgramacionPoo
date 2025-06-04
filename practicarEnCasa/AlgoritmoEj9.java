package practicarEnCasa;

import java.util.Scanner;

public class AlgoritmoEj9 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int N = 0;
        int cont = 0;
        System.out.println("Introduce un numero...");
        N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            if ((i%N)==0){
                cont ++;
            }
        }
        if (cont == 1){
            System.out.println("Es un numero primo");
        }else {
            System.out.println("No es un numero primo");
        }
    }
}
