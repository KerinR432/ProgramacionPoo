package POOBasicoUD6;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroP;
    private int calificación;
    public Libro(String titulo,String autor,int numeroP, int calificación){
        this.titulo=titulo;
        this.autor=autor;
        this.numeroP=numeroP;
        this.calificación=calificación;
    }
    //GETTERS
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getNumeroP(){
        return numeroP;
    }
    public int getCalificación(){
        return calificación;
    }
    //SETTER
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setNumeroP(int numeroP){
        this.numeroP=numeroP;
    }
    public void setTitulo(int calificación){
        this.calificación=calificación;
    }
}
