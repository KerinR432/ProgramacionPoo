package POOBasico;

public class EjemploArgumentos {
    public static void main(String[] args) {
        System.out.println();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        //mismo ejemplo con el foreach
        //The Example with the foreach variable nombre:nombre del arrays
        System.out.println();
        for (String cad:args){
            System.out.println(cad);
        }
    }
}

