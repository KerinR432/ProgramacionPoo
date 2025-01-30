package POOBasicoUD6;

public class pruebaLibro {
    public static void main(String[]args){
        ConjuntoLibro libreria = new ConjuntoLibro();
        libreria.recibirLibro(new Libro("Cervantes","quijote",300,10));
        libreria.recibirLibro(new Libro("Cervantes","Lazarillo",300,9));
        libreria.recibirLibro(new Libro("Cervantes","Freddy",300,8));

        String cad=libreria.toString();
        System.out.println(cad);
        System.out.println(libreria.libroConMayorCalfificacion().toString());
    }
}
