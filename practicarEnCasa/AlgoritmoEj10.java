package practicarEnCasa;

import java.util.Scanner;

public class AlgoritmoEj10 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int H = 0;
        double km = 0;
        int M = 0;
        double mts = 0;
        System.out.println("Introduce los KM/H del vehiculo");
        km = in.nextDouble();
        H = in.nextInt();
        if (H != 0 && km != 0 && H > 0 && km > 0) {
            mts = km * 1000;
            M = H * 60;
            System.out.println("Tu coche que iba " + km + "/" + H + " va a unos " + mts + "/" + M);
        } else {
            System.out.println("No puede ser  0 o negativo");
        }

    }
}
