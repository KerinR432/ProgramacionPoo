package POOAvanzadoUD7;

public class Servicio extends  Empleador{
    private String seccion;

    public Servicio(String nombre, String apellidos, String dni, String estadoCivil, String añoIncorporación, int numDespacho, String seccion) {
        super(nombre, apellidos, dni, estadoCivil, añoIncorporación, numDespacho);
        this.seccion = seccion;
    }
    //GETTERS

    public String getSeccion() {
        return seccion;
    }
    //SETTERS

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    //TOSTRING

    @Override
    public String toString() {
        return super.toString()+"\n"+"La sección del personal es: "+seccion;
    }
}
