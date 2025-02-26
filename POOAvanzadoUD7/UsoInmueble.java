package POOAvanzadoUD7;

import java.util.Scanner;

public class UsoInmueble {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      Inmuebles muebles1= new Inmuebles("Sol",55,1500,"Bueno",15);
        System.out.println(muebles1);
        Locales local1 = new Locales("Sol",60,1500,"Malo",20,5);
         System.out.println(local1);
         Pisos piso1 = new Pisos("Sol",40,150,"Buneo",15,5,5);
        System.out.println(piso1);
    }
}
