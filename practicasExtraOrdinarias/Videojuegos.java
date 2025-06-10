package practicasExtraOrdinarias;

public class Videojuegos implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregados;
    private String genero;
    private String compañia;

    public Videojuegos(){
        this.titulo = " ";
        this.horasEstimadas = 0;
        this.entregados = false;
        this.genero = " ";
        this.compañia = " ";
    }

    public Videojuegos(String titulo,int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregados = false;
        this.genero = " ";
        this.compañia = " ";
    }

    public Videojuegos(String titulo,int horasEstimadas,String genero,String compañia){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregados = false;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String toString(){
        return "[El titulo es: "+titulo+"]\n"+
                "[Las horas estimadas son: "+horasEstimadas+"]\n"+
                "[entregado: "+entregados+"]\n"+
                "[El genero es: "+genero+"]\n"+
                "[la compañia creadora es: "+compañia+"]\n";
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
