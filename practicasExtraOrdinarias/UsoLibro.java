package practicasExtraOrdinarias;

public class UsoLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro("1234","Quijote","Hidalgo",200);
        Libro l2 = new Libro("2345","El principito","Frech",300);

        if (l1.getNumeroDePagina()>l2.getNumeroDePagina()){
            System.out.println("el libro con mayor pagina es: "+l1.getTitulo());
        }else{
            System.out.println("el libro con mayor pagina es: "+l2.getTitulo());

        }

        System.out.println(l1);
        System.out.println(l2);
    }
}
