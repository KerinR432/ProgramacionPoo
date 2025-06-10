package practicasExtraOrdinarias;

public class Serie implements Entregable{

    private String titulo;
    private int numeroDeTemporada;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(){
        this.titulo = " ";
        this.numeroDeTemporada = 0;
        this.entregado = false;
        this.genero = " ";
        this.creador = " ";
    }
    public Serie(String titulo,String creador){
        this.titulo = titulo;
        this.numeroDeTemporada = 0;
        this.entregado = false;
        this.genero = " ";
        this.creador = creador;
    }

    public Serie(String titulo ,int numeroDeTemporada,String genero,String creador){
        this.titulo = titulo;
        this.numeroDeTemporada = numeroDeTemporada;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getNumeroDeTemporada(){
        return numeroDeTemporada;
    }

    public String getGenero(){
        return genero;
    }

    public String getCreador(){
        return creador;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setNumeroDeTemporada(int numeroDeTemporada){
        this.numeroDeTemporada = numeroDeTemporada;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setCreador(String creador){
        this.creador = creador;
    }

    public String toString(){
        return "[El titulo es: "+titulo+"]\n"+
                "[las temporadas son: "+numeroDeTemporada+"]\n"+
                "[Esta entregado: "+entregado+"]\n"+
                "[El genero es: "+genero+"]\n"+
                "[El creador es: "+creador+"]\n";
    }

    @Override
    public void entregar(boolean prestado) {
        prestado = true;
    }

    @Override
    public void devolver(boolean prestado) {
        prestado = false;
    }

    @Override
    public boolean isEntregado(boolean prestado) {
        return prestado;
    }

    @Override
    public void compareTo(Object a) {

    }
}
