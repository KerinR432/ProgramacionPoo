package POOAvanzadoUD7;

public class Profesor extends  Empleador{
    private String numeroDepartamento;

    public Profesor(String nombre, String apellidos, String dni, String estadoCivil, String añoIncorporación, int numDespacho, String numeroDepartamento) {
        super(nombre, apellidos, dni, estadoCivil, añoIncorporación, numDespacho);
        this.numeroDepartamento = numeroDepartamento;
    }
    //GETTERS

    public String getNumeroDepartamento() {
        return numeroDepartamento;
    }
    //SETTERS


    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }
    //TOSTRING


    @Override
    public String toString() {
        return super.toString()+"\n"+" El nuermo del departamentos es :"+numeroDepartamento;
    }
}
