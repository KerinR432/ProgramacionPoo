package POOAvanzadoUD7;

public class Empleador extends Personas {
    private String añoIncorporación;
    private int numDespacho;
    //constructor

    public Empleador(String nombre, String apellidos, String dni, String estadoCivil, String añoIncorporación, int numDespacho) {
        super(nombre, apellidos, dni, estadoCivil);
        this.añoIncorporación = añoIncorporación;
        this.numDespacho = numDespacho;
    }
    //GETTERS

    public String getAñoIncorporación() {
        return añoIncorporación;
    }

    public int getNumDespacho() {
        return numDespacho;
    }
    //SETTERS

    public void setAñoIncorporación(String añoIncorporación) {
        this.añoIncorporación = añoIncorporación;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }
    //TOSTRING


    @Override
    public String toString() {
        return super.toString()+"\n"+"El año que se incorporo es: "+añoIncorporación+" Y el numero del " +
                "despacho es: "+numDespacho;
    }
}
