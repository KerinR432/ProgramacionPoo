package practicasExtraOrdinarias;

public class Libro {
    private String ISBN;
    private String titulo;
    private String  autor;
    private int numeroDePagina;

    public Libro(){
        this.ISBN = " ";
        this.titulo = " ";
        this.autor = " ";
        this.numeroDePagina = 0;
    }

    public Libro(String ISBN,String titulo,String autor,int numeroDePagina){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePagina = numeroDePagina;
    }

    public String getISBN(){
        return ISBN;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNumeroDePagina(){
        return numeroDePagina;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setNumeroDePagina(int numeroDePagina){
        this.numeroDePagina = numeroDePagina;
    }

    public String  toString(){
        return "El libro "+titulo+" con el ISBN "+ISBN+" creado por el autor "+autor+" tiene "+numeroDePagina+" paginas";
    }
}
