package PooExcepcionesUD10;

public class pruebaLibro2 {
    public static void main(String[] args) {
        Libro2 libritos = null;
        try {
      libritos = new Libro2("La vida de un venezolano","Freddy bernabeu",150,11);//no rellena datos pero crea el constructor
       } catch (ExceptuonBook e) {
           System.out.println(e.getMessage());
       }
        System.out.println(libritos);


    }
}
