package POOAvanzadoUD7.Interfaces;

public class Telegrafo extends Reliquia {
    private String codigo;

    public Telegrafo(int year,String codigo) {
        super(year);
        this.codigo=codigo;
    }
}
