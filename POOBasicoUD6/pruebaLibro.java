package POOBasicoUD6;

public class pruebaLibro {
    public static void main(String[] args) {
        ConjuntoLibro libreria = new ConjuntoLibro();
        try {
            libreria.recibirLibro(new Libro("Vida de un venezolano", "Freddy", 150, -1));
            libreria.recibirLibro(new Libro("Poeta en New York", "Federico Garcia lorca", 150, 100));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        libreria.recibirLibro(new Libro("Cervantes", "quijote", 300, 10));
        libreria.recibirLibro(new Libro("Cervantes", "Lazarillo", 300, 9));
        libreria.recibirLibro(new Libro("Cervantes", "Freddy", 300, 8));
        String cad = libreria.toString();
        System.out.println(cad);
        System.out.println(libreria.libroConMayorCalfificacion().toString());


    }
}
