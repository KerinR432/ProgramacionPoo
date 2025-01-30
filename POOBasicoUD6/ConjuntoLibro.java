package POOBasicoUD6;

public class ConjuntoLibro {
    //atributos
    private Libro[] conjuntoL;
    private final int TAM = 10;
    private int numLibros;

    //constructor
    public ConjuntoLibro() {
        conjuntoL = new Libro[TAM];
        numLibros = 0;
    }

    //GETTERS

    /**
     * @param numero aqui creamos una get para mostrar la calificación
     * @return
     */
    public Libro getMostrarCalificicion(int numero) {
        return conjuntoL[numero];
    }

    public String toString() {
        String cad = "";
        for (int i = 0; i < conjuntoL.length; i++) {
            if (conjuntoL[i] != null) {
                cad += conjuntoL[i].toString();
            }
        }
        return cad;
    }


    //SETTERS
    public boolean recibirLibro(Libro libros) {
        if (numLibros >= TAM) {
            for (int i = 0; i < conjuntoL.length; i++) {

            }
        }
        if (!libroNoExiste(libros)) {
            return false;
        }
        for (int i = 0; i < TAM; i++) {
            if (conjuntoL[i] == null) {
                conjuntoL[i] = libros;
                numLibros++;
                return true;
            }
        }
        return true;

    }

    private boolean libroNoExiste(Libro libro) {
        for (int i = 0; i < TAM; i++) {
            if (conjuntoL[i] != null) {
                String autor = conjuntoL[i].getAutor();
                String titulo = conjuntoL[i].getTitulo();
                if (libro.getAutor().equalsIgnoreCase(autor) && libro.getTitulo().equalsIgnoreCase(titulo)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean eliminarLibroPorTitulo(String tit) {
        boolean libroEliminado = false;
        for (int i = 0; i < TAM; i++) {
            if (conjuntoL[i] != null) {
                if (conjuntoL[i].getTitulo().equalsIgnoreCase(tit)) {
                    conjuntoL[i] = null;
                    numLibros--;
                    libroEliminado = true;
                }
            }
        }
        return libroEliminado;
    }

    public Libro libroConMayorCalfificacion() {
        int posMayor = dondeEstaElPrimerLibro();
        if (posMayor == -1) {
            return null;
        }
        for (int i = posMayor; i < TAM; i++) {
            if (conjuntoL[i] != null) {
                if (conjuntoL[posMayor].getCalificacion() < conjuntoL[i].getCalificacion()) {
                    posMayor = i;
                }
            }
        }
        return conjuntoL[posMayor];
    }

    public Libro libroConMenorCalfificacion() {
        int posMenor = dondeEstaElPrimerLibro();
        if (posMenor == -1) {
            return null;
        }
        for (int i = posMenor; i < TAM; i++) {
            if (conjuntoL[i] != null) {
                if (conjuntoL[posMenor].getCalificacion() > conjuntoL[i].getCalificacion()) {
                    posMenor = i;
                }
            }
        }
        return conjuntoL[posMenor];
    }

    private int dondeEstaElPrimerLibro() {
        for (int i = 0; i < TAM; i++) {
            if (conjuntoL[i] != null) {
                return i;
            }
        }
        return -1;//libreria vacia
    }
}
