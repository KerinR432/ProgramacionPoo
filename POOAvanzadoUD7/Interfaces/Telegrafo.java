package POOAvanzadoUD7.Interfaces;

public class Telegrafo extends Reliquia {
    private String codigo;

    public Telegrafo(int year,String codigo) {
        super(year);
        this.codigo=codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Telegrafo{}";
    }
}
